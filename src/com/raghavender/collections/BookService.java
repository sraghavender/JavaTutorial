package com.raghavender.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
    public List<Book> getBookSort() {

        List<Book> Books = new BookDao().getBooks();
        Collections.sort(Books, new MyComparator());
        return Books;
    }


    public static void main(String[] args) {
        System.out.println(new BookService().getBookSort());

    }
}
    class MyComparator implements Comparator<Book>{

        @Override
        public int compare(Book o1, Book o2) {
            return o1.getName().compareTo(o2.getName()) ;
        }
    }


