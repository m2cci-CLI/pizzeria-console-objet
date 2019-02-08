package fr.operateurs.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import fr.operateurs.model.Pizza;
/**
 * @author cherif
 * Implementations de toutes  les fonctions de java  pour le programme Pizza 
 * 
 */

public class PizzaMemDao implements IPizzaDao {
	Scanner reader = new Scanner(System.in);
	List<Pizza>  menu=new ArrayList<Pizza> ();
	@Override
	/**liste de tous les pizza**/
	public List<Pizza> findAllPizzas() {
		return menu;
	}
	@Override
	/**Enregistrer une  pizza**/
	public void saveNewPizza(Pizza pizza) {
		menu.add(pizza);
	}
	@Override
	/**modifier  une  pizza**/
	public void updatePizza(String codePizza, Pizza pizza) {

		for(int i=0;i<menu.size();i++){

			if((menu.get(i).code).equals(codePizza)){
				menu.add(pizza);
			}
		}
	}
	@Override
	/**Suprimer  une  pizza**/
	public void deletePizza(String codePizza) {

		for(int i=0;i<menu.size();i++){
			if((menu.get(i).code).equals(codePizza)){
				menu.remove(codePizza);
			}
		}

	}

	@Override
	/**Trouver une pizza par son code **/
	public Pizza findPizzaByCode(String codePizza) {
		int idPizza=-1;
		for(int i=0;i<menu.size();i++){
			if((menu.get(i).code).equals(codePizza)){
				idPizza=i;
			}
		}
		return menu.get(idPizza) ;
	}

	@Override
	/**Voir si une pizza exist  **/
	public boolean pizzaExists(String codePizza) {
		boolean existPizza=false;
		for(int i=0;i<menu.size();i++){
			if((menu.get(i).code).equals(codePizza)){
				existPizza=true;
			}
		}
		return existPizza;
	}

}
