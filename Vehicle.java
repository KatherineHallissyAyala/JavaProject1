public interface Vehicle {

    final int gears = 5;
    
    void speedUp(int a);
    void slowDown(int a);
    void changeGears(int a);

    default void out(){
        System.out.println("Default method");
    }

    static int math(int b){
        return b + 9;
    }
}
