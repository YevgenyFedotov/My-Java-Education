package StreamIO;

import java.io.*;

public class CopyWriter {
    public static void copy(File source, File target) throws IOException {
        try(Reader reader = new FileReader(source); Writer writer = new FileWriter(target)){
            int c = 0;
            while ((c = reader.read()) != -1){
                writer.write(c);
            }
        }
    }

    public static void copyWithBuffer(File source, File target) throws IOException {
        try(Reader reader = new FileReader(source); Writer writer = new FileWriter(target)){
            int c = 0;
            char[] buff = new char[1024]; //буфер на 1 кБайт
            /*
            Заметка: если сделать размер буфера больше чем размер файла-источника,
            то размер нового файла будет размером с буфер, т.е. содержимое одинаковое,
            но новый файл будет весить больше
             */
            while (reader.read(buff) != -1){
                writer.write(buff);
            }
        }
    }
}
