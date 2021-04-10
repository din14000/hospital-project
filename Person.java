
public abstract class Person {

	private static int personId = 1;
	private String name;
	private int age;
	private int id;

	public Person() {
		this.id = personId;
		personId++;
		this.name = this.getClass().getName();
		this.age = (int) ((Math.random() * 102) + 18);
	}

	public int getId() {
		return id;
	}

	public static int getPersonId() {
		return personId;
	}

	public static void setPersonId(int personId) {
		Person.personId = personId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
