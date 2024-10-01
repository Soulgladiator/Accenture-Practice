import java.util.*;
class solution{
public static void main(String[] args){
	int arr[] = {1,2,1,2,3,1};
	int max = -1;
	for(int  i=0;i<arr.length;i++){
		if(arr[i]>max){max = arr[i];}
	}
	int has[] = new int[max+1];
	for(int  i=0;i<arr.length;i++){
		has[arr[i]]+=1;
	}
	int pair =0;
	for(int i=0;i<has.length;i++){
		pair = pair+(has[i]/2);
	}
	System.out.println(pair);
}
}
