public class DY_05 {
    public static void main(String[] args) {
        System.out.println("operator and expression");
//        arithmetic operator
        int a=1+2;
        int b=3-2;
        int c=2*4;
        int d=4/2;
        int e=4%3;
        int f = a++;
        System.out.println(f);

//        assigment operator
        int g=34;
        int h=g++;
        System.out.println(h);
        int i=h--;
        System.out.println(i);

//        comparison operator
        System.out.println(9==9);
        System.out.println(9>10);
        System.out.println(9<10);
        System.out.println(9==10);

//        logical operator
        System.out.println(64>8 && 64>9);
        System.out.println(64>8 && 64<9);
        System.out.println(64<8 || 64<9);
        System.out.println(! false);

//        bitwise operator -bitwise working
        System.out.println(2&3);
//        10
//        11
//      -------
//        10
    }


}
