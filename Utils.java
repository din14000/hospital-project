import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.*;

public class Utils {
	static List<Person> doctorsList = new ArrayList<>();
	static List<Person> nursesList = new ArrayList<>();
	static List<Person> patientsList = new ArrayList<>();
	static List<Room> roomsList = new ArrayList<>();
	static Hospital hospital = new Hospital();
	public static Map<Room, Person[]> map = new HashMap<>();
	private final static int PATIENTS_PER_ROOM = 5;
	private static final int AMOUNT_OF_DISEASES = 5;

	public static final String hospitalStatsBanner = " __   __  _______  _______  _______  ___   _______  _______  ___        _______  _______  _______  _______  ___   _______  _______  ___   _______  _______ \r\n"
			+ "|  | |  ||       ||       ||       ||   | |       ||   _   ||   |      |       ||       ||   _   ||       ||   | |       ||       ||   | |       ||       |\r\n"
			+ "|  |_|  ||   _   ||  _____||    _  ||   | |_     _||  |_|  ||   |      |  _____||_     _||  |_|  ||_     _||   | |  _____||_     _||   | |       ||  _____|\r\n"
			+ "|       ||  | |  || |_____ |   |_| ||   |   |   |  |       ||   |      | |_____   |   |  |       |  |   |  |   | | |_____   |   |  |   | |       || |_____ \r\n"
			+ "|       ||  |_|  ||_____  ||    ___||   |   |   |  |       ||   |___   |_____  |  |   |  |       |  |   |  |   | |_____  |  |   |  |   | |      _||_____  |\r\n"
			+ "|   _   ||       | _____| ||   |    |   |   |   |  |   _   ||       |   _____| |  |   |  |   _   |  |   |  |   |  _____| |  |   |  |   | |     |_  _____| |\r\n"
			+ "|__| |__||_______||_______||___|    |___|   |___|  |__| |__||_______|  |_______|  |___|  |__| |__|  |___|  |___| |_______|  |___|  |___| |_______||_______|\r\n";

	public static final String hospitalOutputBanner = " __   __  _______  _______  _______  ___   _______  _______  ___        _______  __   __  _______  _______  __   __  _______ \r\n"
			+ "|  | |  ||       ||       ||       ||   | |       ||   _   ||   |      |       ||  | |  ||       ||       ||  | |  ||       |\r\n"
			+ "|  |_|  ||   _   ||  _____||    _  ||   | |_     _||  |_|  ||   |      |   _   ||  | |  ||_     _||    _  ||  | |  ||_     _|\r\n"
			+ "|       ||  | |  || |_____ |   |_| ||   |   |   |  |       ||   |      |  | |  ||  |_|  |  |   |  |   |_| ||  |_|  |  |   |  \r\n"
			+ "|       ||  |_|  ||_____  ||    ___||   |   |   |  |       ||   |___   |  |_|  ||       |  |   |  |    ___||       |  |   |  \r\n"
			+ "|   _   ||       | _____| ||   |    |   |   |   |  |   _   ||       |  |       ||       |  |   |  |   |    |       |  |   |  \r\n"
			+ "|__| |__||_______||_______||___|    |___|   |___|  |__| |__||_______|  |_______||_______|  |___|  |___|    |_______|  |___|  \r\n";

	public static void amountOfPeople() {
		System.out.println("Amount of Patients: " + patientsList.size());
		System.out.println("Amount of Nurses: " + nursesList.size());
		System.out.println("Amount of Doctors: " + doctorsList.size() + "\n");
	}

	public static void allPatientsSickTimeAvg() {
		System.out.println("The average time to cure of all the patients is " + patientsList.stream()
				.mapToInt(patient -> ((Patient) patient).getDisease().getTimeToCure()).average().orElse(0) + " days\n");
	}

	public static void avgSickTimePerDisease() {
		double[] sums = new double[PATIENTS_PER_ROOM];
		double[] amounts = new double[PATIENTS_PER_ROOM];

		for (int i = 0; i < sums.length; i++) {
			patientsList.forEach(
					patients -> sums[((Patient) patients).getDisease().getDiseaseValue()] += ((Patient) patients)
							.getDisease().getTimeToCure());
			patientsList.forEach(patients -> amounts[((Patient) patients).getDisease().getDiseaseValue()] += 1);
		}

		for (int i = 0; i < sums.length; i++) {
			if (amounts[i] == 0)
				sums[i] = 0;
			else
				sums[i] /= amounts[i];
		}

		System.out.println("The average time to cure for each disease is: ");
		for (int i = 0; i < sums.length; i++)
			System.out.println(DiseaseDescription.getDiseaseName(i) + ": "
					+ Double.parseDouble(new DecimalFormat("##.##").format(sums[i])) + " days");
		System.out.println();
	}

