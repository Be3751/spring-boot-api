package com.example.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.api.model.Task;

@RestController
public class WebApiController {
    @GetMapping("/piyo")
	public String piyo() {
		return "Hello Piyo!";
	}

	@GetMapping("/hoge")
	public String hoge() {
		return "Hello Hoge!";
	}

	@GetMapping("/task")
	public Task task() {
		Task task = new Task("10", "piyo", "piyo is smart.");
		return task;
	}
}