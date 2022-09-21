

import Management.Manager;
import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("John","JC303040C", 50000);
    }


    @Test
    public void getRaise(){
        databaseAdmin.raiseSalary(10.00);
        assertEquals(50010, databaseAdmin.getSalary(), 0.0);
    }

    @Test

    public void getBonus(){
        databaseAdmin.payBonus();
        assertEquals(50500, databaseAdmin.payBonus(),0.0);
    }


}
