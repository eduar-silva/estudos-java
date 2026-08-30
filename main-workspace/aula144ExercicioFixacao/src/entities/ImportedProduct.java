package entities;

public final class ImportedProduct extends Product{
	private Double customFee;
	
	public ImportedProduct() {
	}
	
	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public Double totalPrice() {
		return price + customFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.priceTag());
		sb.append(" (Custom fee: $ " + String.format("%.2f", totalPrice()) + ")");
		return sb.toString();
	}
}
