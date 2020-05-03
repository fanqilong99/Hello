import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main implements Runnable{
    Timer timer = new Timer();


    public static void main(String[] args) throws Exception{
        /*System.out.println("Hello World!");
        System.out.println("hello12");
        Object m = new Main1();
        System.out.println(m.toString());
        StringBuffer sb = new StringBuffer();*/
//        T t = new T();
//        FileOutputStream fileOutputStream = new FileOutputStream("/Users/qilongfan/aa.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(t);
//        objectOutputStream.flush();
//        objectOutputStream.close();
        Main main = new Main();
        Thread t1 = new Thread(main);
        Thread t2 = new Thread(main);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        timer.add(Thread.currentThread().getName());
    }

    public String toString(){
        System.out.println("2222");
        return "222";
    }
}

class Main1 extends Main{
    public String toString(){
        System.out.println("11111");
        return null;
    }
}
class T implements Serializable{
    String aa = "44";
    int bb = 1;
    double cc = 0.1;
}
class Timer{
    private int num = 0;
    public synchronized void add(String name ){
        num++;
        try{
            Thread.sleep(1);
        }catch (InterruptedException e){

        }
        System.out.println(name+","+num);
    }
}