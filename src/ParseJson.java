
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ParseJson {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		File file=new File("Sample.json");
		FileReader fr= new FileReader(file);
		JSONObject obj=(JSONObject)new JSONParser().parse(fr);
		System.out.print(obj);
		String firstname=(String) obj.get("firstName");
		String lastname=(String)obj.get("lastName");
		 Map address = ((Map)obj.get("address"));
        
	        // iterating address Map
	        Iterator<Map.Entry> itr1 = address.entrySet().iterator();
	        while (itr1.hasNext()) {
	            Map.Entry pair = itr1.next();
	            System.out.println(pair.getKey() + " : " + pair.getValue());
	        }
		
		System.out.println("firstName : "+firstname);
		System.out.println("lastName : "+lastname);
		//System.out.println(address);
		
		

	}

}
