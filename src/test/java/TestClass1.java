import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {
    @Test
    public void testcase1(){
        Assert.assertEquals(1, 0);
    }

    @Test
    public void testcase2(){
        Assert.assertEquals(1, 1);
    }

    @Test
    public void testcase3(){
        Assert.assertEquals(2,2);
    }

    @Test
    public void testcase4(){
        Assert.assertEquals(2, 1);
    }
}
