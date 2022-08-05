import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        Set<Students> studentsSet = new HashSet<>();

        studentsSet.add(new Students(1,"Thomas"));
        studentsSet.add(new Students(2,"Alex"));
        studentsSet.add(new Students(3,"Chris"));
        studentsSet.add(new Students(4,"Zeta"));

        //after implement equals & hashcode method together, it will return false
        // new keyword creates an obj with different address
        System.out.println(studentsSet.add(new Students(4, "Zeta")));

        System.out.println(studentsSet);
        Character myChar = returnFirstRepeatingChar("Java Developer");
        System.out.println("myChar = " + myChar);


    }
    // find the first repeating char in a string
    public static Character returnFirstRepeatingChar(String str){
        Set<Character> mySet = new HashSet<>();
        for (Character c : str.toCharArray()) {
            if(!mySet.add(c)){ return c;
            }
        }
        return null;

    }


}
