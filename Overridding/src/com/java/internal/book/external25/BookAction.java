package com.java.internal.book.external25;

import com.java.internal.book.internal25.Book;
import com.java.internal.book.internal25.Novel;

public class BookAction {

    public void executeAction(Book book) {
        if (book != null) {
            book.Read();
            if (book instanceof Novel) {
                Novel novel = (Novel) book;
                novel.Genre();
            } else {
                System.err.println("This is not a Novel");
            }
        } else {
            System.err.println("Book is null");
        }
    }
}
