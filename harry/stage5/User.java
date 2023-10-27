public class User {

    private static User user;
    private String name;
    private int age;
    private String address;

    private User() {
    }

    private User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static User getInstance(String name, int age, String address) {
        user = new User(name, age, address);
        user.display();
        return user;
    }

    private void display() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("address : " + address);
    }

}
