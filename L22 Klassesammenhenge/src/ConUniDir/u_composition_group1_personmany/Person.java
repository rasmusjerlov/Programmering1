package u_composition_group1_personmany;

public class Person {
    private String name;

    Person(String name) { // package visibility
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
