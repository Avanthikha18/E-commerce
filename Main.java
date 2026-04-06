import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Database db = new Database();
        Cart cart = new Cart();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        User user = new User(1, name);

        while(true) {
            System.out.println("\n1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Place Order");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    db.showProducts();
                    break;

                case 2:
                    System.out.print("Enter product id: ");
                    int pid = sc.nextInt();
                    Product p = db.getProduct(pid);

                    if(p != null) {
                        cart.addToCart(p);
                    } else {
                        System.out.println("Product not found");
                    }
                    break;

                case 3:
                    cart.showCart();
                    break;

                case 4:
                    Order order = new Order(user, cart);
                    order.placeOrder();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}