package test;


class Employee{

	private String nom;
	private int age;
	
	private static int nombreDeEmployee;
	
	public Employee() {
	
	}
	
	

	public static int getNombreDeEmployee() {
		return nombreDeEmployee;
	}



	public Employee(String nom, int age) {
		this.nom = nom;
		this.age = age;
		nombreDeEmployee++;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	

	
	
	
	

}
