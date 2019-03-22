import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServiceTest {
    @Test
    public void test(){
        assertEquals("AA", Service.getA("A"));
    }
}
