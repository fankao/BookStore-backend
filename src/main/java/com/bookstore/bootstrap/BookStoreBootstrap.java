package com.bookstore.bootstrap;
/*

import com.bookstore.entities.Author;
import com.bookstore.entities.Book;
import com.bookstore.entities.BookCategory;
import com.bookstore.entities.Publisher;
import com.bookstore.services.IAuthorService;
import com.bookstore.services.IBookCategoryService;
import com.bookstore.services.IBookService;
import com.bookstore.services.IPublisherService;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;
import java.util.UUID;
//@Configuration
public class BookStoreBootstrap implements CommandLineRunner {
    private IBookCategoryService categoryService;
    private IBookService bookService;
    private IAuthorService authorService;
    private IPublisherService publisherService;

    public BookStoreBootstrap(IBookCategoryService categoryService,
                              IBookService bookService,
                              IAuthorService authorService,
                              IPublisherService publisherService) {
        this.categoryService = categoryService;
        this.bookService = bookService;
        this.authorService = authorService;
        this.publisherService = publisherService;
    }

    @Override
    public void run(String... args) throws Exception {
        BookCategory category1 = categoryService.save(BookCategory.builder().categoryName("Chính trị").build());
        BookCategory category2 = categoryService.save(BookCategory.builder().categoryName("Nghệ thuật").build());
        BookCategory category3 = categoryService.save(BookCategory.builder().categoryName("Văn học").build());

        Author author1 = authorService.save(Author.builder().firstName("Nguyễn Khoa").lastName("Điềm").build());
        Author author2 = authorService.save(Author.builder().firstName("Trần Minh").lastName("Anh").build());
        Author author3 = authorService.save(Author.builder().firstName("Lê Chí").lastName("Thành").build());

        Publisher publisher1 = publisherService.save(Publisher.builder().pubName("Nhà xuất văn học").build());
        Publisher publisher2 = publisherService.save(Publisher.builder().pubName("Nhà xuất bản Nghệ thuật").build());
        Publisher publisher3 = publisherService.save(Publisher.builder().pubName("Nhà xuất bản Sự thật").build());


        for (int i = 0; i < 60; i++) {
            addBook(category1, author1, publisher1, i);
            if (i > 20 && i <= 40) {
                addBook(category2, author2, publisher2, i);
            } else {
                addBook(category3, author3, publisher3, i);
            }
        }
    }

    private void addBook(BookCategory category, Author author, Publisher publisher, int id) {
        bookService.save(Book.builder()
                .bookName(category.getCategoryName() + " " + (id + 1))
                .ISBN(UUID.randomUUID().toString())
                .unitPrice(BigDecimal.valueOf(generateUnitPrice(20000)))
                .category(BookCategory.builder().id(category.getId()).build())
                .author(Author.builder().authorId(author.getAuthorId()).build())
                .publisher(Publisher.builder().pubId(publisher.getPubId()).build())
                .build());

    }

    private double generateUnitPrice(int min) {
        double randomValue = min + Math.random() * (200000.0 - min);
        double tempRes = Math.floor(randomValue * 10);
        double finalRes = tempRes / 10;
        return finalRes;
    }
}
*/
