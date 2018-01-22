package test.com.kevery.algorithm;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Page31Test Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十月 1, 2016</pre>
 */
public class Page31TestTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: before()
     */
    @Test
    public void testBefore() throws Exception {
    }

    /**
     * Method: after()
     */
    @Test
    public void testAfter() throws Exception {
    }

    @Test
    public void compare() throws Exception {
        long startTime = System.nanoTime();
        xunhuan(1000);
        long endTime = System.nanoTime();
        System.out.println("系统耗时：" + (endTime - startTime));


        long startTime1 = System.nanoTime();
        digui(1000);
        long endTime1 = System.nanoTime();
        System.out.println("系统耗时：" + (endTime1 - startTime1));
    }

    public void xunhuan(int num) {
        for (int i = 1; i <= num; i++) {
//            System.out.print(i);
        }
    }

    public void digui(int num) {
//        System.out.print(num);
        if (num > 0) {
            digui(num - 1);
        }
    }

    public int fbi(int i) {
        if (i < 2) {
            return i == 0 ? 0 : 1;
        }
        return fbi(i - 1) + fbi(i - 2);
    }


    @Test
    public void fbiTest() {
        Assert.assertEquals(13, fbi(7));
    }
}
