public class FirstForLoop {
    public static void main(String[] args) {
        int[] ages = {2, 5, 8, 13, 26, 44, 99};

        for (int i=0; i<ages.length; i++){
            if (ages[i] > 18){
                System.out.println("can vote at index" + i);
            }
        }

        int count=0;
        for (int element:ages){
            System.out.println(count + " " + element);
            count++;
            if (element > 40){
                break;
            }
        }

        String[] names = new String[5];
    }
}
