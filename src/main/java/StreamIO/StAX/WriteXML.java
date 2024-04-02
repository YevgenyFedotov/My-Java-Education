package StreamIO.StAX;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;

public class WriteXML {
    public static void writeXML(File file) throws IOException, XMLStreamException {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileWriter(file));
            writer.writeStartDocument();
            writer.writeStartElement("users");
                writer.writeStartElement("Yevgeny");
                    writer.writeStartElement("id");
                        writer.writeCharacters("01");
                    writer.writeEndElement();
                    writer.writeStartElement("name");
                        writer.writeCharacters("Yevgeny");
                    writer.writeEndElement();
                writer.writeEndElement();
            writer.writeEndElement();
            writer.writeEndDocument();
            writer.flush();
            writer.close();
    }
}
