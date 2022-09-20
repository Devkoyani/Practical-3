class A3_Prac4 {
    public void method() {
        System.out.println("method in parent is called");
    }
}
class Child extends A3_Prac4 {
    @Override
    public void method() {
        super.method();
        System.out.println("method from child is called");
    }
}

public class MethodOverriding_4 {
    public static void main(String[] args) {
        Child cobj = new Child();
        cobj.method();
    }
}
