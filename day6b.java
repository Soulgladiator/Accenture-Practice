import java.util.*;
class solution{
	public static void main(String[] args){
		int arr[] = {4,1,5};
		int res =0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			if(i==0){res+= Math.abs(arr[i]-arr[i+1]);}
			else if(i==arr.length-1){res+=Math.abs(arr[i-1]-arr[i]);}
			else {
				int res1 = Math.abs(arr[i]-arr[i+1]);
				int res2 = Math.abs(arr[i]-arr[i-1]);
				if(res1>=res2){res+=res2;}
				else{res+=res1;}
			}
		}
		System.out.println(res);
	}
}
