import java.util.*;
class solution{
	public  static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[2][3];
		boolean flag = false;
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		for(int i=0;i<2;i++){
		  for(int j=0;j<3;j++){
		    if(arr[i][j]==x){
		      flag=true;
		      break;
		    }
		  }
		}
		if(flag==false){System.out.println("ELEMENT NOT FOUND");}
		else{System.out.println("ELEMENT FOUND");}
	}
}
