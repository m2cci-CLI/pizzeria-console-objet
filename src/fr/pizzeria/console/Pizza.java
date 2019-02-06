package fr.pizzeria.console;

public class Pizza {

	public int id;
	
	public String code ;
	
	public String libelle;
	
	public double prix;

	public Pizza(String code, String libelle, double prix) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}

	public Pizza(int id, String code, String libelle, double prix) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	
	
	
	
	
	
	
	
	
	
	
}
