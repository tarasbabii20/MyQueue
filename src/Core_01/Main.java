package Core_01;


import java.util.*;

/**
 * Created by Taras on 01.04.2017.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static {
        System.out.println("Введіть розмір черги");
    }
    static int capacity = scanner.nextInt();

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue(capacity);
        int count = 0;
        String name;
        int age;

        while (true) {
            System.out.println("Введіть '1', щоб добавити людину");
            System.out.println("Введіть '2', щоб добавити людину по віку");
            System.out.println("Введіть '3', щоб вивести чергу");
            System.out.println("Введіть '4', щоб вийти");
            int menuNumber = scanner.nextInt();
            switch (menuNumber) {
                case 1:
                    System.out.println("Введіть ім'я");
                    name = Main.scanner.next();
                    System.out.println("Введіть вік");
                    age = Main.scanner.nextInt();
                    if(count < capacity) {
                        myQueue.offer(new Person(name, age));
                        count++;
                    }
                    else {
                        myQueue.poll();
                        myQueue.offer(new Person(name, age));
                    }
                    break;
                case 2:
                    System.out.println("Введіть ім'я");
                    name = Main.scanner.next();
                    System.out.println("Введіть вік");
                    age = Main.scanner.nextInt();
                    if(count < capacity) {
                        myQueue.offer(new Person(name, age));
                        count++;
                    }
                    else {
                        if(myQueue.getPersons().get(0).getAge() < age){
                            myQueue.removeLast();
                            myQueue.offer(new Person(name, age));
                        }
                        else{
                            myQueue.poll();
                            myQueue.offer(new Person(name, age));
                        }
                    }
                    Collections.sort(myQueue.getPersons() ,new SortByAge());
                    break;
                case 3:
                    Iterator<Person> iter = myQueue.iterator();
                    while(iter.hasNext()){
                        System.out.println(iter.next());
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
