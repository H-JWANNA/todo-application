package com.codestates.todoapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

	@GetMapping
	public String helloWorld() {
		return "Todo Application by H-JWANNA";
	}
}
