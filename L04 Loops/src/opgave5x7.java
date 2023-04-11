public class opgave5x7 {

    public static String tuition() {
        double tuition = 10000;
        double inc = 1.05;
        int years = 0;
        while (years < 10) {
            tuition *= inc;
            System.out.println("The price after year " + years + " is: "  + tuition);
            years++;
        }
        int total = 0;
        while (years < 14) {
            total += tuition;
            tuition *= inc;
            years++;
        }
        System.out.println("The total price for four years of tuition is " + total);
        return null;
    }

    public static void main(String[] args) {
        tuition();
    }

}