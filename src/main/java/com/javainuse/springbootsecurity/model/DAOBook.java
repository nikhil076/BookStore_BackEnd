package com.javainuse.springbootsecurity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book")
public class DAOBook {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@Column
	private String author;
	@Column
	private int price;
	@Column
	private int quantity;
	@Column
	private String logo;
	@Column
	private String description;
	
	public DAOBook(BookDTO bookDTO) {
		super();
		this.id=id;
		this.name=bookDTO.getName();
		this.author=bookDTO.getAuthor();
		this.price=bookDTO.getPrice();
		this.quantity=bookDTO.getQuantity();
		this.logo=bookDTO.getLogo();
		this.description=bookDTO.getDescription();
	}
}
