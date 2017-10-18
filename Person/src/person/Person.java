/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author makis
 */
@interface ClassPreamble {

    String author();

    String date();

    int currentRevision() default 1;

    String lastModified() default "N/A";

    String lastModifiedBy() default "N/A";
    // Note use of array

    String[] reviewers();
}

@ClassPreamble(
        author = "John Doe",
        date = "3/17/2002",
        currentRevision = 6,
        lastModified = "4/12/2004",
        lastModifiedBy = "Jane Doe",
        // Note array notation
        reviewers = {"Alice", "Bob", "Cindy"}
)

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    protected Sex getGender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getAge() {
        return 0;
        // ...
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void printPerson() {
        // ...
    }

    //functional interface (only one method)
    interface CheckPerson<T> {

        boolean test(T t);
    }

    class CheckPersonEligibleForSelectiveService implements CheckPerson<Person> {

        @Override
        public boolean test(Person p) {
            return p.gender == Person.Sex.MALE
                    && p.getAge() >= 18
                    && p.getAge() <= 25;
        }

    }

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    public static void printPersons(List<Person> roster, CheckPerson<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    //implementation with local class inside method printPersons
    public static void printPersons(List<Person> roster) {

        class CheckPersonEligibleForSelectiveService implements CheckPerson<Person> {

            public boolean test(Person p) {
                return p.gender == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25;
            }
        }

        for (Person p : roster) {
            CheckPersonEligibleForSelectiveService check = new CheckPersonEligibleForSelectiveService();
            if (check.test(p)) {
                p.printPerson();
            }
        }

    }

    //implementation with local class inside class Person
    public static void printPersons(List<Person> roster, CheckPersonEligibleForSelectiveService ch) {

        for (Person p : roster) {
            if (ch.test(p)) {
                p.printPerson();
            }
        }

    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

}
