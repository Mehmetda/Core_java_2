package FOR_LOOPS;

public class C01_ForLoops {
    public static void main(String[] args) {
        int toplam=0;
        for (int i = 1; i <=100; i++) {

            toplam+=i;

        }
        System.out.println(toplam);

        int baş=20;
        int bitiş=61;
        for (int i = baş; i <=bitiş ; i+=3) {
            System.out.print(i+ " ");

        }

        System.out.println();

        int input =1000;
        for (int i = input; i >=1 ; i--) {
            if(i%3==0){
                System.out.print(i+ " ");
            }

        }

    }

}
