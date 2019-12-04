package l11classes;

public class Ex4 {

    public static void main(String[] args) {
        CyrillicChar isCyrillic = new CyrillicChar('И');
        //System.out.println(isCyrillic);
        System.out.println(CyrillicUtils.isCyrillic('И'));
        //CyrillicWord allCyrillic = new CyrillicWord("Иvaн");
        System.out.println(CyrillicUtils.allCyrillic("Ивaн"));
        System.out.println(CyrillicUtils.someCyrillic("Ivan"));
    }
}
