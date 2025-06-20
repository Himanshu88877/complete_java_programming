import java.util.Scanner;

public class DY_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER 1");
        int a = sc.nextInt();
//        float a = sc.nextFloat();
        System.out.println("ENTER A NUMBER 2");
        int b = sc.nextInt();
//        float b = sc.nextFloat();
        int sum = a + b;
//        float sum = a + b;
        System.out.println("sum of these two number are");
        System.out.println(sum);

        String str = sc.next();
        System.out.println(str);

        String str2 = sc.nextLine();
        System.out.println(str2);

        boolean c = sc.hasNextInt();
        System.out.println(c);



    }
}
