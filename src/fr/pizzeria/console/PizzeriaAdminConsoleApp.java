package fr.pizzeria.console;

import java.util.Scanner;

import fr.operateurs.dao.IPizzaDao;
import fr.operateurs.dao.PizzaMemDao;
import fr.operateurs.model.Pizza;
/**
 * 
 * @author cherif
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
			
			
          /** affichage de tous les pizza **/
			
			if (choice == 1){
			
				for (int i = 0; i < pizzaDao.findAllPizzas().length; i++) {
					System.out.println(pizzaDao.findAllPizzas()[i]);
				}
				
			}
			/**l ajout d une pizza dans un tableau **/
			else if (choice == 2){

				System.out.println("Ajout d’une nouvelle pizza");

				System.out.println("Veuillez saisir le code : ");
				String idPizza=reader.nextLine();
				System.out.println("Veuillez saisir le nom (sans espace) :");
				String nomPizza=reader.nextLine();
				System.out.println("Veuillez saisir le prix :");
				double  prixPizza= reader.nextDouble();
                Pizza newPizza= new Pizza( idPizza,nomPizza,prixPizza);
                pizzaDao.saveNewPizza(newPizza);

			} 
			
			
			/**la mise ajour d'une pizza **/
			else if (choice == 3){
				System.out.println("Mise à jour d’une pizza");
				System.out.println("Liste des pizzas :");
				
				pizzaDao.toString();

				System.out.println("Veuillez saisir le code a du pizza a modifier  : ");
				String idModifier=reader.nextLine();
				

				System.out.println("Veuillez saisir le code : ");
				String iddModifier=reader.nextLine();
				
				System.out.println("Veuillez saisir le nom (sans espace) :");
				String nomModifier=reader.nextLine();
				
				System.out.println("Veuillez saisir le prix :");
				double  prixModifier= reader.nextDouble();
				
				Pizza Pizzamiseajour= new Pizza( iddModifier,nomModifier,prixModifier);


				pizzaDao.updatePizza(idModifier, Pizzamiseajour);

			}	/**la supression d'une pizza **/
			else if (choice == 4){
				System.out.println("Suppression d’une pizza");

				System.out.println("Veuillez choisir le code de la pizza à supprimer ");
				String idSuprimer=reader.nextLine();
				
				if(pizzaDao.pizzaExists(idSuprimer))
					
				pizzaDao.deletePizza(idSuprimer);
				
			} /**quitter l application **/ else if (choice == 99){
				System.out.println("Aurevoir ☹»");

			}

			else {
				break;
			}

		}
	}

}