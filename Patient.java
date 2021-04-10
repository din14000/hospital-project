
public class Patient extends Person {
	Disease disease;
	static int nameCount = 1;

	public Patient() {
		super();

		setName(getName() + nameCount++);
		disease = new Disease();
	}

	@Override
	public String toString() {
		return "Patient name: " + super.getName() + ", ID: " + super.getId() + ", Age: " + super.getAge() + " has "
				+ disease.getDiseaseDescription() + " and will be cured in approximately " + disease.getTimeToCure()
				+ " days";
	}

	public Disease getDisease() {
		return disease;
	}

	public void setDisease(Disease disease) {
		this.disease = disease;
	}

}
