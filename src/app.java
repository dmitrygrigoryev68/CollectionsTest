import java.util.*;

public class app {

    public static void main(String[] args) {

        List<Integer> listInt1 = new ArrayList<>();
        List<Integer> listInt2 = new ArrayList<>();
        List<Integer> listInt3 = new ArrayList<>();
        List<String> listNames = new LinkedList<>();
        List<String> listChar1 = new LinkedList<>();
        List<String> listChar2 = new LinkedList<>();

        Collections.addAll(listInt1, 1, 2, 3, 4);
        Collections.addAll(listInt2, 6, 2, 3, 0);
        Collections.addAll(listInt3, 60, 2, 13, 10, 64, 12, 8, 6, 25, 31, 68, 10, 14);
        Collections.addAll(listNames, "Ivan", "Maria", "John", "Amalia");
        Collections.addAll(listChar1, "aa", "bb", "cc", "dd");
        Collections.addAll(listChar2, "bb", "cc", "dd", "aa");


        Collection c = new Collection();

        c.myPrinterString(c.compareLists(listInt1, listInt2));
        c.myPrinterString(c.checkNames(listNames));
        c.myPrinterBool(c.checkListsCircle(listChar1, listChar2));
        c.myPrinterInt(c.reverceNum(listInt1));
        c.myPrinterInt(c.addUpLists(listInt1, listInt2));
        c.myPrinterInt(c.notBiggerThanNum(14, listInt3));
    }

}
