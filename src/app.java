import java.util.*;

public class app {

    public static void main(String[] args) {

        Collection coll = new Collection();

        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<String> list4 = new LinkedList<>();
        List<String> list5 = new LinkedList<>();
        List<String> list6 = new LinkedList<>();

        Collections.addAll(list1, 1, 2, 3, 4);
        Collections.addAll(list2, 6, 2, 3, 0);
        Collections.addAll(list3, 60, 2, 13, 10, 64, 12, 8, 6, 25, 31, 68, 10, 14);
        Collections.addAll(list4, "Ivan", "Maria", "John", "Amalia");
        Collections.addAll(list5, "aa", "bb", "cc", "dd");
        Collections.addAll(list6, "bb", "cc", "dd", "aa");

        coll.addAllTest(0, list1);
        coll.addAllTest(0, list2);
        coll.addAllTest(0, list3);
        coll.addAllTest(0, list4);
        coll.addAllTest(0, list5);
        coll.addAllTest(0, list6);

        coll.mySuperPrinter(coll.compareLists(list1, list2));
        coll.mySuperPrinter(coll.checkListsCircle(list5, list6));
        coll.mySuperPrinter(coll.checkNames(list4));
        coll.mySuperPrinter(coll.reverceNum(list1));
        coll.mySuperPrinter(coll.addUpLists(list1, list2));
        coll.mySuperPrinter(coll.notBiggerThanNum(14, list3));
    }

}
