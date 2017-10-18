/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.*;

/**
 *
 * @author makis
 */
public class DataStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frmt = "%-40s%b%n";
        String format = "%-40s%-50s%-20d%n";
        
        //Creating Books  
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b11 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);

//        Hashtable<String, Integer> scor = new Hashtable<String, Integer>();
//
//        scor.put("KING", 100);
//        scor.put("CLARK", 90);
//        scor.put("FORD", 110);
//
//        for (Map.Entry m : scor.entrySet()) {
//
//            String format = "%-40s%-50s%-20d%n";
//            System.out.printf(format, "Hashtable Key: " + m.getKey(), "Value:" + m.getValue(), m.hashCode());
//        }
//
//        //System.out.println("\nHashMap: Value with key=\"CLARK\" is:  " + scores.get("CLARK"));
//        //System.out.println("\nHashMap: scores size is:  " + scores.size());
//        System.out.println();
        HashMap<Book, Integer> scores = new HashMap<Book, Integer>();

        scores.put(b1, 100);
        scores.put(b2, 90);
        scores.put(b3, 110);
        //scores.put(b11, 110);
        System.out.println("\n" + scores);

        
        for (Map.Entry m : scores.entrySet()) {

            System.out.printf(format, "HashMap Key: " + m.getKey().hashCode(), "Value:" + m.getValue(), m.hashCode());
        }

        //System.out.println(scores.entrySet());
        
        System.out.printf(frmt,"b1 == b11 : ", (b1 == b11));        

        System.out.printf(frmt,"b1.equals(b11) : ",b1.equals(b11));

        if (scores.containsKey(new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8))) {
            System.out.println("Yes!");
        } else {
            System.out.println("No");
        }

        if (b1.equals(new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8))) {
            System.out.println("Yes!");
        } else {
            System.out.println("No");
        }
        //System.out.println("\nHashMap: Value with key=\"CLARK\" is:  " + scores.get("CLARK"));
        //System.out.println("\nHashMap: scores size is:  " + scores.size());
//        System.out.println();
//
//        TreeMap<String, String> hm = new TreeMap<String, String>();
//        hm.put("Greece", "Athens");
//        hm.put("Spain", "Madrid");
//        hm.put("Italy", "Rome");
//        hm.put("America", "Washington");
//
//        for (Map.Entry m : hm.entrySet()) {
//
//            String format = "%-40s%-50s%-20d%n";
//            System.out.printf(format, "TreeMap Key: " + m.getKey(), "Value:" + m.getValue(), m.hashCode());
//        }
//
//        System.out.println("\nentrySet(): " + hm.entrySet());
//        System.out.println("keySet(): " + hm.keySet());
//        System.out.println("values(): " + hm.values());
//
//        System.out.println("tailMap(): " + hm.tailMap("Italy"));
//        System.out.println();
//
//        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
//
//        linkedHashMap.put("Makis", "Neo Iraklio");
//        linkedHashMap.put("Stella", "Exarchia");
//        linkedHashMap.put("Frank", "Thessaloniki");
//
//        Set entrySet = linkedHashMap.entrySet();
//        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
//
//        while (iterator.hasNext()) {
//
//            //casting the next element in entrySet of linkedHashMap into Map.Entry object
//            Map.Entry entry = (Map.Entry) iterator.next();
//
//            String format = "%-40s%-50s%-20d%n";
//            System.out.printf(format, "LinkedHashMap Key: " + entry.getKey(), "Value:" + entry.getValue(), entry.hashCode());
//        }
//
//        LinkedList<String> al = new LinkedList<String>();
//        al.add("Ravi");
//        al.add("Vijay");
//        al.add("Ravi");
//        al.add("Ajay");
//
//        System.out.println("\nLinkedList: ");
//
//        Iterator<String> itr = al.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//        System.out.println("Last:" + al.getLast() + "\n");
//
//        //TreeSet
//        TreeSet<Book> set = new TreeSet<Book>();
//
//        //Adding Books to TreeSet  
//        set.add(b1);
//        set.add(b2);
//        set.add(b3);
//
//        System.out.println("first(): " + set.first().id);
//        System.out.println("last(): " + set.last().id);
//
//        Iterator it = set.iterator();
//
//        //Traversing TreeSet 
//        while (it.hasNext()) {
//
//            Book next = (Book) it.next();
//            System.out.println(next.id + " " + next.name + " " + next.author + " " + next.publisher + " " + next.quantity);
//        }
//
////        for (Book b : set) {
////            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
////        }
        HashSet<Book> sortedSet = new HashSet<Book>();

        
        sortedSet.add(b1);
        sortedSet.add(b2);
        sortedSet.add(b3);
        

        System.out.println("\n" + sortedSet);
        System.out.printf(frmt,"b1 == b11 : ", (b1 == b11));

        
        System.out.printf(frmt,"b1.equals(b11) : ", b1.equals(b11));

        if (sortedSet.contains(new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8))) {
            System.out.println("Yes!");
        } else {
            System.out.println("No");
        }

        if (b1.equals(new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8))) {
            System.out.println("Yes!");
        } else {
            System.out.println("No");
        }

//        System.out.println(sortedSet.subSet("Ajay", "Vijay"));
//        System.out.println(sortedSet.headSet("Ravi"));
//        System.out.println(sortedSet.tailSet("Ravi"));
    }

}
