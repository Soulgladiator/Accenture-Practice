import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int divisor = sc.nextInt();
		int quotient = sc.nextInt();
		int remainder = sc.nextInt();
		int result = (divisor * quotient)+remainder;
		System.out.println(result);
	}
}
