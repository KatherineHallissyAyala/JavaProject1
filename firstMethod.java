public class firstMethod {
    public static void main(){
        greeting();
        multipleGreetings("Bienvenidos", 4);
        System.out.println(addTwo(99));
    }
    public static void greeting(){
        System.out.println("Oh what a beautiful morning!");
    }

    public static void multipleGreetings(String greet, int times){
        for (int i = 0; i < times; i++){
            System.out.println(greet);
        }
    }

    public static int addTwo(int value){
        return value + 2;
    }
}
