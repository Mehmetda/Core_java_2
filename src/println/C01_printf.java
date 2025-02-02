package println;

public class C01_printf {
    public static void main(String[] args) {
        for (int i = 1; i <6 ; i++) {
            for (int j = i; j <=5*i ; j+=i) {
                System.out.printf("%4d",j);


            }
            System.out.println();

        }
    }
}
