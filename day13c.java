import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res = (num1 * num2) % 12;
		if(res ==0){
			System.out.println(res+12);
		}
		else{
			System.out.println(res);
		}
	}
}
