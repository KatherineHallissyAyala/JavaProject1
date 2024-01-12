import java.util.Scanner;

class ControlStructures {
    public static void main(String[] args) {
        System.out.println("Hi, I'm Dr. Listener, your AI psychologist.");
        System.out.println("How are you feeling today?");

        Scanner userResponse = new Scanner(System.in);
        String input = userResponse.next();

        if (input.equals("anxious")){
            System.out.println("What is making you anxious?");
        }
        else if (input.equals("scared")){
            System.out.println("Why are you frightened?");
        }
        else if (input.equals("alone")){
            System.out.println("People feel lonely sometimes.  Who would you like to spend time with?");
            String reply = userResponse.next();
            if (reply.equals("friends")){
                System.out.println("Give your friends a call.");
            }
            else{
                System.out.println("The first step might be the hardest, and then it will get easier to connect.");
            }
        }
        else {
            System.out.println("Tell me more.");
        }
    }
}
