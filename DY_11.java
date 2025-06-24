import java.util.Scanner;

public class DY_11 {
    public static void main(String[] args) {
        System.out.println("conditional in java");
//        dicision making instruction in java
//        1.if-else statement
//        2.switch statement
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:- ");
        int n=sc.nextInt();
        if(n>=18){
            System.out.println("you are eligible for driving linsence");
        }else{
            System.out.println("you are not eligible for driving linsence");
        }

//    relational operator ==.<=,>= etc
//         also study about logical operator &&(and),||(or),!(not)
        System.out.print("enter your mark out of 20:- ");
        int mark=sc.nextInt();
        if(mark>20){
            System.out.println("enter marks out of 20 not exceed 20 (lol)");
        } else if (mark==20 || mark>15) {
            System.out.println("EXCELLENT PERFORMANCE");
        }else if(mark==15 || mark>10){
            System.out.println("GOOD PERFORMANCE");
        }else if(mark==10 || mark>5){
            System.out.println("average  PERFORMANCE");
        }else{
            System.out.println("do hard work");
        }


        // SWITCH CASE --CONTR0L INSTRUCTION
        System.out.println("enter you age:-");
        int age =sc.nextInt();
        switch (age){
            case 18:
                System.out.println("you are going to become adult");
                break;
                case 23:
                    System.out.println("you are going to join a company");
                    break;
                    case 68:
                        System.out.println("you are going to retired");
                        break;
            default:
                System.out.println("you are going to enjoy your life");

        }







    }


}
