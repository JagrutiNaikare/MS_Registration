package com.example.demo.registration;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class APIResponse {

	private String message;
	private HttpStatus status;

}
