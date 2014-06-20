package com.configuration.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.configuration.example.model.Pessoa;

@Controller
public class HelloController {
    
	@ModelAttribute("pessoa")
	public Pessoa populateForm() {
		return new Pessoa("Ricardo", 20);
	}
	
    @RequestMapping("/")
    public String home(Model m) {
        return "person-form";
    }
    
    @ResponseBody
    @RequestMapping("person-action")
    public String personAction(Pessoa p) {
        return p.getNome();
    }
    
    //http://viralpatel.net/blogs/spring-mvc-flash-attribute-example/

}
