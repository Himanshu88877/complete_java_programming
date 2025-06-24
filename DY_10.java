public class DY_10 {
    public static void main(String[] args) {
        System.out.println("string methods");
//        some commonly used string method are
        String name="himanshu";
//     index num --- 01234567
        int a = name.length();
        System.out.println(a);

        String nameLower=name.toLowerCase();
        System.out.println(nameLower);

        String nameUpper=name.toUpperCase();
        System.out.println(nameUpper);

        String name2="     java    ";
        String trimName=name2.trim();
        System.out.println(trimName);

        String nameSub=name.substring(3);
        System.out.println(nameSub);
        String nameSub2=name.substring(0,3);
        System.out.println(nameSub2);

        String str2=name2.replace("j","b");
        System.out.println(str2);

        String n="harry";
        String str3=n.replace("r","p");
        System.out.println(str3);



        boolean b1=name.startsWith("hi");
        System.out.println(b1);

        boolean b2=name.endsWith("h");
        System.out.println(b2);

        char s=name.charAt(6);
        System.out.println(s);

        int n1=name.indexOf("m");
        System.out.println(n1);
        int n2=n.lastIndexOf("r");
        System.out.println(n2);

        int n3=n.lastIndexOf("r",2);
        System.out.println(n3);

        int n4=name.lastIndexOf("m",1);
        System.out.println(n4);

        boolean b3=name.equals("Himanshu");
        System.out.println(b3);

        boolean b4=name.equalsIgnoreCase("HIMANSHU");
        System.out.println(b4);

//        escape sequence character
        System.out.println("the new line start from \n , i am \t tab ,use me for" +
                " \" single qoute, use me \\ for backlash");



    }

}
