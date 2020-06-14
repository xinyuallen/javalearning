package day614;

/**
 * @author xinyuallen
 * @date 2020/6/14 - 19:09
 */
public class Computer {
    public void run(){
        System.out.println("启动电脑");
    }
    public void useUSB(USB usb){
        usb.open();
        usb.close();
    }
    public void shutDown(){
        System.out.println("笔记本关机");
    }

}

