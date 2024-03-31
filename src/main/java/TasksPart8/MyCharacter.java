package TasksPart8;

public class MyCharacter {
    private char symbol;

    public static void main(String[] args) {
        MyCharacter character1 = new MyCharacter('0');
        MyCharacter character2 = new MyCharacter('a');
        System.out.println(character1.equals(character2));
        System.out.println(character1.isDigit());
        System.out.println(MyCharacter.isLetterOrDigit('@'));
        System.out.println(MyCharacter.toUpperCase('A'));
    }

    public MyCharacter(char symbol){
        this.symbol = symbol;
    }
    public char charValue(){
        return symbol;
    }
    public int compareTo(MyCharacter anotherCharacter){
        return symbol - anotherCharacter.symbol;
    }
    public boolean equals(MyCharacter anotherCharacter){
        if(this.compareTo(anotherCharacter) == 0){
            return true;
        }
        return false;
    }
    public boolean isDigit(){
        return isDigit(symbol);
    }

    public static boolean isDigit(char symbol){
        if(symbol >= '0' && symbol <= '9'){
            return true;
        }
        return false;
    }
    public static boolean isLetter(char symbol){
        if(isLowerCase(symbol) || isUpperCase(symbol)){
            return true;
        }
        return false;
    }
    public static boolean isLetterOrDigit(char symbol){
        if (MyCharacter.isDigit(symbol) || MyCharacter.isLetter(symbol)){
            return true;
        }
        return false;
    }
    public static boolean isUpperCase(char symbol){
        if(symbol >= 'A' && symbol <= 'Z'){
            return true;
        }
        return false;
    }
    public static boolean isLowerCase(char symbol){
        if(symbol >= 'a' && symbol<= 'z'){
            return true;
        }
        return false;
    }
    public static char toUpperCase(char symbol){
        if (isLowerCase(symbol)){
            return (char)(symbol - 32);
        }
        return symbol;
    }
    public static char toLowerCase(char symbol){
        if (isUpperCase(symbol)){
            return (char)(symbol + 32);
        }
        return symbol;
    }
}
