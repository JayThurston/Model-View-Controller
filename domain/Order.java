package domain;

public class Order {

int quantity;

public Order(){
	
}
public Order(int quantity) {
		super();
		this.quantity = quantity;
	}



public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
