public class DY_09 {
    public static void main(String[] args) {
        System.out.println("string");
        //string is sequence of character ,it is class in java not any datatype .it is immutable
        String str= new String("himanshu");
        System.out.println(str);

//         or ca be used as

        String str1="himanshu2";
        System.out.println(str1);
//        it is immutable so it exact copy cannot be change but its refernce can be change
        str1="himanshu9";
        System.out.println(str1); // here exact string is not change while its reference is change
//      different way to print in java
        int a=89;
        float b=2.88979f;
        char c='g';
        System.out.print(a+b);
        System.out.println(a+b);
        System.out.printf(" value of a is %d and value of b is %8.3f ",a,b); //8 space and 3 decimal point
        System.out.printf(" value of a is %d and value of b is %8.2f ",a,b); //8 space and 2 decimal point
        System.out.format(" value of a is %d and value of b is %f ",a,b);


    }
}
