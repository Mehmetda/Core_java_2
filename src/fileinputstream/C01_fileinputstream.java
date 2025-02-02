package fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_fileinputstream  {
    public static void main(String[] args) throws IOException {
        String path ="C:/Users/mehmet/Desktop/Documentary/ali.txt";
        FileInputStream fis=new FileInputStream(path);
        System.out.println((char)fis.read());
        int kontrol =0;
        String metin ="";
        while((kontrol=fis.read())!=-1){
            metin+=(char)kontrol;
        }
        System.out.println(metin);
         char karakter='a';
        System.out.println(karakter);

        if(karakter=='a'){
            System.out.println("doğru");
        }
    }
}
