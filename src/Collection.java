import java.util.*;

public class Collection {

    public List<String> compareLists(List<Integer> l1, List<Integer> l2) {
        List<String> l3 = new LinkedList<>();
        for (int i = 0; i < l1.size(); i++)
            if (l1.get(i) == l2.get(i)) {
                l3.add("Yes");
            } else l3.add("No");
        return l3;
    }

    public List<String> checkNames(List<String> listNames) {
        for (int i = 0; i < listNames.size(); i++) {
            if (listNames.get(i).length() == 4) {
                listNames.remove(listNames.get(i));
            }
        }
        return listNames;
    }

    public boolean checkListsCircle(List<String> l1, List<String> l2) {

        for (int i = 0; i < l1.size(); i++) {
            Collections.rotate(l1, 1);
            if (l2.equals(l1)) return true;
        }
        return false;
    }

    public List<Integer> reverceNum(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }

    public List<Integer> notMoreThanNum(int num, List<Integer> list) {
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer s = itr.next();
            if (s.compareTo(num) > 0) itr.remove();
        }
        return list;
    }

}

