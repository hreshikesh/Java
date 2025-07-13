package com.xworkz.collection.List.CollectionIterator.Runner;

import com.xworkz.collection.List.CollectionIterator.dto.BookDto;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class BookRunner {
    public static void main(String[] args) {
        Collection<BookDto> bookCollection = new LinkedList<BookDto>();

        bookCollection.add(new BookDto("The King","Vaibhav","Rishi","Fiction","Charly","English","Goa",500,"4.5","1st Edition"));
        bookCollection.add(new BookDto("The Queen","Ravi","Kumar","Fantasy","Thalapathy","Telugu","Tamilnaadu",300,"4.0","2nd Edition"));
        bookCollection.add(new BookDto("The Prince","Arjun","Sharma","Adventure","RajKumar","Kannada","Bengaluru",700,"4.8","3rd Edition"));
        bookCollection.add(new BookDto("The Princess","Varsha","Arushi","Romance","Dilwale","Hindi","Delhi",400,"4.2","4th Edition"));
        bookCollection.add(new BookDto("The Warrior","Karthik","Sohan","Action","Veeram","Kannada","Davangere",600,"4.6","5th Edition"));
        bookCollection.add(new BookDto("The Hero","Ananya","Preetham","Drama","Katera","English","England",550,"4.3","6th Edition"));
        bookCollection.add(new BookDto("The Villain","Suresh","Gopi","Psyco","Kiccha","Kannada","Mumbai",800,"4.9","7th Edition"));
        bookCollection.add(new BookDto("The Detective","Nisha","Rani","Mystery","Sherlock","English","London",650,"4.7","8th Edition"));
        bookCollection.add(new BookDto("The Scientist","Rohan","Sharma","Science","Einstein","Hindi","Delhi",900,"4.1","9th Edition"));
        bookCollection.add(new BookDto("The Comedy","Priya","Kumari","Comedy","Mr Bean","Telugu","Hyderabad",750,"4.4","10th Edition"));


       Iterator<BookDto> bookIterator= bookCollection.iterator();
       while (bookIterator.hasNext()){
           System.out.println(bookIterator.next());
           System.out.println("--------------------------------------------------");
       }
    }
}
