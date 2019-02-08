package fr.operateurs.service;

import java.util.Scanner;

import fr.operateurs.dao.IPizzaDao;
import fr.operateurs.model.Pizza;

public class ModifierPizzaService extends MenuService{
	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) {
		System.out.println("Mise à jour d’une pizza");
		System.out.println("Liste des pizzas :");
		pizzaDao.toString();
		System.out.println("Veuillez saisir le code a du pizza a modifier  : ");
		String idModifier=scanner.nextLine();
		System.out.println("Veuillez saisir le code : ");
		String iddModifier=scanner.nextLine();
		System.out.println("Veuillez saisir le nom (sans espace) :");
		String nomModifier=scanner.nextLine();

		System.out.println("Veuillez saisir le prix :");
		double  prixModifier= scanner.nextDouble();

		Pizza Pizzamiseajour= new Pizza( iddModifier,nomModifier,prixModifier);
		pizzaDao.updatePizza(idModifier, Pizzamiseajour);

	}

}
