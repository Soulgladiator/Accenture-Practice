import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = sc.nextInt();
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		ArrayList<Character> lst = new ArrayList<>();
		while(n!=0){
			int rem = n % num;
			char ch = str.charAt(rem);
			lst.add(ch);
			n = n/num;
		}
		for(int i=lst.size()-1;i>=0;i--){
		    System.out.print(lst.get(i));
		}
	}
}
