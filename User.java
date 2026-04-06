class User {
    int userId;
    String name;

    User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    void displayUser() {
        System.out.println("User ID: " + userId + ", Name: " + name);
    }
}