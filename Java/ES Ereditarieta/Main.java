public class Main
{
	public static void main(String[] args)
	{
		//Persona p1 = new Persona("Lorenzo","Lingesso");
		Studente s1 = new Studente("Lorenzo","Lingesso","Informatica");
		Docente d1 = new Docente("Alfonso","Carlone","Informatica");
		StudenteFuoriSede sfs1 = new StudenteFuoriSede("Mario","Rossi","Medicina","Roma");
		s1.presentati();
		d1.presentati();
		sfs1.presentati();
	}
}