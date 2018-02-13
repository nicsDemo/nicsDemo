/**
 * Created by yuho on 2018/02/01.
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class SampleTest {
    @Test
    public void testNum() {
        int answer = 10;
        assertEquals("is not 10!!", answer, Sample.num());
    }
}
