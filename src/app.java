import java.util.*;

public class app {

    public static void main(String[] args) {
        List<Integer> listInt1 = new ArrayList<>();
        List<Integer> listInt2 = new ArrayList<>();
        List<Integer> listInt3 = new ArrayList<>();
        List<String> listNames = new LinkedList<>();
        List<String> listChar1 = new ArrayList<>();
        List<String> listChar2 = new ArrayList<>();

        Collections.addAll(listInt1, 1, 2, 3, 4);
        Collections.addAll(listInt2, 6, 2, 3, 0);
        Collections.addAll(listInt3, 60, 2, 13, 10, 64, 12, 8, 6, 25, 31, 68, 10, 14);
        Collections.addAll(listNames, "Ivan", "Maria", "John", "Amalia");
        Collections.addAll(listChar1, "aa", "bb", "cc", "dd");
        Collections.addAll(listChar2, "cc", "dd", "aa", "bb");


        Collection c = new Collection();


        Iterator<String> myPrinter = c.compareLists(listInt1, listInt2).iterator();
        while (myPrinter.hasNext()) {
            System.out.println(myPrinter.next());
        }
        System.out.println("\n");
        Iterator<String> myPrinter1 = c.checkNames(listNames).iterator();
        while (myPrinter1.hasNext()) {
            System.out.println(myPrinter1.next());
        }

        System.out.println("\n");
        System.out.println(c.checkListsCircle(listChar1, listChar2));


        System.out.println("\n");
        Iterator<Integer> myPrinter3 = c.reverceNum(listInt1).iterator();
        while (myPrinter3.hasNext()) {
            System.out.println(myPrinter3.next());
        }

        System.out.println("\n");
        Iterator<Integer> myPrinter4 = c.notMoreThanNum(14, listInt3).iterator();
        while (myPrinter4.hasNext()) {
            System.out.println(myPrinter4.next());
        }
    }

}
