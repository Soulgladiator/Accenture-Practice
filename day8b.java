import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner old=new Scanner(System.in);
        String s=old.nextLine();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                while(Character.isDigit(s.charAt(i))){
                    System.out.print(s.charAt(i));
                    i++;
                    if(i==s.length()-1){
                      System.out.print(s.charAt(i));
                      break;
                    }
                }
                System.out.println();
            }
        }
    }
}
