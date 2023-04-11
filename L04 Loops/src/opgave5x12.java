public class opgave5x12 {

    //Opgave 5.13
    public static String n3() {
        // Opgave 5.13
        int n = 0;
        while (Math.pow(n, 3) <= 12000) {
            System.out.println( n + "^3 = " + Math.pow(n, 3));
            n++;
        }
        System.out.println("The highest number to the power of 3 while being less than 12000 is: " + (n-1));
        return null;
    }

    //Opgave 5.12
    public static void main(String[] args) {
        int n = 0;
        while (Math.pow(n, 2) <= 12000) {
            System.out.println( n + "^2 = " + Math.pow(n, 2));
            n++;

        }
        System.out.println(n);

        n3();



    }
}
