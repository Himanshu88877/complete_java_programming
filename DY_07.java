public class DY_07 {
    public static void main(String[] args) {
        System.out.println("resulting datatype after arithmetic operation");
//                | Operand 1 | Operand 2 | Resulting Type |
//                | --------- | --------- | -------------- |
//
//                  byte      | short     | int            |
//                  byte      | int       | int            |
//                  byte      | long      | long           |
//|                 byte      | float     | float          |
//|                 byte      | double    | double         |
//|                 short     | short     | int            |
//|                 short     | int       | int            |
//|                 short     | long      | long           |
//|                 short     | float     | float          |
//|                 short     | double    | double         |
//|                 char      | char      | int            |
//|                 char      | int       | int            |
//|                 char      | long      | long           |
//|                 char      | float     | float          |
//|                 char      | double    | double         |
//|                 int       | int       | int            |
//|                 int       | long      | long           |
//|                 int       | float     | float          |
//|                 int       | double    | double         |
//|                 long      | long      | long           |
//|                 long      | float     | float          |
//|                 long      | double    | double         |
//|                 float     | float     | float          |
//|                 float     | double    | double         |
//|                 double    | double    | double         |
//|                 String    | Any type  | String         |

//        byte, short, and char are promoted to int before arithmetic.
//
//                If either operand is long, result is long.
//
//                If either operand is float, result is float.
//
//                If either operand is double, result is double.
//
//                If any operand is String, result is String (concatenation).
//
//        boolean is not allowed in arithmetic operations.
         int y=7;
         int x= ++y + 8;
        System.out.println(x);

        char a='B';
//        ascii value of B is 66
//        ascii value of C is 67
        a++;
        System.out.println(a);

    }
}
