/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderbookmanager;

/**
 *
 * @author meist
 */
// Java Program to Illustrate Record Class


// Class
public class OrderBook {

	// Instance variables
	private String name;
	private int idNumber;
	private double price;
        private int quantity;
        private boolean side;

    public OrderBook(String name, int idNumber, double price, int quantity, boolean side) {
        this.name = name;
        this.idNumber = idNumber;
        this.price = price;
        this.quantity = quantity;
        this.side = side;
    }

    public boolean isSide() {
        return side;
    }

    public void setSide(boolean side) {
        this.side = side;
    }
            

	// Default Constructor
	public OrderBook() {}

	// toString() Method
	// @return
	@Override public String toString()
	{

		// Returning the record
		return "OrderBooks{"
			+ "name=" + name + ", idNumber=" + idNumber
			+ ", price=" + price + '}';
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
