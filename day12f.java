import  java.util.*;
class solution{
        private static boolean is_palindrome(String str){
        	String tempo = str;
        	char[] cpy = str.toCharArray();
        	int right = str.length()-1;
        	int left =0;
        	while(left<right){
        		char temp = cpy[left];
        		cpy[left] = cpy[right];
        		cpy[right] = temp;
        		right--;
        		left++;
        	}
        	String tempo1 = new String(cpy);
        	return tempo.equals(tempo1);
        }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(is_palindrome(arr[i])){count++;}
		}
		System.out.println("count:"+count);
	}
}
