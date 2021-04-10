import java.util.Arrays;

public class Nurse extends Person {
	int[] roomNumbers;
	static int nameCount = 1;

	public Nurse() {
		super();

		roomNumbers = new int[2];
		setName(getName() + nameCount++);
	}

	@Override
	public String toString() {
		return "Nurse name: " + super.getName() + ", ID: " + super.getId() + ", Age: " + super.getAge() + " rooms: "
				+ Arrays.toString(roomNumbers);
	}

	public int[] getRoomNumbers() {
		return roomNumbers;
	}

	public void setRoomNumbers(int[] roomNumbers) {
		this.roomNumbers = roomNumbers;
	}

	public void setFirstRoom(int roomNumber) {
		this.roomNumbers[0] = roomNumber;
		this.roomNumbers[1] = 0;
	}

	public void setSecondRoom(int roomNumber) {
		if (this.roomNumbers[1] != 0 && this.roomNumbers[0] != 0)
			System.out.println("Error - All rooms assigned for this nurse");
		else if (this.roomNumbers[1] != 0 && this.roomNumbers[0] == 0)
			this.roomNumbers[0] = roomNumber;
		else
			this.roomNumbers[1] = roomNumber;
	}

}
