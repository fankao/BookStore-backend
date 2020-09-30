package com.bookstore.entities;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "publishers")
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {
    @Id
    @GeneratedValue(generator = "pubId_generator")
    @GenericGenerator(name = "pubId_generator", strategy = "com.bookstore.utils.IdGenerator")
    @Column(name = "pub_id", nullable = false, unique = true, updatable = false)
    private String pubId;

    @Column(name = "pub_name")
    private String pubName;
}
