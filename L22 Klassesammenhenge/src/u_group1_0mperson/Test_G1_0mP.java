package u_group1_0mperson;

public class Test_G1_0mP {

    public static void main(String[] args) {
        Group g1 = new Group("G1");
        Group g2 = new Group("G2");

        Person p1 = new Person("P1", g1);
        Person p2 = new Person("P2", g1);

        System.out.println("Test 1:");
        System.out.println(g1.getPersons().contains(p1));
        System.out.println(g1.getPersons().contains(p2));

        // Before: g1 --> p1, g1 --> p2
        // After: g2 --> p1, g1 --> p2
        // Please note, that p1 can't be connected to 2 groups. 
        g1.removePerson(p1); // No automatic removal!
        g2.addPerson(p1);

        System.out.println("Test 2:");
        System.out.println(!g1.getPersons().contains(p1));
        System.out.println(g2.getPersons().contains(p1));
        System.out.println(g1.getPersons().contains(p2));


        // Before: g2 --> p1, g1 --> p2
        // After: g2 --> p1 and p2
        g1.removePerson(p2); // No automatic removal!
        g2.addPerson(p2);

        System.out.println("Test 3:");
        System.out.println(!g1.getPersons().contains(p2));
        System.out.println(g2.getPersons().contains(p1));
        System.out.println(g2.getPersons().contains(p2));

        // Before: g2 --> p1 and p2
        // After: g2 --> p2
        g2.removePerson(p1);

        System.out.println("Test 4:");
        System.out.println(!g2.getPersons().contains(p1));
        System.out.println(g2.getPersons().contains(p2));
    }
}
