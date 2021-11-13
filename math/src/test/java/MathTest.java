import org.junit.Assert;
import org.junit.Test;

public class MathTest {

    @Test
    public void testMultiply() {
        Math math = new Math();
        int result = math.multiply(3,4);
        Assert.assertEquals(12,result);

    }
}
