import java.util.*;
class solution{
private static int replace_num(int num){
      int res = 0;
      while(num!=0){
			int rem = num%10;
			if(rem==0){
				res = res*10 + 5;
			}
			else{
			  res = res*10 + rem;
			}
			num = num/10;
		}
		return res;
}

private static int reverse(int res){
    int result=0;
    while(res!=0){
	   int rem = res%10;
	   result = result*10+rem;
	   res = res/10;
	}
	return result;
}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = replace_num(num);
		int result = reverse(res);
	  System.out.println(result);
	}
}
