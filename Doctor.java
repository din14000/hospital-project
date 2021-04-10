
public class Doctor extends Person {
	private DiseaseDescription diseaseSpecialty;
	private int roomNumber;
	private static int nameCount = 1;

	public Doctor() {
		super();
		setName(getName() + nameCount++);
		this.diseaseSpecialty = DiseaseDescription.getRandomDisease();
	}

	@Override
	public String toString() {
		return "Doctor name: " + getName() + ", ID: " + super.getId() + ", Age: " + super.getAge()
				+ " specializes at curing " + diseaseSpecialty + " and belongs to room " + roomNumber;

	}

	public DiseaseDescription getDiseaseSpecialty() {
		return diseaseSpecialty;
	}

	public void setDiseaseSpecialty(DiseaseDescription diseaseSpecialty) {
		this.diseaseSpecialty = diseaseSpecialty;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

}