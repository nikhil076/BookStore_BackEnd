package com.javainuse.springbootsecurity.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

	private int price;
	private int quantity;
	private String address;
	private int userId;
	private int bookId;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate orderDate;
	private boolean cancel;
}
