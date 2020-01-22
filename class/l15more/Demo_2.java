package l15more;

import java.util.stream.IntStream;

public class Demo_2 {
    public static void main(String[] args) {

        IntStream stream = IntStream.of(1, 3, 4, 5, 5, 5, 5, 6, 7, 8);

//        stream.
//                filter(x -> x % 2 != 0).
//                forEach(System.out::println);

//        System.out.println(stream.
//                filter(x -> x % 2 != 0).
//                sum());

//        System.out.println(stream.
//                filter(x -> x % 2 != 0).
//                average());

        stream.
                filter(x -> x % 2 != 0).
                distinct().
                forEach(System.out::println);

    }
}
