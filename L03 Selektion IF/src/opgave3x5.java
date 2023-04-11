import java.util.Scanner;

public class opgave3x5 {
    public static String fremtid(int today, int future) {
        String result = "";
        if (today == 0) {
            result = " er søndag";
        }
        if (today == 1) {
            result = " er mandag";
        }
        if (today == 2) {
            result = " er tirsdag";
        }
        if (today == 3) {
            result = " er onsdag";
        }
        if (today == 4) {
            result = " er torsdag";
        }
        if (today == 5) {
            result = " er fredag";
        }
        if (today == 6) {
            result = " er lørdag";
        }
        int fremtidDag = (today + future) % 7;

        if (fremtidDag == 0){
            result = " er søndag";
        }
        if (fremtidDag == 1){
            result = " er mandag";
        }
        if (fremtidDag == 2){
            result = " er tirsdag";
        }
        if (fremtidDag == 3){
            result = " er onsdag";
        }
        if (fremtidDag == 4){
            result = " er torsdag";
        }
        if (fremtidDag == 5){
            result = " er fredag";
        }
        if (fremtidDag == 6){
            result = " er lørdag";
        }

        return result;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast dagen i dag:");
        System.out.println("Søndag = 0, Mandag = 1, Tirsdag = 2, Onsdag = 3, Torsdag = 4, Fredag = 5, Lørdag = 6");
        int today = input.nextInt();
        System.out.println("Indtast antal dage ud i fremtiden: ");
        int future = input.nextInt();
        System.out.println("I dag" + fremtid(today, future));
        int fremtidDag = (today + future) % 7;
        System.out.println("Dagen i fremtiden er: " + fremtidDag + " = " + fremtid(today, future));
    }
}
