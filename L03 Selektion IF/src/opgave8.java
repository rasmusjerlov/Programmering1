import java.util.Scanner;

public class opgave8 {
    public static String måned(int måned, int dag){
        String result ="";
        if (måned <= 3){
            result = "Vinter";
        }
        else if (måned <= 6){
            result = "Forår";
        }
        else if (måned <= 9){
            result = "Sommer";
        }
        else if (måned <= 12){
            result = "Efterår";
        }
//        if (måned == 2){
//            result = "Vinter";
//        }
//        if (måned == 3){
//            result = "Vinter";
//        }
//        if (måned == 4){
//            result = "Forår";
//        }
//        if (måned == 5){
//            result = "Forår";
//        }
//        if (måned == 6){
//            result = "Forår";
//        }
//        if (måned == 7){
//            result = "Sommer";
//        }
//        if (måned == 8){
//            result = "Sommer";
//        }
//        if (måned == 9){
//            result = "Sommer";
//        }
//        if (måned == 10){
//            result = "Efterår";
//        }
//        if (måned == 11){
//            result = "Efterår";
//        }
//        if (måned == 12){
//            result = "Efterår";
//        }
        if (måned % 3 == 0 && dag >= 21 && result.equals("Vinter")){
            result = "Forår";
        }
        if (måned % 3 == 0 && dag >= 21 && result.equals("Forår")){
            result = "Sommer";
        }
        if (måned % 3 == 0 && dag >= 21 && result.equals("Sommer")){
            result = "Efterår";
        }
        if (måned % 3 == 0 && dag >= 21 && result.equals("Efterår")){
            result = "Vinter";
        }
            return result;
}
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast en måned angivet i tal 1-12: ");
        int måned = input.nextInt();
        System.out.println("Indtast en dag i måneden angivet i tal 1-30: ");
        int dag = input.nextInt();
        System.out.println("Årstiden er: " + måned(måned, dag));

    }
}
