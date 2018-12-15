import javax.xml.parsers.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
public class Parser {

	public static void main(String[] args) {
		 try {
			 File xmlFile= new File("D:\\XML\\properties.xml");
			 DocumentBuilderFactory dbFactory= DocumentBuilderFactory.newInstance();
			 DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
			 Document doc=dBuilder.parse(xmlFile);
			 
			 System.out.println("Root Element:"+doc.getDocumentElement().getNodeName());
			 NodeList nList=doc.getElementsByTagName("staff");
			 System.out.println("----------------------------------");
			 for(int temp=0;temp<nList.getLength();temp++) {
				 Node nNode=nList.item(temp);
				 System.out.println("Current Element:"+nNode.getNodeName());
				 if(nNode.getNodeType()==Node.ELEMENT_NODE) {
					 Element element=(Element) nNode;
					 //System.out.println("id: "+element.getAttribute("id"));
					 //System.out.println("skills: "+element.getElementsByTagName("skills").item(0).getTextContent());
					 //System.out.println("certification: "+element.getElementsByTagName("certification").item(0).getTextContent());
				    System.out.println("First Name: "+element.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last Name: "+element.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Organization: "+element.getElementsByTagName("org").item(0).getTextContent());
					System.out.println("Unit: "+element.getElementsByTagName("unit").item(0).getTextContent());
				 }
				 
			 }
			 
		 }
		 catch(Exception e) {
			System.out.println(e.getMessage());
		 }
		

	}

}
