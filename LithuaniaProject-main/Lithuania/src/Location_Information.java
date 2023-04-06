import java.util.ArrayList;
import java.util.List;

public class Location_Information {
	List<DataDisplay> DataDisplayList = new ArrayList<>();
	
	
	public Location_Information() {
		DataDisplayList.add(new DataDisplay("Location 1", "This is the description for Location 1.", 37.7749, -122.4194));
		DataDisplayList.add(new DataDisplay("Location 2", "This is the description for Location 2.", 40.7128, -74.0060));
		DataDisplayList.add(new DataDisplay("Location 3", "This is the description for Location 3.", 51.5074, -0.1278));
	}
	
	
}
