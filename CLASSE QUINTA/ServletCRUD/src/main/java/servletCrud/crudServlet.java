package servletCrud;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class crudServlet extends HttpServlet {

    private Server server;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("application/xml;charset=UTF-8");
        String[] parts = request.getRequestURI().split("/");
        if (parts != null && (parts.length == 4 || parts.length == 3
                || parts.length == 2)) {
            if (parts.length == 4) {
                selectOne(parts, out, response);
            } else {
                if (parts.length == 3) {
                    selectAll(parts, out, response);
                } else {
                    instructions(out);
                }
            }
        } else {
            response.sendError(400);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        insertOrUpdate(request, response, 1);
    }

    @Override
    protected void doPut(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        insertOrUpdate(request, response, 2);
    }

    @Override
    protected void doDelete(HttpServletRequest request,
                            HttpServletResponse response)
            throws ServletException, IOException {
        String[] parts = request.getRequestURI().split("/");
        if (parts != null && parts.length == 4) {
            String typeOfObject = parts[2];
            String idObject = parts[3];
            if (idObject != null) {
                int n = -1;
                try {
                    PrintWriter out = response.getWriter();
                    switch (typeOfObject) {
                        case "product":
                            n = server.deleteProduct(Integer.parseInt(idObject));
                            break;
                        case "category":
                            n = server.deleteCategory(Integer.parseInt(idObject));
                            break;
                        case "showroom":
                            n = server.deleteShowroom(Integer.parseInt(idObject));
                            break;
                    }
                    out.println("<result status=\"200\">" + n
                            + " record</result>");
                } catch (IllegalArgumentException ex) {
                    response.sendError(400);
                }
            } else {
                response.sendError(400);
            }
        } else {
            response.sendError(400);
        }
    }

    private void selectAll(String[] parts, PrintWriter out,
                           HttpServletResponse response)
            throws IOException, IllegalArgumentException {
        String typeOfObject = parts[2];
        switch (typeOfObject) {
            case "products":
                List<Product> products = server.selectProducts();
                out.println("<result status=\"200\">");
                out.println("<" + typeOfObject + ">");
                for (Product product : products) {
                    out.println(product.toXml());
                }
                out.println("</"+ typeOfObject + ">");
                out.println("</result>");
                break;
            case "categories":
                out.println("<result status=\"200\">");
                out.println("<" + typeOfObject + ">");
                List<Category> categories = server.selectCategories();
                for (Category product : categories) {
                    out.println(product.toXml());
                }
                out.println("</"+ typeOfObject + ">");
                out.println("</result>");
                break;
            case "showrooms":
                out.println("<result status=\"200\">");
                out.println("<" + typeOfObject + ">");
                List<Showroom> showrooms = server.selectShowrooms();
                for (Showroom showroom : showrooms) {
                    out.println(showroom.toXml());
                }
                out.println("</"+ typeOfObject + ">");
                out.println("</result>");
                break;
            default:response.sendError(400);
        }
    }

    private void selectOne(String[] parts, PrintWriter out,
                           HttpServletResponse response) throws IOException {
        String typeOfObject = parts[2];
        String idObject = parts[3];
        if (idObject != null) {
            try {
                switch (typeOfObject) {
                    case "product":
                        Product product = server.selectProduct(Integer.parseInt(idObject));
                        if (product != null) {
                            out.println("<result status=\"200\">");
                            out.println(product.toXml());
                            out.println("</result>");
                        } else{
                            out.println("<result status=\"200\"/>");
                        }
                        break;
                    case "category":
                        Category category = server.selectCategory(Integer.parseInt(idObject));
                        if (category != null) {
                            out.println("<result status=\"200\">");
                            out.println(category.toXml());
                            out.println("</result>");
                        }else{
                            out.println("<result status=\"200\"/>");
                        }
                        break;
                    case "showroom":
                        Showroom showroom = server.selectShowroom(Integer.parseInt(idObject));
                        if (showroom != null) {
                            out.println("<result status=\"200\">");
                            out.println(showroom.toXml());
                            out.println("</result>");
                        }else{
                            out.println("<result status=\"200\"/>");
                        }
                        break;
                    default:response.sendError(400);
                }
            } catch (IllegalArgumentException ex) {
                response.sendError(400);
            }
        } else {
            response.sendError(400);
        }
    }

    private void insertOrUpdate(HttpServletRequest request,
                                HttpServletResponse response, int index) throws IOException {
        String url = request.getRequestURI();
        String[] parts = url.split("/");
        if (parts != null && parts.length == 3) {
            String typeOfObject = parts[2];
            try {
                String input = "";
                BufferedReader br = new BufferedReader(request.getReader());
                String line;
                while ((line = br.readLine()) != null) {
                    input += line;
                }
                if (!input.isEmpty()) {
                    int n = -1;
                    switch (typeOfObject) {
                        case "product":
                            ProductParser productParser = new ProductParser(input, true);
                            Product product = productParser.parse();
                            if (index == 1) {
                                n = server.insertProduct(product);
                            } else {
                                n = server.updateProduct(product);
                            }
                            break;
                        case "category":
                            CategoryParser categoryParser = new CategoryParser(input, true);
                            Category category = categoryParser.parse();
                            if (index == 1) {
                                n = server.insertCategory(category);
                            } else {
                                n = server.updateCategory(category);
                            }
                            break;
                        case "showroom":
                            //da fare
                            break;
                    }
                    PrintWriter out = response.getWriter();
                    response.setContentType("application/xml;charset=UTF-8");
                    out.println("<result status=\"200\">" + n + " record</result>");
                } else {
                    response.sendError(400);
                }
            } catch (Exception ex) {
                response.sendError(500, ex.getLocalizedMessage());
            }
        } else {
            response.sendError(400);
        }
    }

    @Override
    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            server = new Server(getInitParameter("connectionString"));
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private void instructions(PrintWriter out) {
        out.println("<selectObjects>");
        out.println("<product>");
        out.println("<one>applicationAddress/product/id</one>");
        out.println("<all>applicationAddress/products</all>");
        out.println("</product>");
        out.println("<showroom>");
        out.println("<one>applicationaddress/showroom/id</one>");
        out.println("<all>applicationAddress/showrooms</all>");
        out.println("</showroom>");
        out.println("<category>");
        out.println("<one>ApplicationAddress/category/id</one>");
        out.println("<all>ApplicationAddress/categories</all>");
        out.println("</category>");
        out.println("</selectObjects>");
    }
}
