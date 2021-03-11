import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    // properties
    private String pname;
    private int qty;
    private double price;
    private double totalPrice;

    // constructor
    Product(String pname, int qty, double price, double totalPrice) {
        this.pname = pname;
        this.qty = qty;
        this.price = price;
        this.totalPrice = totalPrice;
    }
    // getter methods
    public String getPname() {
        return pname;
    }
    public int getQty() {
        return qty;
    }
    public double getPrice() {
        return price;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    // displayFormat
    public static void displayFormat() {
        System.out.print(
                "\nName      Quantity    Price   Total Price\n");
    }
    // display
    public void display() {
        System.out.format("%-9s %8d %10.2f %10.2f\n",
                pname, qty, price, totalPrice);
    }
}
public class BillingSystem{
    public static void main(String[] args) {
        // variables
        String productName = null;
        int quantity = 0;
        double overAllPrice = 0.0;
        // create Scanner class object
        Scanner scan = new Scanner(System.in);
        List<Product> product = new ArrayList<Product>();
        System.out.println("Jeans\tRs.880");
        System.out.println("Top \tRs.440");
        System.out.println("Dress\tRs.550");
        System.out.println("Shoes\tRs.300");
        System.out.println("Jacket\tRs.890");
        // read input values
        System.out.println("Enter product details,");
        System.out.print("Name: ");
        productName = scan.nextLine();
        System.out.print("Quantity: ");
        quantity = scan.nextInt();
        overAllPrice=calculate(productName,quantity);
        // overall price
        System.out.println("\nOverall Price = Total Price + 9% GST = " + overAllPrice);
        // display all product with its properties
        Product.displayFormat();
        for (Product p : product) {
            p.display();
        }
    }
  public static double calculate(String productName, int quantity) {
      double price = 0.0;
      double totalPrice = 0.0;
      double totalPrice1 = 0.0;
      double totalPrice2 = 0.0;
      double totalPrice3 = 0.0;
      double totalPrice4 = 0.0;
      double totalPrice5 = 0.0;
      double GSTAmount = 0.0;
      double overAllPrice = 0.0;
      List<Product> product = new ArrayList<Product>();
      Scanner scan = new Scanner(System.in);
          switch (productName) {
              case "jeans":
                  price = 880.0;
                  totalPrice1 = (880.0 * quantity);
                  totalPrice += totalPrice1;
                  // create Product class object and add it to the list
                  product.add(new Product(productName, quantity, price, totalPrice1));
                  break;

              case "top":
                  price = 440.0;
                  totalPrice2 = (440.0 * quantity);
                  totalPrice += totalPrice2;
                  // create Product class object and add it to the list
                  product.add(new Product(productName, quantity, price, totalPrice2));
                  break;

              case "dress":
                  price = 550.0;
                  totalPrice3 = (550.0 * quantity);
                  totalPrice += totalPrice3;
                  // create Product class object and add it to the list
                  product.add(new Product(productName, quantity, price, totalPrice3));
                  break;

              case "shoes":
                  price = 300.0;
                  totalPrice4 = (300.0 * quantity);
                  totalPrice += totalPrice4;
                  // create Product class object and add it to the list
                  product.add(new Product(productName, quantity, price, totalPrice4));
                  break;

              case "jacket":
                  price = 890.0;
                  totalPrice5 = (890.0 * quantity);
                  totalPrice += totalPrice5;
                  // create Product class object and add it to the list
                  product.add(new Product(productName, quantity, price, totalPrice5));
                  break;
              default:
                  System.out.println("no match");
                  break;
          }
      // calculate total price for that product
      // add 9% GST

      GSTAmount = (totalPrice*9)/100;
      // calculate overall price
      overAllPrice += totalPrice+GSTAmount;
      // close Scanner
      scan.close();
      return  overAllPrice;
    }
}
