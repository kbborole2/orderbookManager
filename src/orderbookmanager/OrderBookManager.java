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
// Java Program to Illustrate StudentRecordLinkedList Class
// Importing required classes
import java.util.Scanner;

// Class
public class OrderBookManager {

    // Main driver method
    public static void main(String[] args) {

        // Creating HumanResourceOffice Object.
        OrderBookManagement bookManagement
                = new OrderBookManagement();

        OrderBook orderBook = new OrderBook();

        // Initial Employee record
        // Using mutators to had code the data
        orderBook.setIdNumber(6862);
        orderBook.setName("Ankit");
        orderBook.setPrice(90);
        orderBook.setQuantity(30);

        // Calling add() record method to
        // add static data/(Hard CodedData) to linked List
        bookManagement.add(orderBook);

        // Creating Scanner Object to read input
        Scanner input = new Scanner(System.in);

        // Creating option integer variable
        int option = 0;

        // Do - While loop
        do {
            menu();
            option = input.nextInt();

            // Switch case
            switch (option) {

                // Case 1
                case 1:

                    // Display message
                    System.out.print(
                            "What is the book id Number ? ");

                    int idNumber = input.nextInt();

                    // Display message
                    System.out.print(
                            "What is the price ? ");

                    int price = input.nextInt();
                    input.nextLine();

                    // Display message
                    System.out.print(
                            "What is the Book Name ? ");

                    String name = input.nextLine();
                    
                       System.out.print(
                            "What is the quantity ? ");

                    int quantity = input.nextInt();
                    
                    System.out.print(
                            "is it on sale ? ");

                    boolean side = input.nextBoolean();

                    // Create record object and pass constructor
                    // parameters.
                    orderBook = new OrderBook(name, idNumber, price, quantity,side );
                    // Call add() record
                    bookManagement.add(orderBook);
                    System.out.println(orderBook.toString());

                    // Break statement used to terminate program
                    // from here only once it entered this case
                    break;

                // Case 2
                case 2:

                    // Display message
                    System.out.print(
                            "What is the Book id number ? ");
                    int rId = input.nextInt();

                    // Invoke remove/delete record
                    bookManagement.delete(rId);

                    break;

                // Case 3
                case 3:

                    // Display message
                    System.out.print(
                            "What is the Book id number? ");

                    int rIdNo = input.nextInt();
                    bookManagement.update(rIdNo, input);

                    break;

                // Case 4
                case 4:

                    // Display message
                    System.out.print(
                            "What is the Student id ? ");
                    int bookId = input.nextInt();

                    if (!bookManagement.find(bookId)) {
                        System.out.println(
                                "Student id does not exist\n");
                    }

                    break;

                // Case 5
                case 5:
                    bookManagement.display();
                    break;

                // Case 6
                case 9:

                    // Display message
                    System.out.println(
                            "\nThank you for using the program. Goodbye!\n");
                    System.exit(0);

                    break;

                // Case 7: Default case
                // If none above case executes
                default:

                    // Print statement
                    System.out.println("\nInvalid input\n");
                    break;
            }
        } // Checking condition
        while (option != 9);
    }

    // Method 2
    // Menu - Static menu for displaying options
    public static void menu() {

        // Printing statements displaying menu on console
        System.out.println("MENU");
        System.out.println("1: Add Book");
        System.out.println("2: Delete Book");
        System.out.println("3: Update Book");
        System.out.println("4: Search Book");
        System.out.println("5: Display Books");
        System.out.println("9: Exit program");
        System.out.print("Enter your selection : ");
    }
}
