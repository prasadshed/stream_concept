package Stream_pra;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,9,7};
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int res=LinearSearch.returnIndex(a, target);
		System.out.println(res);
		
	}
	public static int returnIndex(int[] x,int t) {
		int s=0;
		int l=x.length-1;
		while(s<l) {
			if(x[s]==t) {
				return s;
			}
			s++;
		}
		return -1;
		
		
	}
}
