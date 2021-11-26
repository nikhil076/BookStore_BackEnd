package com.javainuse.springbootsecurity.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order")
public class DAOOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int price;
	private int quantity;
	private String address;
	private int userId;
	private int bookId;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate orderDate;
	private boolean cancel;
}
