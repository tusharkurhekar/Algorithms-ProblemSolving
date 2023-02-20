package Challenge14;

public class BestTimetoBuyandSellStock121 {

	public int BestTimetoBuyandSellStock121(int[] prices) {
        
        int profit = 0;
        int amountBrought = Integer.MAX_VALUE;
        for(int i=0; i<prices.length;i++){         
            if(amountBrought > prices[i]){
                amountBrought = prices[i];
            }else if(profit < (prices[i]-amountBrought)){
                profit = prices[i]-amountBrought;
            }
        }
        return profit;
	}

}
