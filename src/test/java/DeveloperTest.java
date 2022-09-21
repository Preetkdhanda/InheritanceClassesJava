
import Management.Manager;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

Developer developer;

    @Before
    public void before(){
        developer = new Developer("John","JC303040C", 50000);
    }


    @Test
    public void getRaise(){
        developer.raiseSalary(-10.00);
        assertEquals(50000, developer.getSalary(), 0.0);
    }

    @Test

    public void getBonus(){
        developer.payBonus();
        assertEquals(50500, developer.payBonus(),0.0);
    }


}
