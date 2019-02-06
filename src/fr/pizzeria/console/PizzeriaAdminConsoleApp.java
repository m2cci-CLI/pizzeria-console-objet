package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner choiceMenu = new Scanner(System.in);

		
				int choice = 0;

				while (true) {
					System.out.println("1. Lister les pizzas");
					System.out.println("2. Ajouter une nouvelle pizza");
					System.out.println("3. Mettre à jour une pizza");
					System.out.println("4. Supprimer une pizza");
					System.out.println("99. Sortir");
					
					choice = choiceMenu.nextInt();
					
					if (choice == 1){
						System.out.println("Liste des pizzas :");
						
					} else if (choice == 2){
						System.out.println("Ajout d’une nouvelle pizza");
						
					} 
					
					else if (choice == 3){
						System.out.println("Mise à jour d’une pizza");
						
					}	
					else if (choice == 4){
						System.out.println("Suppression d’une pizza");
						
					}
					else if (choice == 99){
						System.out.println("Aurevoir ☹»");
						
					}
					
					else {
						break;
					}
					
				}
			}

		}