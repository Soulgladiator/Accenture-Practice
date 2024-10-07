import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner old=new Scanner(System.in);
        String s=old.nextLine();
        int count=0;
        boolean b=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(0)==' '){
                i++;
            }
            if(Character.isAlphabetic(s.charAt(i))){
                while(Character.isAlphabetic(s.charAt(i))){
                    i++;
                    if(i==s.length()-1){
                        break;
                    }
                }
                count++;
            }
            if(b){
                if(s.charAt(i)==' '){
                    count++;
                    b=!b;
                }
            }
        }
        System.out.print(count);
    }
}
