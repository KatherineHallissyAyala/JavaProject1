import java.util.Scanner;

public class FirstWhileLoop {
    public static void main(String[] args){

        Cat fluffy = new Cat("Fluffy");
        Cat snowball = new Cat("Snowball", 3, 40);

        System.out.println("Get ready to guess some numbers!");
        numberGuesses();

    }
    public static void numberGuesses(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number: ");
        int x = sc.nextInt();

        while (x != 10){
            System.out.println("program will stop after a 10.  Please enter a number.");
            x = sc.nextInt();
        }

        do {
            System.out.print("Type a number.  Will break if a number is over 20.");
            x = sc.nextInt();
        } while (x <= 20);

    }
}
