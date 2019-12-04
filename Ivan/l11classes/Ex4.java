package l11classes;

public class Ex4 {

    public static void main(String[] args) {
        CyrillicChar isCyrillic = new CyrillicChar('И');
        System.out.println(isCyrillic);
        CyrillicWord allCyrillic = new CyrillicWord("Иvaн");
        System.out.println(allCyrillic);


    }
}
