package net.projectmonolith;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("==========TASK 1==========");
	    task_1(new String[]{"C++", "C#", "java", "pascal", "php", "Javascript", "ActionScript"});
        System.out.println("==========TASK 2==========");
        task_2(10, 7);
        System.out.println("==========TASK 3==========");
        task_3(1, 2, 3,"addition");
        task_3(1, 2, 3,"multiplication");
        System.out.println("==========TASK 4==========");
        task_4(123);
        System.out.println("==========TASK 5==========");
        task_5(1234);
        System.out.println("==========TASK 6==========");
        task_5(123312310);
        System.out.println("==========TASK 7==========");
        System.out.println(task_7_1(21, 14));
        System.out.println(task_7_2(21, 24));
        System.out.println("==========TASK 8==========");
        task_8(100, 107);
        System.out.println("==========TASK 9==========");
        double[] arr = new double[]{14.88, 11.12, 13.345, 14.212, 201.221, 15.11, 3.1, 3.2};
        task_9(arr);
        System.out.println("==========TASK 10==========");
        task_10(arr);
        System.out.println("==========TASK 11==========");
        task_11();
        System.out.println("==========TASK 12==========");
        task_12();
    }

    private static void task_1(String[] programmingLanguages){
        for (String lang : programmingLanguages){
            System.out.println(lang);
        }
    }

    private static void task_2(int a, int b){
        System.out.println(a / b);
        System.out.println(b % a);
    }

    private static void task_3(int a, int b, int c, String operation){
        if (operation.contains("add")){
            System.out.println(a + b + c);
        }
        else if (operation.contains("mul")){
            System.out.println(a * b * c);
        }
    }

    private static void task_4(int input){
        char[] intAsCharArray = String.valueOf(input).toCharArray();
        for (char c : intAsCharArray) {
            System.out.println(c);
        }
    }

    private static void task_5(int input){
        char[] intAsCharArray = String.valueOf(input).toCharArray();
        int digitSum = 0;
        for (char c : intAsCharArray) {
            digitSum += Integer.parseInt(String.valueOf(c));
        }
        System.out.println(digitSum);
    }

    private static int task_7_1(int a, int b){
        if (b == 0){
            return a;
        }

        return task_7_1(b, a % b);
    }

    private static int task_7_2(int a, int b){
        if (a == 0 || b == 0) {
            return a + b;
        } else {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            int biggerValue = Math.max(absA, absB);
            int smallerValue = Math.min(absA, absB);
            return task_7_1(biggerValue % smallerValue, smallerValue);
        }
    }

    private static void task_8(int M, int N){
        for (int i = M; i < N; i++){
            System.out.println(i);
        }
    }

    private static void task_9(double[] array){
        double min = array[0], max = array[0];

        for (double val : array){
            System.out.println(val);
            if (val < min){
                min = val;
            }
            else if (val > max){
                max = val;
            }
        }

        System.out.printf("min = %.4f, max = %.4f%n", min, max);
    }

    private static void task_10(double[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                double temp = 0;
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(array[i]);
        }
    }

    private static void task_11(){
        int[] randomArray = new int[8];
        Random rand = new Random();
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = rand.nextInt(100);
            System.out.println(randomArray[i]);
        }
    }

    private static void task_12(){
        int[] array = createRandomArray(8);

        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                int temp = 0;
                if (array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(array[i]);
        }
    }

    private static int[] createRandomArray(int size){
        int[] randomArray = new int[size];
        Random rand = new Random();
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = rand.nextInt(100);
        }

        return randomArray;
    }
}
