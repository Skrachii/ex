package emil.l7methods;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class Ex7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i > -500000; i--) {
            if ( i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
            if (i < 0)
                break;
        }

    }
}
