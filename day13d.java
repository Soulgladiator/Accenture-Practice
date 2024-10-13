import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {4,5,6,7,8,3,2};
		int sum =0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(i%2==0){sum = sum+arr[i];count++;}
		}
		int result = sum/count;
		System.out.println("THE AVERAGE IS :"+result);
	}
}
