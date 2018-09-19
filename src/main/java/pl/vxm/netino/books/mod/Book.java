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
 private String category;
 private String publisher;
 private int publicationYear;

 public Book() {
 }

 public Book(String title, String author, String category, String publisher, int publicationYear) {
  this.title = title;
  this.author = author;
  this.category = category;
  this.publisher = publisher;
  this.publicationYear = publicationYear;
 }

 public Long getIdb() {
  return idb;
 }

 public void setIdb(Long idb) {
  this.idb = idb;
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

 public String getCategory() {
  return category;
 }

 public void setCategory(String category) {
  this.category = category;
 }

 public String getPublisher() {
  return publisher;
 }

 public void setPublisher(String publisher) {
  this.publisher = publisher;
 }

 public int getPublicationYear() {
  return publicationYear;
 }

 public void setPublicationYear(int publicationYear) {
  this.publicationYear = publicationYear;
 }

 @Override
 public String toString() {
  return "Book{" +
          "idb=" + idb +
          ", title='" + title + '\'' +
          ", author='" + author + '\'' +
          ", category='" + category + '\'' +
          ", publisher='" + publisher + '\'' +
          ", publicationYear=" + publicationYear +
          '}';
 }
}
