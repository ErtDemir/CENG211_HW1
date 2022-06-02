package ChainStore;

public class Transaction {
	private double PurchasePrice;
	private double SalePrice;
	private double NumberOfSales;
	
	public Transaction(double PurchasePrice, double SalePrice, double NumberOfSales) {
		this.PurchasePrice = PurchasePrice;
		this.SalePrice = SalePrice;
		this.NumberOfSales = NumberOfSales;
	}

	public double getPurchasePrice() {
		return PurchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		PurchasePrice = purchasePrice;
	}

	public double getSalePrice() {
		return SalePrice;
	}

	public void setSalePrice(double salePrice) {
		SalePrice = salePrice;
	}

	public double getNumberOfSales() {
		return NumberOfSales;
	}

	public void setNumberOfSales(double numberOfSales) {
		NumberOfSales = numberOfSales;
	}

}
