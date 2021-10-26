import java.util.HashMap;
import java.util.Map;

public class You1 {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Praveen",26);
        map.put("roy",20);
        map.put("sachin",25);
        map.put("Raj",2);
        map.put("rajveer",3);
        map.put("ghamsyam",9);

        for (Map.Entry<String,Integer> ap:map.entrySet()){
           if (ap.getKey().length()>6){
               map.remove(ap.getKey());
           }else {
               System.out.println(ap.getKey()+" - "+ap.getValue());
           }
        }
    }
}
