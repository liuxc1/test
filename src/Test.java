import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liuxc
 * @date 2020/3/1 - 22:43
 */
public class Test {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        System.out.println("OOOKJ");
    }
}
