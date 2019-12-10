package ivan.l11;

public class Ex4 {

    public static void main(String[] args) {

        //System.out.println(isCyrillic);
        System.out.println(CyrillicUtils.isCyrillic('И'));
        //CyrillicWord allCyrillic = new CyrillicWord("Иvaн");
        System.out.println(CyrillicUtils.allCyrillic("Ивaн"));
        System.out.println(CyrillicUtils.someCyrillic("Ivan"));
    }
}
