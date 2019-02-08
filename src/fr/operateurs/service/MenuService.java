/**
 * 
 */
package fr.operateurs.service;

import java.util.Scanner;

import fr.operateurs.dao.IPizzaDao;
import fr.pizzeria.exception.StockageException;

/**
 * @author cherif
 *
 */
public abstract   class MenuService    {
	
	 public  abstract  void executeUC (IPizzaDao pizzaDao, Scanner scanner) throws StockageException ;
	 
	 
	 
}
