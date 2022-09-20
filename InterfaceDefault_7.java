interface MyInterface {
    public void square(int a);

    default void show() {
        System.out.println("Default Method Executed");
    }
}

public class InterfaceDefault_7 implements MyInterface {
    public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String args[]) {
        InterfaceDefault_7 obj = new InterfaceDefault_7();
        obj.square(4);
        obj.show(); // default method executes
    }
}
