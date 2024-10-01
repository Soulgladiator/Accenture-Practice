import java.util.*;
class solution{
	public static void main(String[] args){
		int arr[] ={12,3,14,56,77,13,11};
		int num = 13,diff =2 ,count=0;
		for(int i=0;i<arr.length;i++){
			int comp = Math.abs(arr[i] - num);
			if(comp<=diff){count++;}\
		}
		System.out.println("RESULT:"+count);
	}
}
