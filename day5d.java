import java.util.*;
class solution{
	private static int second_largest(ArrayList<Integer> lst){
		int max = -1;
		int secondmax = -2;
		for(int i=0;i<lst.size();i++){
			if(lst.get(i)>max){
				secondmax = max;
				max = lst.get(i);
			}
		}
		return secondmax;
	}
	private static boolean is_unique(int arr[]){
	    int max = -1;
	    int has[] = new int[500];
	    boolean flag = true;
	    for(int i=0;i<arr.length;i++){
	      has[arr[i]]+=1;
	    }
	    for(int i=0;i<has.length;i++){
	        if(has[i]>1){flag=false;break;}
	    }
	    return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,5};
		if(arr.length<=3){System.out.println("SIZE PATHALA ODRA ANGUTTU");}
		if(is_unique(arr)){
		    System.out.println("UNIQUE THAAN PRACHANA ILLA");
		}
		else{
		    System.out.println("UNIQUE LAAM ILLA");
		}
		ArrayList<Integer> evenlst = new ArrayList<>();
		ArrayList<Integer> oddlst = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			if(i%2==0){oddlst.add(arr[i]);}
			else{evenlst.add(arr[i]);}
		}
		int res1 = second_largest(evenlst);
		int res2 = second_largest(oddlst);
		System.out.println(res1+res2);
	}
}
