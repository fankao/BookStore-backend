package com.bookstore.repositories;

import com.bookstore.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface AuthorRepository extends JpaRepository<Author,String> {

}
