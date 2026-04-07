class Payment {

    void processPayment(double amount) {
        System.out.println("Select Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. Cash on Delivery");

        int choice = 1; // you can later use Scanner

        switch(choice) {
            case 1:
                System.out.println("Processing UPI payment...");
                break;
            case 2:
                System.out.println("Processing Card payment...");
                break;
            case 3:
                System.out.println("Cash on Delivery selected");
                break;
            default:
                System.out.println("Invalid option");
                return;
        }

        System.out.println("Payment Successful!");
    }
}