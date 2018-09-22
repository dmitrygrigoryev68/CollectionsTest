import java.util.*;

public class Collection<T> {


    List<T> elementsArr = new ArrayList<>();
    T yes = (T) "yes";
    T no = (T) "No";

    public boolean addAllTest(int index, List<T> arrToAdd) {
        elementsArr.addAll(index, arrToAdd);
        return true;
    }

    public List<T> compareLists(List<T> list1, List<T> list2) {
        List<T> resList = new LinkedList<>();
        for (int i = 0; i < list1.size(); i++)
            if (list1.get(i).equals(list2.get(i))) {
                resList.add(yes);
            } else resList.add(no);
        return resList;
    }

    public List<String> checkNames(List<String> listNames) {
        listNames.removeIf(s -> s.length() == 4);
        return listNames;
    }

    public boolean checkListsCircle(List<String> list1, List<String> list2) {
        for (String l : list1) {
            Collections.rotate(list1, 1);
            if (list2.equals(list1)) return true;
        }
        return false;
    }

    public List<T> reverceNum(List<T> list) {
        Collections.reverse(list);
        return list;
    }

    public List<T> addUpLists(List<T> list1, List<T> list2) {
        List<T> resList = new ArrayList<>();
        resList.addAll(list1);
        resList.addAll(list2);
        return resList;
    }

    public List<Integer> notBiggerThanNum(int num, List<Integer> list) {
        list.removeIf(s -> s.compareTo(num) > 0);
        return list;
    }

    public void mySuperPrinter(T arg) {
        System.out.println(arg);
        System.out.println("\n");
    }
}