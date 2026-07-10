package com.raghavender.collections;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks(){
        List<Book> books = new ArrayList<Book>();
        books.add(new Book(1,"Java complete reference vol1",300));
        books.add(new Book(2,"Spring",200));
        books.add(new Book(3,"Hibernate",250));
        books.add(new Book(4,"A webservices",350));

        return books;
    }

}
