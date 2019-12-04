package l11classes;

public class CyrillicUtils {

    public static boolean allCyrillic(String s){
        boolean result = true;
        for (int i = 0; i <s.length() ; i++) {
            if (!isCyrillic(s.charAt(i))){
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isCyrillic(char c){

        if (c>1040 && c<1103){
            return true;
        }
        return false;
    }

    public static boolean someCyrillic(String l){
        boolean result = false;
        for (int i = 0; i <l.length() ; i++) {
            if (isCyrillic(l.charAt(i))){
                result = true;
                break;
            }

        }
        return result;
    }
}
