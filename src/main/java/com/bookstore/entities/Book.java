package com.bookstore.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "books")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Book {
	@Id
	@GeneratedValue(generator = "bookId_generator")
	@GenericGenerator(name = "bookId_generator", strategy = "com.bookstore.utils.IdGenerator")
	@Column(name = "book_id", nullable = false, unique = true)
	private String bookId;

	@Column(name = "isbn", unique = true, updatable = false)
	private String ISBN;

	@Column(name = "book_name")
	private String bookName;

	@Column(name = "number_of_page")
	private int numberOfPages;

	@Column(name = "unit_price")
	private BigDecimal unitPrice;

	@Column(name = "unit_in_stock")
	private int unitInStock;

	@Column(name = "description")
	private String description;

	@Column(name = "size")
	@Builder.Default
	private double[] size = new double[2];

	@Column(name = "image_url")
	private String imageUrl;

	@Column(name = "release_at")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate releaseAt;

	@Column(name = "created_at", insertable = true, updatable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	@UpdateTimestamp
	private LocalDateTime updatedAt;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryId")
	private BookCategory category;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id")
	@JsonIgnore
	private Author author;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pub_id")
	@JsonIgnore
	private Publisher publisher;

}
