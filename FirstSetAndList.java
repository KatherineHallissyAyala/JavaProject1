import java.util.TreeSet;
//import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

class FirstSetAndList {
    public static void main(){
        Set<Integer> scores = new TreeSet<>();
        scores.add(22);
        scores.add(11);
        scores.add(35);

        System.out.println(scores);

        ArrayList<Integer> shoeSizes = new ArrayList<Integer>();
        shoeSizes.add(10);
        shoeSizes.add(9);
        shoeSizes.add(12);
        shoeSizes.add(7);
        shoeSizes.get(0);
        shoeSizes.set(1, 5);
        shoeSizes.subList(1, 3);

        System.out.println(shoeSizes);
        System.out.println(shoeSizes.subList(1, 3));

    }
    
}
