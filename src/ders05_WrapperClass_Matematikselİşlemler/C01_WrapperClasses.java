package ders05_WrapperClass_Matematikselİşlemler;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        String str="java";

        System.out.println(str.toUpperCase());
        Integer sayıW=30;
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);

      Character a='a';
        System.out.println(Character.isDigit(a));

        System.out.println(Character.isLowerCase(a));

        String str2="1234";

        String str3="1000";

        System.out.println(Integer.valueOf(str2) + Integer.valueOf(str3));

    }
}
