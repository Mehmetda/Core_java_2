package ders14_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C01_Arraylist {
    public static void main(String[] args) {
        List<Object>isimler=new ArrayList<>();

        isimler.add("ali can");
        isimler.add("veli can");
        isimler.add(5);
        isimler.add(true);

        System.out.println(isimler);



    }
}
