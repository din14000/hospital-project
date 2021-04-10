import java.util.ArrayList;
import java.util.List;

public class Hospital {
	private String name;
	private static List<Room> roomsList = new ArrayList<>();
	private static List<Person> doctorsList = new ArrayList<>();
	private static List<Person> nursesList = new ArrayList<>();
	private static List<Person> patientsList = new ArrayList<>();

	private static int id = 1;

	public Hospital() {
		this.name = "Hospital-" + id++;
		Hospital.roomsList.clear();
	}

	@Override
	public String toString() {
		return "########################################  " + name + "  	########################################\n"
				+ Utils.printRoomList(roomsList);

	}

	public static List<Room> getRoomsList() {
		return roomsList;
	}

	public static void setRoomsList(List<Room> roomsList) {
		Hospital.roomsList = roomsList;
	}

	public static List<Person> getDoctorsList() {
		return doctorsList;
	}

	public static void setDoctorsList(List<Person> doctorsList) {
		Hospital.doctorsList = doctorsList;
	}

	public static List<Person> getNursesList() {
		return nursesList;
	}

	public static void setNursesList(List<Person> nursesList) {
		Hospital.nursesList = nursesList;
	}

	public static List<Person> getPatientsList() {
		return patientsList;
	}

	public static void setPatientsList(List<Person> patientsList) {
		Hospital.patientsList = patientsList;
	}

}
