/*
Inversion count in array
Problem statement
Let j and k be two indices in an array A.
If j < K and A[j] > A[k], then the pair (j,k) is known as an “Inversion pair”.
You are required to implement the following function:
int InversionCount(int *A, int n);
The function accepts an array ‘A’ of ‘n’ unique integers as its argument. You are required to
calculate the number of ‘Inversion pair’ in an array A, and return.
Note:
If ‘A’ is NULL (None in case of python), return -1
If ‘n’ <2, return 0
Example:
Input:
A: 1 20 6 4 5
n: 5
Output:
5
Explanation:
The inversion pair in array A are (20,6),(20,4),(20,5),(6,4) and (6,5), the count of the inversions are
5, hence 5 is returned.
*/

import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,20,6,4,5};
		int count=0;
		for(int i=0;i<arr.length-1;i++){
		  for(int j=1;j<arr.length;j++){
		    if(i<j && arr[i]>arr[j]){
		        count++;
		    }
		  }
		}
		System.out.println(count);
	}
}
