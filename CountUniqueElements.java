/*
Problem Statement
Given an array of N elements. In the array, each element is present twice except for 1 element whose frequency in the array is 1. Hence the length of the array will always be odd.
Find the unique number.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int res=0;
        for(int i=0;i<n;i++){
            res= res^a[i];
        }
        System.out.println(res);
	}
}