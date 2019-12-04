package l11classes;

public class CyrillicWord {
    private String s;

    public CyrillicWord(String s){
        this.s = s;

    }
    public static boolean allCyrillic(String s){
        boolean result = true;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)<1040 && s.charAt(i)>1103){
                result = false;
                break;
            }


        }

        return result;
    }
    public String toString(){
        return String.format("All letters is cyrllic: %s \n" + allCyrillic(s), s);
    }
    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
