package Core_01;

import java.util.Comparator;

/**
 * Created by Taras on 01.04.2017.
 */
public class SortByAge implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o2.getAge() - o1.getAge();
    }
}
