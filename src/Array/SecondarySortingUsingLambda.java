package Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by deepaksharma on 1/4/18.
 */
public class SecondarySortingUsingLambda {

    public static void testChainedSorting() {
        // Create the collection of people:
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Dan", 4));
        people.add(new Person("Andi", 2));
        people.add(new Person("Bob", 42));
        people.add(new Person("Debby", 3));
        people.add(new Person("Bob", 72));
        people.add(new Person("Barry", 20));
        people.add(new Person("Cathy", 40));
        people.add(new Person("Bob", 40));
        people.add(new Person("Barry", 50));

        // Define chained comparators:
        // Great article explaining this and how to make it even neater:
        // http://blog.jooq.org/2014/01/31/java-8-friday-goodies-lambdas-and-sorting/
        Comparator<Person> comparator = Comparator.comparing(person -> person.name);
        comparator = comparator.thenComparing(Comparator.comparing(person -> -person.age));

        for(Person p : people){
            System.out.println(p.name + " "+ p.age);
        }

        System.out.println("----After-------");
        // Sort the stream:
        Stream<Person> personStream = people.stream().sorted(comparator);

        personStream.forEach(person -> System.out.println(person.name + " "+ person.age));
    }

    public static class Person{
        public String name;
        public int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
