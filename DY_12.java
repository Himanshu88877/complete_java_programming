public class DY_12 {
    public static void main(String[] args) {
        System.out.println("loop control instruction");
        System.out.println();

//         there are three type of loops in java
//        1.while loop --first cheq condition and then run code
//        2.do while loop-first enter in code and then cheque
//        3.for loop


        System.out.println("using loop");
        int a=1;
        while(a<=9){
            System.out.println(a);
            a++;

        }
        System.out.println("finish running while loop");
        System.out.println();

        System.out.println("using do while loop:-");
         int b=0;
         do{
             System.out.println(b);
             b++;
         }while(b<=10);
        System.out.println();

        System.out.println("using for loop");
        for(int c=0;c<=10;c++){
            System.out.println(c);
        }
        // if codition is false loop is not going to executed
//        2n-- for print even number
//        2n+1 for odd number
        System.out.println("print first 10 even number");
        for(int p=1;p<=10;p++){
            System.out.println(2*p);
        }
  System.out.println("print first 10 odd number");
        for(int p=1;p<=10;p++){
            System.out.println(2*p+1);
        }

    }
}
