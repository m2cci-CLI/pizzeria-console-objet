package fr.operateurs.service;

import java.util.Scanner;

import fr.operateurs.dao.IPizzaDao;
import fr.operateurs.model.CategoriePizza;
import fr.operateurs.model.Pizza;
import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.UpdatePizzaException;

public class ModifierPizzaService extends MenuService{
	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) throws UpdatePizzaException {
		System.out.println("Mise à jour d’une pizza");
		System.out.println("Liste des pizzas :");
		System.out.println(pizzaDao.findAllPizzas());
		System.out.println("Veuillez saisir le code a du pizza a modifier  : ");
		String idModifier=scanner.nextLine();
		System.out.println("Veuillez saisir le nouveau code  : ");
		String iddModifier=scanner.nextLine();
		System.out.println("Veuillez saisir le nom (sans espace) :");
		String nomModifier=scanner.nextLine();
		System.out.println("Veuillez saisir le prix :");
		double  prixModifier= scanner.nextDouble();
		System.out.println("Veuillez saisir la categorie ");
		CategoriePizza categoriePizza = CategoriePizza.valueOf(scanner.nextLine());
		Pizza Pizzamiseajour= new Pizza( iddModifier,nomModifier,prixModifier,categoriePizza);
		pizzaDao.updatePizza(idModifier, Pizzamiseajour);

	}

}
