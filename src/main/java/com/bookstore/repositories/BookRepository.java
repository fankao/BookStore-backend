package com.bookstore.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bookstore.entities.Book;
@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book,String> {
	Page<Book> findByCategoryId(String id, Pageable pageable);

	Page<Book>findByBookNameContaining(String keyword, Pageable pageable);
}
