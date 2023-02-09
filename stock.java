package StockAccountManagement;

public class stock {
	
	//instance variables
		private String stockNames;
		private Double numOfShare;
		private Double sharePrice;
		
		public void Stock() {
			
		}


		//Parameterized constructor
		public void Stock(String stockNames, Double numOfShare, Double sharePrice) {
			
			this.stockNames = stockNames;
			this.numOfShare = numOfShare;
			this.sharePrice = sharePrice;
		}
		
	//getters and setters
		public String getStockNames() {
			return stockNames;
		}

		public void setStockNames(String stockNames) {
			this.stockNames = stockNames;
		}

		public Double getNumOfShare() {
			return numOfShare;
		}

		public void setNumOfShare(Double numOfShare) {
			this.numOfShare = numOfShare;
		}

		public Double getSharePrice() {
			return sharePrice;
		}

		public void setSharePrice(Double sharePrice) {
			this.sharePrice = sharePrice;
		}

}
