package StreamIO.Serialization;

import Unsorted.Account.Account;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\19722618\\IdeaProjects\\YevgenyProject\\Account.bin");
        try {
            file.createNewFile();
            serialize(file);
            deserialize(file);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void serialize(File file) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(new Account(5, 10000, "Yevgeny"));
        }
    }
    private static void deserialize(File file) throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            Account account = (Account) ois.readObject();
            System.out.println(account.toString());
        }
    }
}
