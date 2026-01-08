package Stream_pra;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintAlternatesInArray {

	public static void main(String[] args) {
		int[] arr= {12,23,45,67};
		int s=0;
		int ls=arr.length-1;
		//int swap;
		while(s<ls) {
//			swap=arr[s];           
//			arr[s]=arr[ls];         ////resversing with third variable
//			arr[ls]=swap;
			arr[s]=arr[s]+arr[ls];    		
			arr[ls]=arr[s]-arr[ls];
			arr[s]=arr[s]-arr[ls];   ///reversing without third variable
			s++;
			ls--;
			
		}
		System.out.println(Arrays.toString(arr));
		PrintAlternatesInArray p=new PrintAlternatesInArray();
		p.getAlternates(arr);
	}
	public void getAlternates(int arr[]) {
        // Code Here
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
            System.out.println(arr[i]);
    }
		
	}
	

}
