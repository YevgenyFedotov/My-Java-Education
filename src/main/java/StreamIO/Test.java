package StreamIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test {
    public static void main(String[] args){
        //Задаем дирректорию для создания файлов
        String AbsPath = "C:\\Users\\19722618\\IdeaProjects\\YevgenyProject\\";
        //Создаем два объекта файл
        File file1 = new File(AbsPath + "File1.txt");
        File file2 = new File(AbsPath + "File2.txt");
        //Создаем в нашей указанной дирректории txt файлы
        try {
            System.out.println("File1 created: " + file1.createNewFile());
            System.out.println("File2 created: " + file2.createNewFile());

        } catch (IOException e) {
            e.printStackTrace();
        }
        //Проверяем можно ли записать в данные в File1
        System.out.println("File1 can write: " + file1.canWrite());
        //Записываем в первый файл текст
        try(Writer writer = new FileWriter(file1)) {
            writer.write("Red");
            writer.write("\nGreen");
            writer.write("\nBlue");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Удаляем созданные файлы
//        file1.delete();
//        file2.delete();
    }
}
