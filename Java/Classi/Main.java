public class Main
{//inizio classe eseguibile

  public static void main(String args[])
  {//inizio main

    Automobile auto;// Dichiara un riferimento a un oggetto di classe automobile
    auto=new Automobile("FB333IA","FERRARI",5000,0,0);//Crea l'oggetto auto di classe automobile
    
  //auto.targa = "IY567UT"; errore se l'attributo è       private
    auto.presentati();
    auto.setTarga ("IY567UT"); //da la possibilità di accedere al dato poichè il metodo è pubblico
    auto.accendi();
    auto.accelera(300);
    auto.accelera(50);
    //System.out.println("L'auto ha targa : " + auto.getTarga());
    auto.presentati();
    auto.spegni();
    auto.presentati();
    
  }//fine main

}//fine classe eseguibile