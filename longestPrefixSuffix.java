package prePlacementCheckList;

import java.util.Scanner;

public class longestPrefixSuffix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(lps(str));
		
	}
    static int lps(String s) {
        int a[]=new int[s.length()];
        int i=1;
        int j=0;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                a[i]=j+1;
                j++;
                i++;
            }
            else {
                if(j==0){
                    i++;
                }
                else{
                    j=a[j-1];
                }
            }
        }
        int max=a[i-1];
        return max;
    }
}
