package com.bookstore.entities;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "authors")
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(generator = "authorId_generator")
    @GenericGenerator(name = "authorId_generator", strategy = "com.bookstore.utils.IdGenerator")
    @Column(name = "author_id", nullable = false, unique = true, updatable = false)
    private String authorId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "story")
    private String story;

}
