import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlDomParser {

	//List of carts
	List<Cart> mycarts;
	Document dom;


	public XmlDomParser(){
		//create a list to hold the cart objects
		mycarts = new ArrayList<Cart>();
	}

	public void runExample() {
		
		//parse the xml file and get the dom object
		parseXmlFile();
		
		//get each cart element and create a cart object
		parseDocument();
		
		
		Connection conn = null;
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		//TODO Connect to DB and insert into db
				//Iterate through the list and print the data
		printData(conn);
				
		
	}
	
	

	private void parseXmlFile(){
		//get the factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			
			//Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			//parse using builder to get DOM representation of the XML file
			dom = db.parse("cart.xml");
			

		}catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}catch(SAXException se) {
			se.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

	
	private void parseDocument(){
		//get the root elememt
		Element docEle = dom.getDocumentElement();
		
		//get a nodelist of <cart> elements
		NodeList nl = docEle.getElementsByTagName("CART");
		if(nl != null && nl.getLength() > 0) {
			for(int i = 0 ; i < nl.getLength();i++) {
				
				//get the cart element
				Element el = (Element)nl.item(i);
				
				//get the Cart object
				Cart cart = getCart(el);
				
				//add it to list
				mycarts.add(cart);
			}
		}
	}


	/**
	 * take an cart element and read the values in, create
	 * a cart object and return it
	 * @param empEl
	 * @return
	 */
	private Cart getCart(Element empEl) {
		
		//for each <cart> element get text or int values of 
		//name ,id, age and name
		int cartid = getIntValue(empEl,"CartID");
		String isbn = getTextValue(empEl,"ISBN");
		String downloadlink = getTextValue(empEl,"DownloadLink");
		
		//Create a new cart with the value read from the xml nodes
		Cart cart = new Cart(cartid, isbn, downloadlink);
		
		return cart;
	}


	/**
	 * take a xml element and the tag name, look for the tag and get
	 * the text content 
	 * @param ele
	 * @param tagName
	 * @return
	 */
	private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if(nl != null && nl.getLength() > 0) {
			Element el = (Element)nl.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}

		return textVal;
	}

	
	/**
	 * Calls getTextValue and returns a int value
	 * @param ele
	 * @param tagName
	 * @return
	 */
	private int getIntValue(Element ele, String tagName) {
		//in production application you would catch the exception
		return Integer.parseInt(getTextValue(ele,tagName));
	}
	
	/**
	 * Iterate through the list and print the 
	 * content to console
	 */
	private void printData(Connection conn){
		
		System.out.println("No of carts '" + mycarts.size() + "'.");
		
		//TODO need to iterate
		System.out.println(mycarts.get(0).getDownloadlink());
		mycarts.get(0).insert(conn);
		
		/*
		Iterator it = mycarts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		*/
	}
	
	public static void main(String[] args){
		//create an instance
		XmlDomParser dpe = new XmlDomParser();
		
		//call run example
		dpe.runExample();
	}

}