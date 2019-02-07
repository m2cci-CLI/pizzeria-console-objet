package fr.operateurs.dao;

import java.util.Scanner;

import fr.operateurs.model.Pizza;

public class PizzaMemDao implements IPizzaDao {

	Scanner reader = new Scanner(System.in);

	Pizza[] menu=new Pizza[0];

	@Override
	public Pizza[] findAllPizzas() {
		return menu;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		Pizza[] newArray = new Pizza[menu.length+1];
		for(int i = 0; i< menu.length; i++){
			newArray[i] = menu[i];
		}
		newArray[menu.length] = pizza;
		menu = newArray;
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {

		for(int i=0;i<menu.length;i++){

			if(menu[i].code.equals(codePizza)){
				menu[i].code=pizza.code;
				menu[i].libelle=pizza.libelle;
				menu[i].prix=pizza.prix;
			}
		}
	}

	@Override
	public void deletePizza(String codePizza) {
		Pizza[] arrayTemp = new Pizza[menu.length-1];
		int iTemp = 0;
		for(int i = 0; i< menu.length; i++){
			if(!(menu[i].code).equals(codePizza)){
				arrayTemp[iTemp] = menu[i];
				iTemp ++;
			}
		} 
		menu = arrayTemp;
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		System.out.println("Veuillez choisir le code pizza a trouver ");
		codePizza=reader.nextLine();
		int idTrouver=0;
		for(int i=0;i<menu.length;i++){
			if(menu[i].code.equals(codePizza)){
				idTrouver=i;
			}}
		return menu[idTrouver] ;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		boolean existPizza=false;
		for(int i=0;i<menu.length;i++){
		if(menu[i].code.equals(codePizza)){
			existPizza=true;
			}
		}
	return existPizza;
	}

}
