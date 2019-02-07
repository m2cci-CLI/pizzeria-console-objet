/**
 * 
 */
package fr.operateurs.service;

import java.util.Scanner;

/**
 * @author cherif
 *
 */
public class MenuServiceFactory {
	Scanner choiceMenu = new Scanner(System.in);
	int choice = 0;
public static MenuService getService (int choice) {
	if (choice == 1){
		
		return new ListerPizzasService();	
	}
	/**l ajout d une pizza dans un tableau **/
	else if (choice == 2){
		return new AjouterPizzaService();
	} 
	/**la mise ajour d'une pizza **/
	else if (choice == 3){
		return new ModifierPizzaService();
	}	/**la supression d'une pizza **/
	else if (choice == 4){
		return  new SupprimerPizzaService();
		
	}
	return null;}

}
	
	



