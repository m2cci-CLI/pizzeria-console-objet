package fr.operateurs.model;


public class Pizza  {
public int id;
	
	public String code ;
	
	public String libelle;
	
	public double prix;


	
	public String toString(){

		return this.code+"->"+this.libelle+"("+this.prix+"�)";
		
	}
	

	public Pizza(String code, String libelle, double prix) {
	
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}

	public Pizza(int id, String code, String libelle, double prix) {
	
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}


	

	
}
