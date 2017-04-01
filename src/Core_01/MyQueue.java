package Core_01;

import java.util.*;

/**
 * Created by Taras on 01.04.2017.
 */
public class MyQueue extends AbstractQueue<Person> {

    private List<Person> persons;

    public MyQueue(int capacity) {
        this.persons = new ArrayList<>(capacity);
    }

    @Override
    public Iterator<Person> iterator() {
        return persons.iterator();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean offer(Person person) {
        persons.add(person);
        return true;
    }

    @Override
    public Person poll() {
        persons.remove(0);
        return null;
    }

    @Override
    public Person peek() {
        return null;
    }

    public Person removeLast(){
        persons.remove(Main.capacity - 1);
        return null;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
