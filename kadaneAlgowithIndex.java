package prePlacementCheckList;

import java.util.Scanner;

public class kadaneAlgowithIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Kadane(arr,n);
	}
	
	static void Kadane(int arr[],int n) {
		int max_ending=0;
		int max_so_far=Integer.MIN_VALUE;
		int start=0;
		int end=0;
		int s=0;
		for(int i=0;i<n;i++) {
			max_ending+=arr[i];
			if(max_so_far<max_ending) {
				max_so_far=max_ending;
				start=s;
				end=i;
			}
			if(max_ending<0) {
				max_ending=0;
				s=i+1;
			}
		}
		System.out.println("Maximum contiguous sum is "+ max_so_far); 
		System.out.println("Starting index " + start); 
		System.out.println("Ending index " + end); 
	}

}
