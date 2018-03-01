import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Employee developer;

    @Before
    public void before(){
        developer = new Developer("Jim", 12345, 67893);
    }

    @Test
    public void canGetName(){
        assertEquals("Jim", developer.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(12345, developer.getNiNo());
    }

    @Test
    public void canGetSalary(){
        assertEquals(67893, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000.00);
        assertEquals(68893, developer.getSalary());
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(678.93, developer.payBonus(), 0.01);
    }
}
