package com.armeniopinto.example.spockgroovy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Controller {

	@Autowired
	private Reverser reverser;

	@RequestMapping(value = "/words/mirror", method = RequestMethod.POST)
	public String wordsMirror(@RequestBody String sentence) {
		return reverser.reverseWords(sentence);
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(Controller.class).web(true).run(args);
	}

}