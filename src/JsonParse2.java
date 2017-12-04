import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;




public class JsonParse2 {
	@Test
public void parseJSON() throws IOException, ParseException
{
	String expectedHotelName="Parikrama - The Revolving Restaurant";
	File f=new File("Restaurants.json");
	FileReader fr=new FileReader(f);
	JSONObject obj=(JSONObject) new JSONParser().parse(fr);
	System.out.println(obj);
	JSONArray result=(JSONArray) obj.get("results");
	String hotelAddress = null;
	for(int i=0;i<result.size();i++)
	{
	  JSONObject obj1=(JSONObject) result.get(i);
	  String actualHoteName=(String) obj1.get("name");
	  if(expectedHotelName.equals(actualHoteName))
	  {
		  hotelAddress=(String) obj1.get("formatted_address");
	  }
	}
	
	System.out.println(hotelAddress);
	//Assert.assertEquals(hotelId, "a0ec6ada0d5240f9a646a59d7d90b15caa7f92e5");
}
}
