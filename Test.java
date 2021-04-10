
public class Test {

	public static void main(String[] args) {

		System.out.println(Utils.hospitalOutputBanner);
		Utils.initHospital();
		System.out.println(
				"######################### Testing Nurse - adding another room for nurse 2 and room 3 #########################");
		Nurse nurse2 = (Nurse) Hospital.getNursesList().get(1);

		Room room3 = (Room) Hospital.getRoomsList().get(2);
		nurse2.setSecondRoom(room3.getRoomNumber());
		System.out.println(nurse2);
		System.out.println(
				"######################### Testing Nurse - adding 3rd room for nurse 2 and room 4 #########################");
		Room room4 = (Room) Hospital.getRoomsList().get(3);
		nurse2.setSecondRoom(room4.getRoomNumber());
		System.out.println(nurse2);

		System.out.println(Utils.hospitalStatsBanner + "\n");
		System.out.println(
				"######################### Testing Statistics - Amount of patients, nurses and doctors in the hospital #########################");
		Utils.amountOfPeople();
		System.out.println(
				"######################### Testing Statistics - Average time to cure of all the patients in the hospital #########################");
		Utils.allPatientsSickTimeAvg();
		System.out.println(
				"######################### Testing Statistics - Average time to cure of per disease of all the patients in the hospital #########################");
		Utils.avgSickTimePerDisease();
		System.out.println(
				"######################### Testing Statistics - Average age of patients per room  #########################");
		Utils.avgPatientsAgePerRoom();
		System.out.println(
				"######################### Testing Statistics - Most common disease in the hospital  #########################");
		Utils.mostCommonDisease();
		System.out.println(
				"######################### Testing Statistics - Most uncommon (rare) disease in the hospital  #########################");
		Utils.mostUncommonDisease();
		System.out.println(
				"######################### Testing Statistics -Avarage staff (doctors and nurses) age in the hospital  #########################");
		Utils.avgStaffAge();

	}

}
