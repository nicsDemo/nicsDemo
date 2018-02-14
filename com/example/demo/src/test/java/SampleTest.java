/**
 * Created by yuho on 2018/02/01.
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class SampleTest {
    @Test
    public void testNum() {
        assertEquals("is not 10!!",10, Sample.num());
    }

    @Test
    public void testNum2() {
        assertEquals("is not 10!!",12, Sample.num());
    }
}
