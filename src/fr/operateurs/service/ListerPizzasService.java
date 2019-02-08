package fr.operateurs.service;

import java.util.Scanner;

import fr.operateurs.dao.IPizzaDao;

public class ListerPizzasService extends MenuService{

	@Override
	public void executeUC(IPizzaDao pizzaDao,Scanner scanner) {
		
			System.out.println(pizzaDao.findAllPizzas());
		
	}

}
