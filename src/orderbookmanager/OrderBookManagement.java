/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderbookmanager;

// Java Program to Illustrate StudentRecordManagement Class


// Importing required classes
import java.util.LinkedList;
import java.util.Scanner;

// Class
public class OrderBookManagement {

	// Creating an empty LinkedList
	LinkedList<OrderBook> list;

	// Default Constructor
	public OrderBookManagement()
	{
		list = new LinkedList<>();
	}

	// Method 1
	// Adding Record
	// @param record
	public void add(OrderBook orderbook)
	{

		// Checking if a record already exists or not,
		// if not add it to Record list, Otherwise
		// error display message
		if (!find(orderbook.getIdNumber())) {
			list.add(orderbook);
		}
		else {

			// Print statement
			System.out.println(
				"Record already exists in the Record list");
		}
	}

	// Method 2
	// Searching Record
	// @param idNumber
	// @return
	public boolean find(int idNumber)
	{

		// Iterating record list
		// using for each loop
		for (OrderBook l : list) {

			// Checking record by id Number
			if (l.getIdNumber() == idNumber) {

				System.out.println(l);
				return true;
			}
		}
		return false;
	}

	// Method 3
	// Delete Record
	// @param recIdNumber
	public void delete(int recIdNumber)
	{
		OrderBook orderBookDel = null;

		// Iterating record list
		for (OrderBook ll : list) {

			// Finding record to be deleted by id Number
			if (ll.getIdNumber() == recIdNumber) {
				orderBookDel = ll;
			}
		}

		// If recordDel is null, then show error message,
		// otherwise remove the record from Record list
		if (orderBookDel == null) {

			// Displaying no record found
			System.out.println("Invalid record Id");
		}
		else {

			list.remove(orderBookDel);

			// Display message for successful deletion of
			// record
			System.out.println(
				"Successfully removed record from the list");
		}
	}

	// Method 4
	// Finding Record
	// @param idNumber
	// @return
	public OrderBook findRecord(int idNumber)
	{

		// Iterate Record list
		// using for each loop
		for (OrderBook l : list) {

			// Checking record by id Number.
			if (l.getIdNumber() == idNumber) {
				return l;
			}
		}

		return null;
	}

	// Method 5
	// Update Record
	// @param id
	// @param input
	public void update(int id, Scanner input)
	{

		if (find(id)) {
			OrderBook rec = findRecord(id);

			// Display message only
			System.out.print(
				"What is the new Book id Number ? ");
			int idNumber = input.nextInt();
                        
                        // Display message only
			System.out.print(
				"What is the new Book you're adding? ");
			String name = input.nextLine();


			// Display message only
			System.out.print(
				"What is the price ");
			int price = input.nextInt();
			input.nextLine();
                        
                        System.out.print(
				"What is the quantity ");
			int quantity = input.nextInt();
			input.nextLine();

			
			rec.setIdNumber(idNumber);
			rec.setName(name);
			rec.setPrice(price);
                        rec.setQuantity(quantity);
			System.out.println(
				"Record Updated Successfully");
		}
		else {

			// Print statement
			System.out.println(
				"Record Not Found in the Book list");
		}
	}

	// Display Records
	public void display()
	{

		// If record list is empty then
		// print the message below
		if (list.isEmpty()) {

			// Print statement
			System.out.println("The list has no records\n");
		}
		// Iterating Record list
		// using for each loop
		for (OrderBook orderBook : list) {

			// Printing the list
			System.out.println(orderBook.toString());
		}
	}
}
