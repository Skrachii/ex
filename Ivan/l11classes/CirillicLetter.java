package l11classes;

public class CirillicLetter {

    private String s;

    public static boolean someCirillic(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 1040 && s.charAt(i) > 1103) {
                return false;

            }
            return true;

        }
        return false;

    }

        public String getS () {
            return s;
        }

        public void setS (String s){
            this.s = s;
        }

}