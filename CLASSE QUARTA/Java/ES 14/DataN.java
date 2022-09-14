import java.io.*;

public class DataN {

    private String day;
    private String month;
    private String year;
    String format = "dd/mm/yyyy";

    public DataN() {

    }

    public DataN(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return this.day;
    }

    public String getMonth() {
        return this.month;
    }

    public String getYear() {
        return this.year;
    }

        public void setDay(String day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String toString() {
        String dn = "";
        dn += this.day + "/";
        dn += this.month + "/";
        dn += this.year;
        return dn;
    }

    // Metodo che controlla la data
    // Ritorno "false" se la data è corretta, altrimenti ritorna "true"
    public boolean checkDate() {

        int gg, mm, aaaa;
        boolean correct;

        // array che contiene il
        int[] maxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        correct = true;
        gg = 0;
        mm = 0;
        aaaa = 0;

        try {
            gg = Integer.valueOf(this.day).intValue();
            aaaa = Integer.valueOf(this.year).intValue();
        } catch (Exception e) {
            correct = false;
        }

        switch (this.month.toUpperCase()) {
        case "GENNAIO":
            mm = 1;
            break;
        case "FEBBRAIO":
            mm = 2;
            break;
        case "MARZO":
            mm = 3;
            break;
        case "APRILE":
            mm = 4;
            break;
        case "MAGGIO":
            mm = 5;
            break;
        case "GIUGNO":
            mm = 6;
            break;
        case "LUGLIO":
            mm = 7;
            break;
        case "AGOSTO":
            mm = 8;
            break;
        case "SETTEMBRE":
            mm = 9;
            break;
        case "OTTOBRE":
            mm = 10;
            break;
        case "NOVEMBRE":
            mm = 11;
            break;
        case "DICEMBRE":
            mm = 12;
            break;
        default:
            try {
                mm = Integer.valueOf(this.month).intValue();
            } catch (Exception e) {
                correct = false;
            }
            break;
        }

        if (mm >= 1 && mm <= 12 && gg >= 1 && correct == true) {
            if (mm == 2 && aaaa % 2 != 0) {
                if (gg > 28)
                    correct = false;
            } else if (gg > maxDays[mm - 1])
                correct = false;

        } else
            correct = false;
        return correct;
    }



}