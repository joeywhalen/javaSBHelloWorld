package com.tts.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//add @Controller annotation
@Controller
public class GreetingController {
	//add @GetMapping annotation for /greeting
		@GetMapping("/greeting")
		public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
			model.addAttribute("name", name);
			return "greeting";
		}
		
		//@RequestMapping(value="/greeting", method = RequestMethod.GET)
		
		//@RequestParam(name="name", required=false, defaultValue="World")

		@PostMapping("/greeting")
		  public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
		    model.addAttribute("greeting", greeting);
		    return "result";
		  }
		
		public class Greeting {

			  private long id;
			  private String content;

			  public long getId() {
			    return id;
			  }

			  public void setId(long id) {
			    this.id = id;
			  }

			  public String getContent() {
			    return content;
			  }

			  public void setContent(String content) {
			    this.content = content;
			  }

			}
}
