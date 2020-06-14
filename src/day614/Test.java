package day614;

/**
 * @author xinyuallen
 * @date 2020/6/14 - 19:29
 */
public class Test {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.run();
        Mouse mu = new Mouse();
        com.useUSB(mu);
        Keyboard ke = new Keyboard();
        com.useUSB(ke);
        com.shutDown();
    }
}
