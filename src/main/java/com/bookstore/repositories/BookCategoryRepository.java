package com.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bookstore.entities.BookCategory;
@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "bookCategories", path = "bookCategories")
public interface BookCategoryRepository extends JpaRepository<BookCategory, String> {

}
