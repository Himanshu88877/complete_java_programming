import java.util.Scanner;

public class DY_04 {
    public static void main(String[] args) {
        System.out.println("practice set _01");

//       Question-01
        int a=23;
        int b=27;
        int c=30;
        int sum=a+b+c;
        System.out.println(sum);

//      Question-02
        float sub1=50;
        float sub2=50;
        float sub3=50;
        float per=(sub1+sub2+sub3)/3;
        float cgpa= per/9.5f;
        System.out.println(cgpa);

//      Question=3
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Hello "+ name +" have a good day");

//        Question-4
        float k=sc.nextFloat();
        System.out.println("Enter kilometer is "+k+" km");
        float m= k*0.621371f;
        System.out.println("miles is "+m);


//        Question-05
        System.out.println("enter number is integer or not");
        boolean num=sc.hasNextInt();
        System.out.println(num);

    }


}

