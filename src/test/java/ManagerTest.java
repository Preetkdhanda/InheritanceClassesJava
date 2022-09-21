import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John","JC303040C", 50000,"Learning");
    }


    @Test
    public void getRaise(){
        manager.raiseSalary(10.00);
        assertEquals(50010, manager.getSalary(), 0.0);
    }

    @Test

    public void getBonus(){
        manager.payBonus();
        assertEquals(50500, manager.payBonus(),0.0);
    }


}
