import java.util.Map;
import java.util.HashMap;

class FirstMaps {
    public static void main(){
        Map counts = new HashMap();
        //classes.put("Kinnen", 102);

        //System.out.println(classes.get("Kinnen"));

        String name = "mississippi";

        for(char x:name.toCharArray()){
            if (counts.containsKey(x)){
                int old = (int)counts.get(x);
                counts.put(x, old+1);
            }
            else {
                counts.put(x,1);
            }
        }
        System.out.println(counts);
    }
    
    
}
