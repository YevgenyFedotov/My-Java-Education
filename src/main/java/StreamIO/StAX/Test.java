package StreamIO.StAX;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        File myXML = new File(StreamIO.Test.absPath + "myXML.xml");
        try {
            myXML.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            WriteXML.writeXML(myXML);
            User user = ReadXML.readXML(myXML);
            System.out.println(user.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
