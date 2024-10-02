import java.util.*;
class solution{
	public static void main(String[] args){
		int arr[] = {4,1,5};
		int res =0;
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){res += Math.abs(arr[i]-arr[0]);}
			else{res+=Math.abs(arr[i] - arr[i+1]);}
		}
		System.out.println("RESULT:"+res);
	}
}
