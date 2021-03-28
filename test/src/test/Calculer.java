package test;

public class Calculer extends Monde{

	private static Calculer instance = new Calculer();
	
	
	public static Calculer getInstance(){
	      return instance;
	   }
	
	@Override
	public int calculer(int x, int y) {
		return x+y;
	}

}
