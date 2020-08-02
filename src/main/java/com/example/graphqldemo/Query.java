package com.example.graphqldemo;

import graphql.kickstart.tools.GraphQLQueryResolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
class Query implements GraphQLQueryResolver {

  Book getBook(Long id) {
    Book book = new Book(id);
    book.setName("new Book " + id);
    book.setPageCount(new Random().nextInt(1000));
    return book;
  }

  List<Book> getBooks() {
    List<Book> books = new ArrayList<>();
    books.add(this.getBook(1L));
    books.add(this.getBook(2L));
    books.add(this.getBook(3L));
    return books;
  }

}