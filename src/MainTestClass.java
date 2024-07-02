import org.junit.Assert;
import org.junit.Test;

public class MainTestClass extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int expected = 14;
        this.getLocalNumber();
        Assert.assertTrue("Correct answer is 14 ", expected == 14);
    }
}
