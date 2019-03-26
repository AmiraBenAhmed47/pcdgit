package com.example.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.com.entities.Etudiant;
import com.example.com.repositories.EtudiantRepository;

@Controller
public class MainController {

	@Autowired
	EtudiantRepository etudiantRepository;

	@GetMapping("/acceuil")
	public String welcome(Model model) {

		return "acceuil";
	}

	@GetMapping("/connection")
	public String home(Model model) {

		return "connection";
	}

	@GetMapping("/signup")
	public String returnSignup(Model model) {

		return "signup";
	}

	@GetMapping("/contact")
	public String returnContact(Model model) {
		return "contact";
	}

	@GetMapping("/inscription")
	public String returnIsncription(Model model) {

		model.addAttribute("EtudiantForm", new Etudiant()); // !!!!
		return "inscription";
	}

	@PostMapping("/inscription")
	public String inscription(@ModelAttribute("userForm") Etudiant userForm, BindingResult bindingResult, Model model) {
		// userValidator.validate(userForm,bindingResult);

		model.addAttribute("user", userForm);
		etudiantRepository.save(userForm);
		if (bindingResult.hasErrors()) {
			return "inscription";
		}
		// userRepository.save( userForm);
		return "redirect:/acceuil";
	}

}
