import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Geoff", 7898902, 19000, "Chips");
    }

    @Test
    public void canGetName(){
        assertEquals("Geoff", manager.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(7898902, manager.getNiNo());
    }

    @Test
    public void canGetSalary(){
        assertEquals(19000, manager.getSalary());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Chips", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000.00);
        assertEquals(20000, manager.getSalary());
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(190, manager.payBonus(), 0.01);
    }
}
