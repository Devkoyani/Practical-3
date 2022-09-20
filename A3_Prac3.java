public class A3_Prac3 {
    interface P
    {
        final int p=65;
        void displayP();
    }
    interface P1 extends P
    {
        final int p1=10;
        void displayP1();
    }
    interface P2 extends P
    {
        final int p2=20;
        void displayP2();
    }
    interface P12 extends P1,P2 {
        final int p12=12;
        void displayP12(); }
    class Q implements P12 {
        public void displayP()
        {
            System.out.println("display : "+p1);
        }
        public void displayP1()
        {
            System.out.println("display1 : "+p2);
        }
        public void displayP2()
        {
            System.out.println("display2 : "+p12);
        }
        public void displayP12()
        {
            System.out.println("display3 : "+p);
        }
    }
    public class Interface {
        public static void main(String arg[]) {
            Q q = new Q();
            q.displayP();
            q.displayP1();
            q.displayP2();
            q.displayP12();
        }
    }
}
