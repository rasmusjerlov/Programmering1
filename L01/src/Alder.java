public class Alder {

    public static void main(String[] args) {
        // a er første barn, b er andet barn osv.
        double a = 6;
        double b = 6;
        double c = 8;
        double d = 15;
        double e = 16;
        double f = 18;
        System.out.println("6 + 6 + 8 + 15 + 16 + 18 / 6");
        System.out.println("6 er antallet af børn");
        System.out.println("Gennemsnittet for lærerens børns alder er: "+(a + b + c + d + e + f)/6);

        // a, b og c er drenge. d, e og f er piger
        System.out.println("");
        System.out.println("3 er antallet af drenge");
        System.out.println("(6 + 6 + 8) / 3");
        System.out.println("Gennemsnitsalderen for lærerens drenge er: "+(a +b + c)/3);

        System.out.println("");
        System.out.println("3 er antallet af piger");
        System.out.println("(15 + 16 + 18) / 3");
        System.out.println("Gennemsnitsalderen for lærerens piger er: "+(d + e + f)/3);

    }

}