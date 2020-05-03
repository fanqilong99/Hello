public strictfp class StrictfpTest {

    private static double aDouble = 0.0555500333333212d;
    private static float aFloat = 0333000000222f;

    public  static void testStrictfp1(){
        float f = 0.12365f;
        double d = 0.03496421d;
        double sum = f * d;
        System.out.println(sum);

        double cDouble = aDouble / aFloat;
                System.out.println("aDouble:" + aDouble);
               System.out.println("aFloat:" + aFloat);
                System.out.println("cDouble:" + cDouble);
    }

    public static void testStrictfp2(){
        float f = 0.12365f;
        double d = 0.03496421d;
        double sum = f * d;
        System.out.println(sum);

        double cDouble = aDouble / aFloat;
        System.out.println("aDouble:" + aDouble);
        System.out.println("aFloat:" + aFloat);
        System.out.println("cDouble:" + cDouble);
    }

    public static void main(String[] args) {
        testStrictfp1();
        testStrictfp2();
    }
}
