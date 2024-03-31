class Data {

}

class Executor{
    public void runTask(Long id , Data data){

    }
}

public class Task {
    public static void main(String... args) {
        new Executor().runTask(43l, new Data());
        Throwable throwable = new Exception();
        Data data = new Data();
        Data data1 = new Data();
        System.out.println(data1.equals(data));

        String str = "i";

    }
}
class Parent{
    public Parent(String name){}
}
class Child extends Parent{

    public Child(String name) {
        super(name);
    }
}

