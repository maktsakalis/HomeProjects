/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author makis
 */
class Book implements Comparable<Book> {

    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    
    

    @Override
    public int hashCode() {
        //return super.hashCode();
        return this.id%20;
    }

  
    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        if(this == obj || (this.name == ((Book)obj).name)){
            return true;
        }
        if( obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        return false;
    }

    public int compareTo(Book b) {
        if (id > b.id) {
            return 1;
        } else if (id < b.id) {
            return -1;
        } else {
            return 0;
        }
    }
}
