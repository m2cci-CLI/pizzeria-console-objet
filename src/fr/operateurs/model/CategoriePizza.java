/**
 * 
 */
package fr.operateurs.model;

/**
 * @author Cherif
 *
 */
public enum CategoriePizza {

	VIANDE("Viande"), 
	POISSON("Poisson"),
	SANS_VIANDE("Sans Viande");
	private String categorie;
	private CategoriePizza(String categorie) {
		this.categorie = categorie;
	}
	public String getCategoriePizza() {
		return categorie;
	}
	public void setCategoriePizza(String categorie) {
		this.categorie = categorie;
	}
}
