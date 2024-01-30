public class Main {
    public static void main(String[] args){

        Level lvl = Level.LOW;

        Level[] levelArray = Level.values(); //create array of Level values

        for (Level e : levelArray){ //loop through array of Level values and print each one
            System.out.println(e);
        }

        if (lvl == Level.LOW) {
            System.out.println(lvl);
        } else if (lvl == Level.MEDIUM) {
            System.out.println(lvl);
        }
        else {
            System.out.println(lvl);
        }

        /* 
        Car ford = new Car();
        ford.speedUp(10);
        ford.changeGears(2);
        ford.display();

        int x = Vehicle.math(10);
        System.out.println(x);

        */

        //OuterClass out = new OuterClass();
        //OuterClass.InnerClass in = out.new InnerClass();
        //in.display();

        //Student galinda = new Student("Eliza");
        //Student elphaba = new Student("Elphaba");
        //Student nessa = new Student("Nessa");
        //Student angelica = new Student("Angelica");
        //Student eliza = new Student("Eliza");
        //Student peggy = new Student("Peggy");

        //    System.out.println(galinda.equals(eliza));
        //    System.out.println(peggy.compareTo(eliza)); 
        //    System.out.println(elphaba);

    }

}
