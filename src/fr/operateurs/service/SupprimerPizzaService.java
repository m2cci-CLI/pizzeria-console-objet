package fr.operateurs.service;

import java.util.Scanner;

import fr.operateurs.dao.IPizzaDao;

public class SupprimerPizzaService  extends MenuService{

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) {
		System.out.println("Suppression d’une pizza");

		System.out.println("Veuillez choisir le code de la pizza à supprimer ");
		String idSuprimer=scanner.nextLine();
		
		if(pizzaDao.pizzaExists(idSuprimer))
			
		pizzaDao.deletePizza(idSuprimer);
		
	}
	
	

}
