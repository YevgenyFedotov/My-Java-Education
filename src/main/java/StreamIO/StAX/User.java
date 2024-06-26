package StreamIO.StAX;

public class User {
    private String name;
    private int id;

    public User(){}

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString(){
        return "name: " + name + "\nid: " + id;
    }

    private void doSomething(String action){
        System.out.println("doing: " + action);
    }
}
