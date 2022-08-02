import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Sergio");
        map.put(2,"Thomas");
        map.put(3,"Vonya");
        System.out.println(returnNonRepeating("Java Developer"));
        System.out.println(map.get(2));

    }
    public static Character returnNonRepeating(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int count;
        for (Character c : str.toCharArray()) {
            if (map.containsKey(c)) {
                count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Character c : str.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}
