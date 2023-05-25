package gachamiga;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GachaMigaTest {
    public class GachamigueroTest {

        @Test
        public void test1() {
            assertEquals("1", GachaMiga.convert(1));
        }
        @Test
        public void test2() {
            assertEquals("2", GachaMiga.convert(2));
        }



    }
}