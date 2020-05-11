package by.academy.HW1.Task6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите два числа, разделенные пробелом: размер массива и target:");
		String[] nk = sc.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        System.out.println("Введите значения массива, разделенные друг от друга пробелом:");
        String[] arrItems = sc.nextLine().split(" ");
                
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = pairs(k, arr);
        System.out.println(result);
        
        sc.close();
	}

    static int pairs(int k, int[] arr) {
        int pairsCount = 0;
        int delta = 0;
       
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        
        for (int i = 0; i < arr.length; i++) {
        	for (int j = 0; j < arrCopy.length; j++) {
        		delta = arr[i] - arrCopy[j];
        		if (k == delta) {
        			pairsCount++;
        		}
        	}
        }
        return pairsCount;
    }
}
