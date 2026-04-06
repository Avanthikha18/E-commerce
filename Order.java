class Order {
    User user;
    Cart cart;

    Order(User user, Cart cart) {
        this.user = user;
        this.cart = cart;
    }

    void placeOrder() {
        System.out.println("\nOrder placed successfully!");
        cart.showCart();
    }
}