import java.util.*;
class Gcd{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n =sc.nextInt(); int n1=sc.nextInt();
if(n>n1){
n=n%n1;
System.out.print(n);
}
else{
n1=n1%n;
System.out.print(n1);
}
}
}


