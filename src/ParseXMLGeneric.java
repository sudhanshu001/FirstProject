import java.io.File;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class ParseXMLGeneric {
@Test
public void parseXML()
{
	new InputSource();
	
	try {
        File inputFile = new File("Students.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        XPathFactory xPathfactory = XPathFactory.newInstance();
        XPath xpath = xPathfactory.newXPath();
        NodeList nodes=(NodeList) xpath.evaluate("//*[contains(text(),'${')]",doc,XPathConstants.NODESET);
        doc.getDocumentElement().normalize();
        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
        NodeList nList = doc.getElementsByTagName("student");

Transformer transformer = TransformerFactory.newInstance().newTransformer();
transformer.setOutputProperty(OutputKeys.INDENT, "yes");
transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
//initialize StreamResult with File object to save to file
StreamResult result = new StreamResult(new StringWriter());
DOMSource source = new DOMSource(doc);
transformer.transform(source, result);
String xmlString = result.getWriter().toString();
System.out.println(xmlString);


        System.out.println("----------------------------");
        //System.out.println(nList.toString());
        for (int temp = 0; temp < nList.getLength(); temp++) {
           Node nNode = nList.item(temp);
           System.out.println(nNode.hasChildNodes());
           System.out.println("\nCurrent Element :" + nNode.getNodeName());
           
           if (nNode.getNodeType() == Node.ELEMENT_NODE) {
              Element eElement = (Element) nNode;
              
              System.out.println("Student roll no : " + eElement.getAttribute("rollno"));
              
              System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
              System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
              System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
              System.out.println("Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
           }
        }
     } catch (Exception e) {
        e.printStackTrace();
     }
}
}
