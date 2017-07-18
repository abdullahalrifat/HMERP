package com.abdullah.Report.SalesReport;

/**
 * Created by abdullah on 7/17/17.
 */
public class Book
{

        private String title;
        private String author;
        private String isbn;
        private String publishedDate;
        private float price;

        public Book(String title, String author, String isbn, String publishedDate,
                    float price) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.publishedDate = publishedDate;
            this.price = price;
        }

        // getters and setters

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

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getPublishedDate() {
            return publishedDate;
        }

        public void setPublishedDate(String publishedDate) {
            this.publishedDate = publishedDate;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

}
