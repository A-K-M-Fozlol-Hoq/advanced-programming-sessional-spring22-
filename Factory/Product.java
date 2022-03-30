package Factory;

public class Product {
	private int productId;
	private double productWeight;
	
	Product(){
		productId=0;
		productWeight = 0.0f;
	}
	
	Product(int productId, double productWeight){
		this.productId = productId;
		this.productWeight = productWeight;
	}
	
	public int getProductId() {
		return this.productId;
	}
	
	public double getProductWeight() {
		return this.productWeight;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public void setProductWeight(double productWeight) {
		this.productWeight = productWeight;
	}
	
	public Product checkAndgenerat(int newProductId, double newProductWeight) {
		Product obj = new Product(newProductId, newProductWeight);
		return obj;
	}
	
	public Product checkAndgenerat(int newProductId) {
		Product p = new Product();
		if(newProductId % 2 == 0){
			p.productId = newProductId;
			p.productWeight = this.productWeight;
		}
		return p;
	}
	
	public Product checkAndgenerat(double newProductWeight) {
		Product p = new Product();
		if(newProductWeight >50){
			p.productId = this.productId;
			p.productWeight = newProductWeight;
		}
		return p;
	}
	
	public Product checkAndgenerat(Product p1) {
		Product p = new Product();
		p.productId = this.productId + p1.productId;
		p.productWeight = this.productWeight + p1.productWeight;
		return p;
	}
	
	public Product checkAndgenerat(int prodcutId1, int productId2) {
		Product p = new Product();
		if(prodcutId1 > productId2) {
			p.productId = this.productId + prodcutId1;
			p.productWeight = this.productWeight;
		}else {
			p.productId = this.productId + productId2;
			p.productWeight = this.productWeight;
		}
		return p;
	}
	
	public Product checkAndgenerat(double productWeight1, double productWeight2) {
		Product p = new Product();
		if(productWeight1 > 50) {
			p.productId = this.productId ;
			p.productWeight = this.productWeight + productWeight1;
		}
		else if(productWeight2>50) {
			p.productId = this.productId ;
			p.productWeight = this.productWeight + productWeight2;
		}
		else if(productWeight1>50 && productWeight2>50) {
			p.productId = this.productId ;
			p.productWeight = this.productWeight + productWeight1 + productWeight2;
		}
		return p;
	}
}
