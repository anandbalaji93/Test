public class Child {
    {
        System.out.println("C");
    }

    static {
        System.out.println("D");
    }

    public static void main(String[] args) {
        Child child = new Child();
    }
}
