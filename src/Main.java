import javax.swing.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        System.out.println();
        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        System.out.println(set1);

        System.out.println(symmetricDifference(set, set1));

    }
    public static Set<Integer> symmetricDifference (Set<Integer> set, Set<Integer> set1){
        Set<Integer> integers = new HashSet<>();
        Set<Integer> remove = new HashSet<>();
        for (Integer integer : set) {
            for (Integer integer1 : set1) {
                if (Objects.equals(integer, integer1)){
                    remove.add(integer);
                }
            }
        }
        integers.addAll(set);
        integers.addAll(set1);
        integers.removeAll(remove);
        return integers;
    }
}