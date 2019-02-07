package fr.operateurs.dao;

import fr.operateurs.model.Pizza;

public interface IPizzaDao {
	
	Pizza[] findAllPizzas();
	void saveNewPizza(Pizza pizza);
	void updatePizza(String codePizza, Pizza pizza);
	void deletePizza(String codePizza);
	Pizza findPizzaByCode(String codePizza);
	boolean pizzaExists(String codePizza);

}
