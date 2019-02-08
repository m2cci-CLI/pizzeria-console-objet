package fr.pizzeria.console;

import java.util.Scanner;

import fr.operateurs.dao.IPizzaDao;
import fr.operateurs.dao.PizzaMemDao;
import fr.operateurs.model.Pizza;
import fr.operateurs.service.MenuService;
import fr.operateurs.service.MenuServiceFactory;

/**
 * 
 * @author cherif
 * 
 * 
 *
 */

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		IPizzaDao pizzaDao = new PizzaMemDao();

		Pizza p1= new Pizza(0,"REP","Peperoni",12.5);
		Pizza p2= new Pizza(1,"MAR","Margherita",14.0);
		Pizza p3= new Pizza(2,"REIN","La Reine",11.5);
		Pizza p4= new Pizza(3,"FRO","La 4 fromages",12.0);
		Pizza p5= new Pizza(4,"CAN","La cannibale",12.5);
		Pizza p6= new Pizza(5,"SAV","La savoyarde",13.0);
		Pizza p7= new Pizza(6,"ORI","L’orientale",13.5);
		Pizza p8= new Pizza(7,"IND","L’indienne",14.0);

		/** creation de tableau d'objet**/ 

		pizzaDao.saveNewPizza(p1);
		pizzaDao.saveNewPizza(p2);
		pizzaDao.saveNewPizza(p3);
		pizzaDao.saveNewPizza(p4);
		pizzaDao.saveNewPizza(p5);
		pizzaDao.saveNewPizza(p6);
		pizzaDao.saveNewPizza(p7);
		pizzaDao.saveNewPizza(p8);
		Scanner choiceMenu = new Scanner(System.in);	
		Scanner reader = new Scanner(System.in);
		int choice = 0;

		while (true) {
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			choice = choiceMenu.nextInt();

			MenuService service= MenuServiceFactory.getService(choice);
			if(service !=null){
				service.executeUC(pizzaDao, reader);
			}
			if (choice == 99){
				System.out.println("Aurevoir ☹»");

				break;	
			}

		}
		choiceMenu.close();
	}

}