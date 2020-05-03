public class TT implements  Runnable {
    int b = 100;
    public synchronized  void m1() throws  Exception{
        System.out.println("m1");
        b = 1000;
        Thread.sleep(5000);
        System.out.println("b = " + b);
//        System.out.println("m1结束");
    }
    public synchronized void m2() throws Exception{
        System.out.println("m2");
        Thread.sleep(3500);
        b=2000;
//        System.out.println("m2结束");
    }

    @Override
    public void run() {
        try{
            m1();
        }catch (Exception e){

        }
    }
    public static void main(String[] args) throws Exception{
        TT tt =  new TT();
        Thread t = new Thread(tt);
        System.out.println("main1");
        t.start();
        System.out.println("main2");
        tt.m2();
        System.out.println("main3");
        System.out.println(tt.b);
        System.out.println("main4");
    }
}
