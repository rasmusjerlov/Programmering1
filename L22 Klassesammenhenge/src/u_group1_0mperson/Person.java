package u_group1_0mperson;

public class Person {
	private String name;

	/**
	 * Pre: group != null
	 */
	public Person(String name, Group group) {
		this.name = name;
		group.addPerson(this);
	}

	@Override
	public String toString() {
		return name;
	}
}
