package u_group01_0mperson;

import java.util.ArrayList;

public class Group {
	private String name;
	// association: --> 0..* Person
	private final ArrayList<Person> persons = new ArrayList<>();

	public Group(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	// -------------------------------------------------------------------------

	public ArrayList<Person> getPersons() {
		return new ArrayList<>(persons);
	}

	/**
	 * Adds the person to this group,
	 * if they aren't connected.
	 * Pre: The person isn't connected to another group.
	 */
	public void addPerson(Person person) {
		if (!persons.contains(person)) {
			persons.add(person);
		}
	}

	/**
	 * Removes the person from this group,
	 * if they are connected.
	 */
	public void removePerson(Person person) {
		if (persons.contains(person)) {
			persons.remove(person);
		}
	}
}
