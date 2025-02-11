package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class SbaCOntroller {
	private static final String template = "Hello, %s!";
//	AtomicLong is a datatype that will handle huge data
	private final AtomicLong atomicLong = new AtomicLong();

	@GetMapping("/greeting")
	public Sba greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Sba(atomicLong.incrementAndGet(), String.format(template, name));
	}
}
