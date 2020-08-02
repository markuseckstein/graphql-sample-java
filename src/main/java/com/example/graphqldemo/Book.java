package com.example.graphqldemo;

public class Book {
  private Long id;
  private String name;
  private int pageCount;
  private Author author;

  Book(Long id) {
    this.id = id;
  }

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPageCount() {
    return pageCount;
  }

  public void setPageCount(int pageCount) {
    this.pageCount = pageCount;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

}