
public class Room {
	private static int roomNumberCounter = 1;
	private int roomNumber;
	private Doctor doctor;
	private Nurse nurse;
	private Patient patients[];

	public Room() {
		this.roomNumber = roomNumberCounter;
		roomNumberCounter++;
		this.patients = new Patient[5];
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Nurse getNurse() {
		return nurse;
	}

	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}

	public Patient[] getPatients() {
		return patients;
	}

	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Room " + roomNumber + ":\nDoctor = " + doctor + ", \nNurse = " + nurse + ", \nPatients =\n "
				+ Utils.printArray(patients);
	}

}
