import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import javax.xml.crypto.dsig.XMLObject;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class ParseXML {
	@Test
	public void parseXML() throws ParserConfigurationException, SAXException, IOException
	{
		
		DocumentBuilderFactory docBuildFact=DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuild=docBuildFact.newDocumentBuilder();
		Document doc=docBuild.parse("Books.xml");
		System.out.println(doc.getDocumentElement().getNodeName());
		NodeList list=doc.getElementsByTagName("book");
		for(int i=0;i<list.getLength();i++)
		{
			Node node=list.item(i);
			//System.out.println("\nCurrent Element :" + node.getNodeName());
			
			if(node.getNodeType()==Node.ELEMENT_NODE)
			{
				
				Element element=(Element)node;
				if(element.getAttribute("id").equals("bk103"))
				System.out.println(element.getElementsByTagName("title").item(0).getTextContent());
			}
		}
		
		
	}

}
