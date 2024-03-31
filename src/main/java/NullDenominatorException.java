public class NullDenominatorException extends Exception{

    public NullDenominatorException(){
        this("");
    }
    public NullDenominatorException(String message){
        super(message);
    }

}
