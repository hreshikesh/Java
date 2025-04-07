package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Book;
import com.xworkz.isarelation.Internal.Novel;

import javax.naming.Name;

public class Reading {
    public void hobbie(Book book){
        book.read();
        book.bookmark();
        book.close();
        book.lend();
        book.store();
        if(book instanceof Novel){
            System.out.println("In Novel");
            Novel novel=(Novel) book;
            novel.author();
        }
    }
}
