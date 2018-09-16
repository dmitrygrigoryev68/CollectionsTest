import java.util.*;

public class Collection {

    public List<String> compareLists(List<Integer> list1, List<Integer> list2) {
        List<String> resList = new LinkedList<>();
            for (int i = 0; i < list1.size(); i++)
                if (list1.get(i).equals(list2.get(i))) {
                    resList.add("Yes");
                } else resList.add("No");
        return resList ;
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

    public List<Integer> reverceNum(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }

    public List<Integer> notBiggerThanNum(int num, List<Integer> list) {
        list.removeIf(s -> s.compareTo(num) > 0);
        return list;
    }

    public void myPrinterInt(List<Integer> list) {
        for (Integer l : list) {
            System.out.println(l);
        }
        System.out.println("\n");
    }

    public void myPrinterString(List<String> list) {
        for (String l : list) {
            System.out.println(l);
        }
        System.out.println("\n");
    }

    public void myPrinterBool(boolean bool) {
        System.out.println(bool);
        System.out.println("\n");
    }
}

