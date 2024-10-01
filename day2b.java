import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {7,-3,8,2,-5,10,12,13,25,67,89};
		ArrayList<Integer> lst = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=0){lst.add(arr[i]);}
		}
		int result = lst.get((lst.size() -1)/2);
		System.out.println(result);
	}
}
