package StreamIO.StAX;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadXML {
    public static User readXML(File file){
        User user = new User();
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            XMLEventReader reader = factory.createXMLEventReader(new FileReader(file));
            while (reader.hasNext()){
                XMLEvent xmlEvent = reader.nextEvent();
                if(xmlEvent.isStartElement()){
                    StartElement startElement = xmlEvent.asStartElement();
                    if(startElement.getName().getLocalPart().equals("name")){
                        xmlEvent = reader.nextEvent();
                        user.setName(xmlEvent.asCharacters().getData());
                    }
                    else if(startElement.getName().getLocalPart().equals("id")){
                        xmlEvent = reader.nextEvent();
                        user.setId(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    }
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }
}
