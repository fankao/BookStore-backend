package com.bookstore.repositories;

import com.bookstore.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface PublisherRepository extends JpaRepository<Publisher,String> {
}
