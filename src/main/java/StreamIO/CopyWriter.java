package StreamIO;

import java.io.*;

public class CopyWriter {
    public static void copy(File source, File target) throws IOException {
        try(Reader reader = new FileReader(source); Writer writer = new FileWriter(target)){
            int c = 0;
            while ((c = reader.read()) != -1){
                writer.write(c);
            }
//            char[] buff = new char[1024 * 5];
//            while (reader.read(buff) != -1){
//                writer.write(buff);
//            }
        }
    }
}
