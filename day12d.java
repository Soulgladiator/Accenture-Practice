import java.util.*;
class solution{
	private static int gcd(int a , int b){
	  while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int count =0;
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<size-1;i++){
			for(int j=i+1;i<size;i++){
				if(gcd(arr[i], arr[j]) == 1){
				  System.out.println("["+arr[i]+","+arr[j]+"]");
					count++;
				}
			}
		}
		System.out.println("result:"+count);
	}
}
