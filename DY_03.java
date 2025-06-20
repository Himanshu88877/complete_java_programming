import java.util.Scanner;

public class DY_03 {
    public static void main(String[] args) {
        System.out.println("exercise -1");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks out of 100");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int sum = sub1+sub2+sub3+sub4+sub5;
        System.out.println(sum);
        int per=sum/5;
        System.out.println(per+"%");


    }
}
