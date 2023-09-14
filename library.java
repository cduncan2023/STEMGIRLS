// Import necessary libraries
import java.util.Scanner;

// Create a BookRecommendation class
public class BookRecommendation {
   
   // Define main method
   public static void main(String[] args) {
       
      // Welcome Message
      System.out.println("Welcome to the Book Recommendation Site! Please answer the following questions to find your perfect book.");
       
      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);
       
      // Ask user if they prefer non-fiction or fiction books
      System.out.print("Do you prefer non-fiction or fiction books? ");
      String genre = input.nextLine();
       
      // Ask user about their preferred reading format
      System.out.print("Do you prefer hard copy or electronic copy? ");
      String format = input.nextLine();
    
      // Ask user about the average length of their preferred book
      System.out.print("What is your preferred book length? (in pages) ");
      int length = input.nextInt();
    
      // Call a function to recommend books based on user preferences
      recommendBooks(genre, format, length);
      
      // Close the Scanner object
      input.close();
   }
   
   // Define a function to recommend books based on user preferences
   public static void recommendBooks(String genre, String format, int length) {
       
      // Perform operations based on the user preference
      // Output recommendations based on operations performed
      System.out.println("Based on your preferences, the following books are recommended:");
      if (genre.equalsIgnoreCase("non-fiction")) {
          System.out.println("- 'Thinking, Fast and Slow' by Daniel Kahneman");
          System.out.println("- 'Outliers' by Malcolm Gladwell");
      } else if (genre.equalsIgnoreCase("fiction")) {
          System.out.println("- 'The Great Gatsby' by F. Scott Fitzgerald");
          System.out.println("- 'To Kill a Mockingbird' by Harper Lee");
      }
       
      if (format.equalsIgnoreCase("hard copy")) {
          System.out.println("- Hard copy books are available at your nearest bookstore.");
      } else if (format.equalsIgnoreCase("electronic copy")) {
          System.out.println("- Electronic copies are available on Amazon, and other online bookstores.");
      }
       
       if (length < 200) {
          System.out.println("- Short reads like 'Animal Farm' by George Orwell are available.");
       } else if (length > 300) {
          System.out.println("- Long reads like 'War and Peace' by Leo Tolstoy are available.");
       } else {
          System.out.println("- Average length books like 'To Kill a Mockingbird' by Harper Lee are available.");
       }
   }
} 
