# Алгоритми

## Презентации

## Видео

## Упражнения

### Упр. 1
Разгледайте следния метод, който отпечатва линия от звезди със зададена дължина. 
~~~
public static void printStars(int n) {
    for (int i = 0; i < n; i++) {
        System.out.print("*");
    }
    System.out.println();   // end the line of output
}
~~~
Напишете метод, който да прави същото, но да не използва никакви цикли.

### Упр. 2
Напиши метод, който да пресмята факториела на дадено число, като използва рекурсия.

### Упр. 3
Напиши метод, 
~~~
public static int pow(int n, int m)
~~~
който да пресмята m-тата степен на числото n. Например, pow(3, 4) връща 81.

### Упр. 4
Напиши метод, който да пресмята числата на Фибоначи, която използва рекурсия. 

### Упр. 5
Напиши метод,
~~~
public static boolean isPalindrome(String s)
~~~
който да проверява дали даден символен низ е палиндром (чете се по един и същ начин отпред назад и отзад напред.) Ето премерни резултати от проверката на няколко низа:
~~~
isPalindrome("madam")	-> true
isPalindrome("racecar")	-> true
isPalindrome("step on no pets")	-> true
isPalindrome("able was I ere I saw elba")	-> true 
isPalindrome("Java")	-> false
isPalindrome("rotater")	-> false
isPalindrome("byebye")	-> false
isPalindrome("notion")	-> false
~~~
