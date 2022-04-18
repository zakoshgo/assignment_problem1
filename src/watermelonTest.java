import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class watermelonTest {

    @Test
    void test1() {
        // input = sc.nextInt();
        watermelonn wm = new watermelonn(2);
        assertEquals("NO",wm.checkDevide());

    }

    @Test
    void test2() {
        // input = sc.nextInt();
        watermelonn wm = new watermelonn(6);
        assertEquals("YES",wm.checkDevide());
    }

    @Test
    void test3() {
        // input = sc.nextInt();
        watermelonn wm = new watermelonn(102);
        assertEquals("ERROR",wm.checkDevide());
    }



}