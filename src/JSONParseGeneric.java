import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;



public class JSONParseGeneric {
@Test
public void parse() throws JsonProcessingException, IOException  {
	
	String json = "";
	File file =new File("Restaurants.json");
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	String line;
	while((line=br.readLine())!=null)
	{
		json=json+line;
	}
	JsonFactory factory = new JsonFactory();

    ObjectMapper mapper = new ObjectMapper(factory);
    JsonNode rootNode = mapper.readTree(json);  
    getChildNodes(rootNode);
 
        
        
 }
	public static void getChildNodes(JsonNode rootNode)
	{
	    Iterator<Map.Entry<String,JsonNode>> fieldsIterator = rootNode.fields();
	    while (fieldsIterator.hasNext()) {
	    	
	    	Map.Entry<String,JsonNode> field = fieldsIterator.next();
	    	JsonNode node=field.getValue();
	    	//System.out.println(node);
	    	
	    	if(node.isContainerNode())

	    	{
	    		
	    		getChildNodes(node);
	        	
	    	}
	    	if(node.isArray())
	    	{
	    		
	    		for(int i=0;i<node.size();i++)
	    		{
	    			
	    			getChildNodes(node.get(i));
	    		}
	    	}
	    	else
	    	{
	    		System.out.println("Key: " + field.getKey() + "\tValue:" + field.getValue());
	    	}
	    }
		
	}
    

}
