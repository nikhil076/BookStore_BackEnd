package com.javainuse.springbootsecurity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

	private String name;
	private String author;
	private int price;
	private int quantity;
	private String logo;
	private String description;
}
