
public class Disease {

	private DiseaseDescription diseaseDescription;
	private int timeToCure = 0;

	public Disease() {
		diseaseDescription = DiseaseDescription.getRandomDisease();
		timeToCure += (int) (Math.random() * 18) + 3;
	}

	@Override
	public String toString() {
		return "Disease Description: " + diseaseDescription + ", Time to cure: " + timeToCure + " days";
	}
	public int getDiseaseValue() {
		return diseaseDescription.getValue();
	}
	public String getDiseaseDescription() {
		return diseaseDescription.name();
	}

	public int getTimeToCure() {
		return timeToCure;
	}

	public void setDiseaseDescription(DiseaseDescription diseaseDescription) {
		this.diseaseDescription = diseaseDescription;
	}

	public void setTimeToCure(int timeToCure) {
		this.timeToCure = timeToCure;
	}

}
