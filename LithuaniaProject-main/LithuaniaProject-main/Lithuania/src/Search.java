import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Search {

	public static HashMap<String, ArrayList<String>> CastlesMap = new HashMap<String, ArrayList<String>>();

	public Search(String[] TopPlaces) throws Exception {

		for (int i = 0; i < TopPlaces.length - 1; i++) {
			// readFileAsString("Lithuania/src/TextFiles/Trakai.");
			readFileAsString(TopPlaces[(i)]);

		}
		new Selection();
	}

	public static void readFileAsString(String fileName) throws Exception {
		ArrayList<String> list = new ArrayList<String>();

		try {
			Scanner s = new Scanner(new File(fileName));

			while (s.hasNextLine()) {
				try {
					list.add(s.nextLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			CastlesMap.put("Trakai", list);
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
