import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int a = 1;
        while(a<=input){
            a = a*2;
        }
        a = a/2;
        int result = ((input-a)*2)+1;
        System.out.println(result);
    }
}
