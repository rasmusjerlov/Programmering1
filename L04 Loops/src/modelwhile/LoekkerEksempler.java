package modelwhile;

public class LoekkerEksempler {

    public static void main(String[] args) {

        System.out.println("Kald af metoden udskriv1_10()");
        udskriv1_10();
        System.out.println();

//        System.out.println("Kald af metoden udskriv1_10_iteration()");
//        udskriv1_10_iteration();
//        System.out.println();
//
//        System.out.println("Resultat af kald til summer() "+ summer());
//        System.out.println("Resultat af kald til summer(10)  "+  summer(10));
//        System.out.println("Resultat af kald til multiplum(4,3)  " + multiplum(4, 3));



    }

    public static void udskriv1_10() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");

    }
    public static void eksempel1(){
        int i = 1;
        while(i<10){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void eksempel2(){
        int i = 1;
        while(i<10){
            if (i%2 == 0){
                System.out.println(i);
                i++;
            }
        }
    }
    public static void eksempel3(){
        int i = 1;
        while(i<10){
            i++;
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void udskriv1_10_iteration() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static int summer() {
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum = sum + i;
            i++;

        }
        return sum;

    }

    public static int summer(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        return sum;

    }

    public static  int multiplum(int a, int b) {
        int resultat = 0;
        int i = 0;
        while (i < a) {
            resultat = resultat + b;
            i++;
        }
        return resultat;

    }

}
