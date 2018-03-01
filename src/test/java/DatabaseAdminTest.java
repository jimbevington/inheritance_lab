import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private Employee databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("James", 9873, 7);
    }

    @Test
    public void canGetName(){
        assertEquals("James", databaseAdmin.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(9873, databaseAdmin.getNiNo());
    }

    @Test
    public void canGetSalary(){
        assertEquals(7, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(1007, databaseAdmin.getSalary());
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(0.07, databaseAdmin.payBonus(), 0.01);
    }
}
