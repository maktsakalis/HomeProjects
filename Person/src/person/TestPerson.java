/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static person.Person.printPersons;

/**
 *
 * @author makis
 */
public class TestPerson {

    public static void main(String[] args) {

        List<Person> roster = new ArrayList<Person>();

        //implementation with anonymous class
        printPersons(
                roster,
                new Person.CheckPerson<Person>() {
            public boolean test(Person p) {
                return p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25;
            }
        }
        );

        //implementation with lambda expression
        printPersons(
                roster,
                (Person p) -> p.getGender() == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25
        );

        //implementation with local class in method
        printPersons(roster);

        Person outerClass = new Person();
        Person.CheckPersonEligibleForSelectiveService fl = outerClass.new CheckPersonEligibleForSelectiveService();

        //implementation with local class in method
        printPersons(roster, fl);

        Person[] rosterAsArray = roster.toArray(new Person[roster.size()]);

        class PersonAgeComparator implements Comparator<Person> {

            public int compare(Person a, Person b) {
                return a.getBirthday().compareTo(b.getBirthday());
            }
        }

        //implementation with local class
        Arrays.sort(rosterAsArray, new PersonAgeComparator());

        //implementation withlambda expression
        Arrays.sort(rosterAsArray,
                (Person a, Person b) -> {
                    return a.getBirthday().compareTo(b.getBirthday());
                }
        );

        //implementation with method refererence
        Arrays.sort(rosterAsArray, Person::compareByAge);

    }
}
