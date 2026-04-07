import java.util.ArrayList;

class Cart {
    ArrayList<Product> items;

    Cart() {
        items = new ArrayList<>();
    }

    void addToCart(Product p) {
        items.add(p);
        System.out.println(p.name + " added to cart");
    }

    void showCart() {
        double total = 0;
        if(items.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }

        for(Product p : items) {
            p.displayProduct();
            total += p.price;
        }
        System.out.println("Total: ₹" + total);
    }
    void removeFromCart(int pid) {
    for(Product p : items) {
        if(p.pid == pid) {
            items.remove(p);
            System.out.println("Removed from cart");
            return;
        }
    }
}
}
