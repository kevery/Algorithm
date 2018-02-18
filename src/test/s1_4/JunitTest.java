package s1_4;

import org.junit.Test;

/**
 * Created by Administrator on 2017/2/5 0005.
 */
public class JunitTest {

    public void a() {

    }

    public void a(int a) {

    }

    public long fbi(int n) {
        if (n <= 2) {
            return 1;
        }
        return fbi(n - 1) + fbi(n - 2);
    }

    @Test
    public void name() {
        System.out.println(fbi(50));
    }
}
