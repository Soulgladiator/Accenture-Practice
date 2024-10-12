import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int r = sc.nextInt();
		for(int i=r;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<r;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
