package emil.l3Conditionals;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

//        if (a >= b) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }
        int largest = a >= b ? a : b;
System.out.println(largest);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Enter three numbers :");
//        int firstNum = scanner.nextInt();
//        int secondNum = scanner.nextInt();
//        int thirdNum = scanner.nextInt();
//
//        int [] nums = {firstNum, secondNum, thirdNum};
//        int[] sortedNums =  Ex9.sortArray(nums);
//        int largestNum = sortedNums[sortedNums.length - 1];
//
//        System.out.println("The biggest number is: " + largestNum);
    }

//    private static int[] sortArray(int[] array) {
//        int[] new_array = new int[array.length];
//        int count=0;
//
//        for (int i=0; i<array.length; i++) {
//            for(int j=i+1; j<array.length+i;j++) {
//                if(array[i]>=array[j%array.length])
//                    count++;
//            }
//
//            for(int loc=count; loc>0;loc--) {
//                if(new_array[loc]==0)
//                {
//                    new_array[loc]=array[i];
//                    break;
//                }
//            }
//            count=0;
//        }
//
//        return new_array;
//    }
}