	public static void avgPatientsAgePerRoom() {
		double[] sums = new double[PATIENTS_PER_ROOM];
		double[] amounts = new double[PATIENTS_PER_ROOM];

		map.forEach((room, person) -> {
			int currRoom = room.getRoomNumber() - 1;
			for (int i = 0; i < person.length; i++) {
				if (person[i] instanceof Patient) {
					sums[currRoom] += person[i].getAge();
					amounts[currRoom] += 1;
				}
			}
		});

		System.out.println("The average age of patients per room is: ");
		for (int i = 0; i < sums.length; i++)
			System.out.println("Room number: " + (i + 1) + " Average patient age:  " + sums[i] / amounts[i] + " years");
		System.out.println();
	}

	public static void mostCommonDisease() {

		System.out.print("The most common disease among all patients is ");

		int[] amounts = new int[AMOUNT_OF_DISEASES];

		patientsList.forEach(patient -> {
			int curr = ((Patient) patient).getDisease().getDiseaseValue();
			amounts[curr] += 1;
		});
		int max = Arrays.stream(amounts).max().getAsInt();
		for (int i = 0; i < amounts.length; i++) {
			if (amounts[i] == max)
				System.out.print(
						DiseaseDescription.getDiseaseName(i) + " with " + max + " patients having this disease;	 ");
		}
		System.out.println("\n");
	}

	public static void mostUncommonDisease() {
		System.out.print("The most uncommon (rare) disease among all patients is ");

		int[] amounts = new int[AMOUNT_OF_DISEASES];

		patientsList.forEach(patient -> {
			int curr = ((Patient) patient).getDisease().getDiseaseValue();
			amounts[curr] += 1;
		});
		int min = Arrays.stream(amounts).min().getAsInt();
		for (int i = 0; i < amounts.length; i++) {
			if (amounts[i] == min)
				System.out.print(
						DiseaseDescription.getDiseaseName(i) + " with " + min + " patients having this disease; ");
		}
		System.out.println("\n");
	}
	
	public static void avgStaffAge() {
		List<Person> staffList = new ArrayList<>();
		staffList.addAll(doctorsList);
		staffList.addAll(nursesList);
		
		System.out.println( "The average age of all the staff (doctors and nurses) is " + staffList.stream()
		.mapToInt(staff -> staff.getAge()).average().orElse(0) + " years\n" );
	}

	public static void initHospital() {
		initRoom();
		Hospital.setRoomsList(roomsList);
		Hospital.setDoctorsList(doctorsList);
		Hospital.setNursesList(nursesList);
		Hospital.setPatientsList(patientsList);
		System.out.println(hospital);
	}

	public static void initRoom() {
		for (int i = 0; i < PATIENTS_PER_ROOM; i++) {

			Room room = new Room();
			Doctor doctor = new Doctor();
			Nurse nurse = new Nurse();
			Patient[] patients = new Patient[PATIENTS_PER_ROOM];
			for (int j = 0; j < patients.length; j++) {
				patients[j] = new Patient();
			}

			room.setDoctor(doctor);
			room.setNurse(nurse);
			room.setPatients(patients);
			Person[] people = new Person[patients.length + 2];
			for (int j = 0; j < people.length; j++) {
				if (j < patients.length)
					people[j] = patients[j];
				else if (j == patients.length)
					people[j] = nurse;
				else
					people[j] = doctor;
			}
			maintainLists(room, people);
		}
	}

	public static void maintainLists(Room room, Person person[]) {

		for (int i = 0; i < person.length; i++) {
			if (person[i] instanceof Doctor) {
				Doctor doctor = (Doctor) person[i];
				doctorsList.add(doctor);
				doctor.setRoomNumber(room.getRoomNumber());
			} else if (person[i] instanceof Nurse) {
				Nurse nurse = (Nurse) person[i];
				nurse.setFirstRoom(room.getRoomNumber());
				nursesList.add(nurse);
			} else if (person[i] instanceof Patient) {
				patientsList.add(person[i]);
			}
		}
		map.put(room, person);
		roomsList.add(room);
	}

	public static String printRoomList(List<Room> list) {
		String s = "";
		Iterator<Room> iterator = list.iterator();
		while (iterator.hasNext()) {
			s += iterator.next().toString()
					+ "---------------------------------------------------------------------------------------------------------\n";
		}
		s.trim();
		return s;
	}

	public static String printArray(Object[] arr) {
		String s = "";
		for (int i = 0; i < arr.length - 1; i++) {
			s += arr[i].toString() + "\n ";
		}
		s += arr[arr.length - 1].toString() + "\n";
		s.trim();
		return s;
	}

}
