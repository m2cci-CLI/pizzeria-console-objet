package fr.operateurs.service;

import java.util.Scanner;

import fr.operateurs.dao.IPizzaDao;
import fr.operateurs.model.Pizza;

public class AjouterPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao,Scanner scanner) {
		System.out.println("Ajout d’une nouvelle pizza");

		System.out.println("Veuillez saisir le code : ");
		String idPizza=scanner.nextLine();
		System.out.println("Veuillez saisir le nom (sans espace) :");
		String nomPizza=scanner.nextLine();
		System.out.println("Veuillez saisir le prix :");
		double  prixPizza= scanner.nextDouble();
        Pizza newPizza= new Pizza( idPizza,nomPizza,prixPizza);
        pizzaDao.saveNewPizza(newPizza);
		}


	
		
	}


