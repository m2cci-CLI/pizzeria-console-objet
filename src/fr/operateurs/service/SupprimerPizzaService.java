package fr.operateurs.service;

import java.util.Scanner;

import fr.operateurs.dao.IPizzaDao;
import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.StockageException;

public class SupprimerPizzaService  extends MenuService {
	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) throws DeletePizzaException  {
		System.out.println("Suppression d’une pizza");
		System.out.println("Veuillez choisir le code de la pizza à supprimer ");
		String idSuprimer=scanner.nextLine();
		pizzaDao.pizzaExists(idSuprimer);
			
		pizzaDao.deletePizza(idSuprimer);
	}
}
