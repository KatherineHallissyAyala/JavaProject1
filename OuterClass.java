public class OuterClass {
    public class InnerClass {
        public static void display(){
            System.out.println("This is the inner class.");
        }
    }

    public void inner(){
        InnerClass in = new InnerClass();
        in.display();
    }
}
