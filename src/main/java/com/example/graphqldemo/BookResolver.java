package com.example.graphqldemo;

import java.util.Random;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class BookResolver implements GraphQLResolver<Book> {
  public Author getAuthor(Book book) {
    Author auth = new Author(new Random().nextLong());
    auth.setFirstName("karl");
    // auth.setLastName("lastName");
    return auth;
  }
}
