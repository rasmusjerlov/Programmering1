import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Hans");
        names.add("Viggo");
        names.add("Jens");
        names.add("Bente");
        names.add("Bent");

        System.out.println("The size of ArrayList names is: ");
        System.out.println(names.size());
        names.add(2, "Jane");

        System.out.println("The ArrayList consists of: ");
        System.out.println(names);

        System.out.println(names.get(1) + " has been removed: ");
        names.remove(1);
        System.out.println("The ArrayList is now: ");
        System.out.println(names);
        names.add(0, "Pia");
        System.out.println(names);
        names.add("Ib");
        System.out.println(names.size());
        names.set(2, "Hansi");
        System.out.println(names.size());
        System.out.println(names);

        System.out.println();
        System.out.println("For loop: ");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Length of " + names.get(i) + " is: " + names.get(i).length());
        }
        System.out.println();
        System.out.println("For each loop: ");
        for (String str : names) {
            System.out.println("Length of " + str + " is: " + str.length());
        }

    }
}
