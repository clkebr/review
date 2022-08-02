import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {

        // create arrayList
        List<Students> list = new ArrayList<>();
        list.add(new Students(1,"Ozzy"));
        list.add(new Students(2,"Fatih"));
        list.add(new Students(3,"Jamal"));
        list.add(new Students(4,"Ebru"));

        System.out.println(list);

        //Iteration on ArrayList
        for (int i = 0;i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //iterator
        ListIterator<Students> iter = list.listIterator();
        while (iter.hasNext()) System.out.println(iter.next());

        //backwards
        while (iter.hasPrevious()) System.out.println(iter.previous());

        //for each
        for (Students students : list) {
            System.out.println(students);
        }

        //lambda
        list.forEach(System.out::println); //list.forEach(students -> System.out.println(students));
        System.out.println(".............................");

        //sorting
        Collections.sort(list,new sortByIdDesc());
        System.out.println(list);

        Collections.sort(list,new sortByNameDesc());
        System.out.println(list);


    }
    static class sortByIdDesc implements Comparator<Students>{

        @Override
        public int compare(Students o1, Students o2) {
            return o1.id-o2.id;
        }


    }
    static class sortByNameDesc implements Comparator<Students>{

        @Override
        public int compare(Students o1, Students o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
