package Stream_pra;

import java.util.Arrays;

public class DistinctEle {

	public static void main(String[] args) {
		int[] s=new int[8];
		s[0]=78;
		s[1]=82;
		s[2]=72;
		s[3]=88;
		s[4]=82;
		s[5]=78;
		s[6]=88;
		s[7]=58;
		
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		int cnt=0;
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]==s[j]) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);    ////o(n*n)
		
		
		
		
	}

}
