package l11classes;

public class CyrillicChar {

    private char c;
    private String s;

   public CyrillicChar(char c) {
       this.c = c;
  }
   public static boolean isCyrillic(char c){

        if (c>1040 && c<1103){
            return true;
        }
        return false;
    }
    public String toString(){
        return String.format("Is cyrillic: %c \n"+ isCyrillic(c), c );
    }

    public char getC() {
        return c;
    }
    public void setC(char c) {
        this.c = c;
    }


}
