package fr.operateurs.model;


public class Pizza  {
    public static int nbPizza;
	public int id;
	public String code ;
	public String libelle;
	public double prix;
	private CategoriePizza categoriePizza;
	
	public String toString(){
		return this.code+"->"+this.libelle+"("+this.prix+"€)"+"decategorie"+"  "+categoriePizza.getCategoriePizza();
	}
	public Pizza(String code, String libelle, double prix,CategoriePizza categoriePizza ) {
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.categoriePizza=categoriePizza;
		
	}
	public Pizza(int id, String code, String libelle, double prix,CategoriePizza categoriePizza) {
		this.id = nbPizza++;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.categoriePizza=categoriePizza;

	}
	
}
