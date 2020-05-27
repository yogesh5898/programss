package procrateredAssesment.com.tcs;

public class Medical {
	private String name;
	private String disease;
	private String tablet;
	private int cost;
	public Medical(String name, String disease, String tablet, int cost) {
		super();
		this.name = name;
		this.disease = disease;
		this.tablet = tablet;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getTablet() {
		return tablet;
	}
	public void setTablet(String tablet) {
		this.tablet = tablet;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
