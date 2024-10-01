import java.util.*;
class solution{
	private static int funct(int r, int unit, int arr[]){
		int food_needed = r*unit;
		int sum=0;
		if(arr.length==0){return -1;}
		for(int i=0;i<arr.length;i++){
			sum = sum+arr[i];
			if(sum>=food_needed){
				return i+1;
			}
		}
		if(sum<food_needed){return 0;}
		return 0;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int unit = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int result=funct(r,unit,arr);
		System.out.println("result "+result);
	}

}
