package prePlacementCheckList;

import java.util.ArrayList;

class Interval{
	int buy,sell;
}

public class buyandSellStocks2 {

	static void stock(int price[],int n) {
		if(n==1)
			return;
		int count=0;
		ArrayList<Interval> sol=new ArrayList<Interval>();
		int i=0;
		while(i<n-1) {
			while((i<n-1) && (price[i+1] <=price[i])) 
				i++;
			
				if(i==n-1)
					break;
				
				Interval e=new Interval();
				e.buy=i=i+1;
				
				while()
			
		}
	}
	public static void main(String[] args) {

	}

}
