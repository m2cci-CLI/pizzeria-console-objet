package fr.operateurs.dao;

import java.util.List;

import fr.operateurs.model.Pizza;
/**
 * @author cherif
 * Interface declaration de toutes les  les fonctions de java  pour le programme Pizza 
 * 
 */
public interface IPizzaDao {
	/**liste de tous les pizza**/
	List<Pizza> findAllPizzas();
	/**Enregistrer une  pizza**/
	void saveNewPizza(Pizza pizza);
	/**modifier  une  pizza**/
	void updatePizza(String codePizza, Pizza pizza);
	/**suprimer  une  pizza**/
	void deletePizza(String codePizza);
	/**Trouver une pizza par son code **/
	Pizza findPizzaByCode(String codePizza);
	/**Trouver une pizza par son code **/
	boolean pizzaExists(String codePizza);

}
