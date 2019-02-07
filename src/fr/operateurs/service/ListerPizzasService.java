package fr.operateurs.service;

import java.util.Scanner;

import fr.operateurs.dao.IPizzaDao;

public class ListerPizzasService extends MenuService{

	@Override
	public void executeUC(IPizzaDao pizzaDao,Scanner scanner) {
		for (int i = 0; i < pizzaDao.findAllPizzas().length; i++) {
			System.out.println(pizzaDao.findAllPizzas()[i]);
		}
		
		
	}

}
