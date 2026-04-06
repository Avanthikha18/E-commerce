class Product {
    int pid;
    String name;
    double price;

    Product(int pid, String name, double price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println(pid + " - " + name + " - ₹" + price);
    }
}