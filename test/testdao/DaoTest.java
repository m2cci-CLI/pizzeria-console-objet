package testdao;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import fr.operateurs.dao.IPizzaDao;
import fr.operateurs.dao.PizzaMemDao;
import fr.operateurs.model.Pizza;

public class DaoTest {

	IPizzaDao dao;

	@Before
	public void setUp() throws Exception {
		dao= new PizzaMemDao();
	}

	@Test
	public void testAjouter() {
		assertTrue("Dao est",dao.findAllPizzas().isEmpty());
		//on ajoute une pizza
		dao.saveNewPizza(new Pizza(5, "test", "mabiza", 12));
		//on verifier que la pizza est bien dans la Dao
		assertTrue("je n ai pas retrouver la pizza",dao.pizzaExists("test"));	
	}
	@Test
	public void testsuprimer () {
		assertTrue("Dao est",dao.findAllPizzas().isEmpty());
		//on ajoute une pizza
		dao.saveNewPizza(new Pizza(6, "tester", "testsuprimer", 15));
		dao.deletePizza("tester");
		//on verifier que la pizza est bien dans la Dao
		assertTrue("je n ai pas retrouver la pizza",!dao.pizzaExists("test"));
  
	}
	
	@Test
	public void testupdate0Pizza () {
		assertTrue("Dao est",dao.findAllPizzas().isEmpty());
		//on ajoute une pizza
		dao.saveNewPizza(new Pizza(6, "testter", "testupdate", 16));
		
		dao.updatePizza("testter", new Pizza("bhs", "testupdate", 16));
		//on verifier que la pizza est bien dans la Dao
		assertTrue("je n ai pas retrouver la pizza",dao.pizzaExists("bhs"));
  
	}


}
