import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XmlValidator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Source xmlFile = new StreamSource(new File("test.xml"));

			SchemaFactory factory = SchemaFactory
					.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

			Source schemaFile = new StreamSource(new File(
					"EbookStoreSchema.xsd"));
			Schema schema = factory.newSchema(schemaFile);

			Validator validator = schema.newValidator();

			validator.validate(xmlFile);
			System.out.print("Validated!");

		} catch (SAXException e) {
			// instance document is invalid!
			System.err.println("Invalid XML");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
