package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner choiceMenu = new Scanner(System.in);
		Scanner reader = new Scanner(System.in);
		Pizza p1= new Pizza(0,"REP","Peperoni",12.5);
		Pizza p2= new Pizza(1,"MAR","Margherita",14.0);
		Pizza p3= new Pizza(2,"REIN","La Reine",11.5);
		Pizza p4= new Pizza(3,"FRO","La 4 fromages",12.0);
		Pizza p5= new Pizza(4,"CAN","La cannibale",12.5);
		Pizza p6= new Pizza(5,"SAV","La savoyarde",13.0);
		Pizza p7= new Pizza(6,"ORI","L’orientale",13.5);
		Pizza p8= new Pizza(7,"IND","L’indienne",14.0);

		Pizza[] pizzashop = {p1,p2,p3,p4,p5,p6,p7,p8} ;
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
				for(int i=0;i<pizzashop.length;i++){

					System.out.println(pizzashop[i].code+"->"+pizzashop[i].libelle+"("+pizzashop[i].prix+"€)");
				}



			} else if (choice == 2){

				System.out.println("Ajout d’une nouvelle pizza");

				System.out.println("Veuillez saisir le code : ");
				String idp=reader.nextLine();
				System.out.println("Veuillez saisir le nom (sans espace) :");
				String nomp=reader.nextLine();
				System.out.println("Veuillez saisir le prix :");
				double  prixp= reader.nextDouble();

				Pizza p9= new Pizza(pizzashop.length, idp,nomp,prixp);

				Pizza[] newArray = new Pizza[pizzashop.length+1];

				for(int i = 0; i< pizzashop.length; i++){
					newArray[i] = pizzashop[i];
				}
				newArray[pizzashop.length] = p9;
				pizzashop = newArray;

			} 

			else if (choice == 3){
				System.out.println("Mise à jour d’une pizza");
				System.out.println("Liste des pizzas :");
				for(int i=0;i<pizzashop.length;i++){

					System.out.println(pizzashop[i].code+"->"+pizzashop[i].libelle+"("+pizzashop[i].prix+"€)");

				}

				System.out.println("Veuillez choisir le code de la pizza à modifier: ");
				String idpf=reader.nextLine();

				System.out.println("Veuillez saisir le code : ");
				String idpm=reader.nextLine();
				System.out.println("Veuillez saisir le nom (sans espace) :");
				String nompm=reader.nextLine();
				System.out.println("Veuillez saisir le prix :");
				double  prixpm= reader.nextDouble();


				for(int i=0;i<pizzashop.length;i++){

					if(pizzashop[i].code.equals(idpf)){

						pizzashop[i].code=idpm;
						pizzashop[i].libelle=nompm;
						pizzashop[i].prix=prixpm;


					}
				}




			}	
			else if (choice == 4){
				System.out.println("Suppression d’une pizza");

				System.out.println("Veuillez choisir le code de la pizza à supprimer ");
				String idps=reader.nextLine();

				int iTemp = 0;
				for(int i = 0; i< pizzashop.length; i++){

					if(!(pizzashop[i].code).equals(idps)){ 
						pizzashop[i]=pizzashop[iTemp];
						iTemp++;
					}

				} 
				
				
			}else if (choice == 99){
				System.out.println("Aurevoir ☹»");

			}

			else {
				break;
			}

		}
	}

}