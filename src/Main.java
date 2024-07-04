import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Main {


    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(-49, -2, -3, 44, -5, -6, -7, -8, 9, -10));
        search(collection);
    }
    public static void search(Collection<Integer> collection){
        Integer min = null;
        Integer max = null;
        for (Integer integer : collection) {

            if (max == null){
                max = integer;
            }else {
                if (integer > max) {
                    max = integer;
                }
            }
            if (min == null) {
                min = integer;
            }else {
                if (integer < min) {
                    min = integer;
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }


}