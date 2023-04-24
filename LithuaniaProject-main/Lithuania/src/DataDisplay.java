
public class DataDisplay {
	
	//size of map is (810,700)
	private String name;
    private String description;
    private double latitude;
    private double longitude;
	
	
    public DataDisplay(String name, String description, double latitude, double longitude) {
    	this.setName(name);
    	this.setDescription(description);
    	this.latitude = latitude;
    	this.longitude = longitude;

    }
    

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
