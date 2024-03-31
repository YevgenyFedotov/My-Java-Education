package ExceptionTest;


public class Test {
    public static void main(String[] args) {
        int[] i = new int[10];
        try {
            setI(i, 10);
        } catch (Exception ex){
            System.out.println(ex.toString());
        }
    }

    public static void setI(int[] array, int index){
        array[index] = 1;
    }
}

