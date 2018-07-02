package pl.vxm.netino.books.mod;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long idb;

 private String title;
 private String author;
 private String type;
 private String publisher;
 private int year;

 public Book() {
 }

 public Book(String title, String author, String type, String publisher, int year) {
  this.title = title;
  this.author = author;
  this.type = type;
  this.publisher = publisher;
  this.year = year;
 }

 public Long getId() {
  return idb;
 }


 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 public String getAuthor() {
  return author;
 }

 public void setAuthor(String author) {
  this.author = author;
 }

 public String getType() {
  return type;
 }

 public void setType(String type) {
  this.type = type;
 }

 public int getYear() {
  return year;
 }

 public void setYear(int year) {
  this.year = year;
 }

 @Override
 public String toString() {
  return "Book{" +
          "idb=" + idb +
          ", title='" + title + '\'' +
          ", author='" + author + '\'' +
          ", type='" + type + '\'' +
          ", year=" + year +
          '}';
 }

}
