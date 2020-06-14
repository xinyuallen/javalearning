package day614;

/**
 * @author xinyuallen
 * @date 2020/6/14 - 19:10
 */
public class Keyboard implements USB{
    public void open(){
        System.out.println("开启键盘");
    }
    public  void close(){
        System.out.println("关闭键盘");
    }
}
