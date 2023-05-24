package servletCrud;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class crudServlet extends HttpServlet {
        private Server server;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("ciao");
        PrintWriter out = response.getWriter();
        response.setContentType("application/json;charset=UTF-8");
        String[] parts = request.getRequestURI().split("/");
        System.out.println(Arrays.toString(parts));

        Gson gson = new Gson();

        if (parts.length >= 2 && parts.length <= 4) {
            try {
                if (parts.length == 4) {
                    if(parts[2].equals("studente")) {
                        int id = Integer.parseInt(parts[3]);
                        Studente studente = server.selectStudent(id);
                        if (studente != null) {
                            out.write(gson.toJson(studente));
                        } else {
                            response.sendError(404, "Studente non trovato");
                        }
                    } else {
                        response.sendError(400, "URL non valido");
                    }
                } else if (parts.length == 3) {
                    if(parts[2].equals("studenti")) {
                        List<Studente> studenti = server.selectStudenti();
                        if (studenti != null && !studenti.isEmpty()) {
                            out.write(gson.toJson(studenti));
                        } else {
                            response.sendError(404, "Nessuno studente trovato");
                        }
                    } else if(parts[2].equals("studente")) {
                        response.sendError(400, "Devi specificare un ID per 'studente'");
                    } else {
                        response.sendError(400, "URL non valido");
                    }
                } else {
                    // Se la lunghezza è 2, probabilmente l'utente ha fornito solo l'URL di base e quindi mostriamo le istruzioni
                    instructions(out);
                }
            } catch (NumberFormatException e) {
                response.sendError(400, "ID dello studente non valido");
            }
        } else {
            response.sendError(400, "URL non valido");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Gson gson = new Gson();
            // Leggere il corpo della richiesta e convertirlo in un oggetto Studente
            Studente s = gson.fromJson(request.getReader(), Studente.class);

            // Verifica che i campi dello Studente non siano nulli
            if (s.getNome() == null || s.getCognome() == null || s.getDataNascita() == null) {
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                response.getWriter().write("Parametri mancanti o nulli.");
                return;
            }

            // Inserimento dello studente utilizzando l'istanza server esistente
            int rowsAffected = server.insertStudent(s);

            // Risposta al client in base al successo o meno dell'operazione
            if (rowsAffected > 0) {
                response.getWriter().write("Inserimento avvenuto con successo!");
            } else {
                response.getWriter().write("Inserimento non riuscito.");
            }

        } catch (Exception e) {
            // Qualsiasi eccezione viene gestita qui
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write("Si è verificato un errore: " + e.getMessage());
        }
    }
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Leggi il corpo della richiesta come JSON
        Studente studente = new Gson().fromJson(request.getReader(), Studente.class);

        // Verifica che tutti i campi necessari siano presenti
        if (studente.getId() == 0 || studente.getNome() == null || studente.getCognome() == null || studente.getDataNascita() == null) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("Parametri mancanti o nulli.");
            return;
        }

        // Aggiorna lo studente
        int rowsUpdated = server.updateStudent(studente);

        // Risposta al client in base al successo o meno dell'operazione
        if (rowsUpdated > 0) {
            response.getWriter().write("Aggiornamento avvenuto con successo!");
        } else {
            response.getWriter().write("Aggiornamento non riuscito.");
        }
    }


        @Override
        protected void doDelete(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            String pathInfo = request.getPathInfo();
            if (pathInfo == null || pathInfo.equals("/")) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST);
                return;
            }

            String[] splits = pathInfo.split("/");
            if (splits.length != 2) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST);
                return;
            }

            int id = Integer.parseInt(splits[1]);
            server.deleteStudent(id);
        }

        @Override
        public void init() throws ServletException {
            super.init();
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("asdhgvjvc hjkbv ");
            server = new Server(getInitParameter("connectionString"));
        }



    @Override
    public String getServletInfo() {
        return "Permette di eseguire azioni CRUD sulla tabella Scuola";
    }

    private void instructions(PrintWriter out) {
        out.println("{\n\"instructions\": {\n");
        out.println("\"studente\": {\n");
        out.println("\"one\": \"applicationAddress = restcrud/studente/{id}\",\n");
        out.println("\"all\": \"applicationAddress = restcrud/studenti\"\n},");
        out.println("}\n}");
    }
}
