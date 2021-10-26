import java.util.ArrayList;

public class you3 {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("parv");
        list.add("manu");
        list.add("masai");
        list.add("Delhi");
        list.add("rajasthan");
        list.add(3,"MASAI");

        for (int i=0;i<list.size();i++){
                System.out.println(list.get(i));

        }

    }
}
