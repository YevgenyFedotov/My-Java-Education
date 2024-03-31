package TasksPart8;

public class MyString {
    private char[] string;

    public static void main(String[] args) {
        MyString string = new MyString(new char[]{'1','2','3','#','4','5','6','7','8','9'});
        string.println();
        string = string.substring(3);
        string.println();
        MyString string1 = new MyString(new char[]{'1','2','3','#','@','4','5','6','#','@','7','8','9','#','a','b','c'});
        MyString[] strings = MyString.split(string1 , new MyString(new char[]{'#','@'}));
        MyString.println(strings);

    }
    public MyString(char[] chars){
        this.string = new char[chars.length];
        for(int i = 0 ; i < this.length() ; i++){
            string[i] = chars[i];
        }
    }

    public char charAt(int index){
        if (index >= 0){
            return string[index];
        }
        return '?';
    }

    public int length(){
        return string.length;
    }

    public MyString substring(int begin, int end){
        MyString newString = new MyString(new char[end - begin]);
        for(int i = begin ; i < end ; i++){
            newString.string[i - begin] = this.string[i];
        }
        return newString;
    }
    public MyString substring(int begin){
        return this.substring(begin, this.length());
    }

    public void toLowerCase(){
        for (int i = 0 ; i < this.length() ; i++){
            string[i] = MyCharacter.toLowerCase(string[i]);
        }
    }
    public void toUpperCase(){
        for (int i = 0 ; i < this.length() ; i++){
            string[i] = MyCharacter.toUpperCase(string[i]);
        }
    }

    public static MyString valueOf(int value){
        int tempValue = value;
        int count = 0;
        while (tempValue != 0){
            tempValue = tempValue / 10;
            count++;
        }
        MyString string = new MyString(new char[count]);

        while (count!=0){
            string.string[count - 1] = (char)(value % 10 + '0');
            value /= 10;
            count--;
        }
        return string;
    }
    public static MyString valueOf(boolean value){
        if(value == true){
            return new MyString(new char[]{'t','r','u','e'});
        }
        return new MyString(new char[]{'f','a','l','s','e'});
    }

    public char[] toChars(){
        return this.string;
    }

    public boolean equals(MyString obj){
        if(this.length() != obj.length()){
            return false;
        }
        for( int i = 0 ; i < this.length() ; i ++){
            if(this.string[i] != obj.string[i]){
                return false;
            }
        }
        return true;
    }

    public static MyString[] split(MyString string, MyString regex){
        int count = 0;
        if (indexOf(string, regex)[0] == -1 || indexOf(string, regex)[1] == -1){
            System.out.println("Подстроки не найдены");
            return null;
        }
        MyString[] strings = new MyString[0];
        while (true){
            int[] position = indexOf(string, regex);
            if(position[0] == -1 || position[1] == -1){
                break;
            }
            count += 2;
            MyString[] newStrings = new MyString[2];
            newStrings[0] = string.substring( 0 , position[0] );
            newStrings[1] = string.substring(position[0] , position[1]);
            string = string.substring(position[1]);
            MyString[] tempStrings = new MyString[count];
            for (int i = 0 ; i < 2 ; i ++){
                tempStrings[tempStrings.length + i - 2] = newStrings[i];
            }
            for(int i = 0 ; i < strings.length ; i ++){
                tempStrings[i] = strings[i];
            }
            strings = tempStrings;
        }
        MyString[] tempStrings = new MyString[strings.length + 1];
        for (int i = 0 ; i < strings.length ; i ++){
            tempStrings[i] = strings[i];
        }
        tempStrings[tempStrings.length-1] = string;
        strings = tempStrings;

        return strings;
    }

    public static int indexOf(MyString string, MyCharacter character){
        for (int i = 0 ; i < string.length() ; i++){
            if ( string.charAt(i) == character.charValue()){
                return i;
            }
        }
        return -1;
    }
    public static int[] indexOf(MyString string, MyString substring){
        int[] position = new int[]{-1,-1};
        while (true){
            position[0] = indexOf(string, new MyCharacter(substring.charAt(0)));
            if(position[0] == -1) {
                return position;
            }
            if(string.substring(position[0],position[0] + substring.length()).equals(substring)){
                position[1] = position[0] + substring.length();
                return position;
            }
            string = string.substring(position[0]+1);
        }
    }

    public void println(){
        for(int i = 0 ; i < length() ; i++){
            System.out.print(string[i]);
        }
        System.out.println();
    }
    public void print(){
        for(int i = 0 ; i < length() ; i++){
            System.out.print(string[i]);
        }
    }
    public static void println(MyString[] strings){
        if(strings != null){
            for( int i = 0 ; i < strings.length ; i ++){
                strings[i].print();
                System.out.print(" ");
            }
        }
    }
}
