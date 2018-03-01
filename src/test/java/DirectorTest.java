import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Barry", 7, 56000, "Cheese", 1000000);
    }

    @Test
    public void canGetName(){
        assertEquals("Barry", director.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(7, director.getNiNo());
    }

    @Test
    public void canGetSalary(){
        assertEquals(56000, director.getSalary());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Cheese", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000.00);
        assertEquals(57000, director.getSalary());
    }

    @Test
    public void canRaiseSalary__negativeValue(){
        director.raiseSalary(-198);
        assertEquals(56000, director.getSalary());
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(1120, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget() {
        assertEquals(1000000, director.getBudget());
    }

    @Test
    public void canChangeName() {
        director.setName("Arnold");
        assertEquals("Arnold", director.getName());
    }

    @Test
    public void canChangeName__nullValue() {
        director.setName(null);
        assertEquals("Barry", director.getName());
    }
}