package com.bookstore.entities;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "book_categories")
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookCategory {
	@Id
	@GeneratedValue(generator = "bookCategoryId_generator")
	@GenericGenerator(name = "bookCategoryId_generator", strategy = "com.bookstore.utils.IdGenerator")
	@Column(name = "category_id", updatable = false, unique = true)
	private String id;

	@Column(name = "category_name")
	private String categoryName;

	@Column(name = "note")
	private String note;

	@OneToMany(mappedBy = "category",fetch = FetchType.LAZY)
	private List<Book> books;

}
