import java.util.ArrayList;

class Database {
    ArrayList<Product> products;

    Database() {
        products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 50000));
        products.add(new Product(2, "Phone", 20000));
        products.add(new Product(3, "Headphones", 2000));
    }

    void showProducts() {
        for(Product p : products) {
            p.displayProduct();
        }
    }

    Product getProduct(int pid) {
        for(Product p : products) {
            if(p.pid == pid) {
                return p;
            }
        }
        return null;
    }
}