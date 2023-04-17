
 
import java.nio.file.*;
 
public class ReadTextAsString {
   
  public static String readFileAsString(String fileName)throws Exception
  {
    String data = "";
    data = new String(Files.readAllBytes(Paths.get(fileName)));
    return data;
  }
 
  public static void main(String[] args) throws Exception
  {
    String data = readFileAsString("Lithuania/src/TextFiles/Test1.");
    System.out.println(data);
  }
}