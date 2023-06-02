package in.suraj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.suraj.binding.LoginForm;
import in.suraj.binding.registrationForm;
import in.suraj.entity.UserEntity;
import in.suraj.repo.UserRepo;
import in.suraj.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private UserService userService;

	// method to get signup form
	@GetMapping("/register")
	public String getRegisterPage() {
		return "register";
	}

	// method to get Signup Data
	@PostMapping("/register")
	public String RegistrationPageHandler(@ModelAttribute UserEntity user, Model model, registrationForm form) {

		boolean status = userService.registerationform(form);

		if (status) {
			model.addAttribute("succMsg", "Registration successful");
		} else {
			model.addAttribute("errMsg", "Choose unique email ");
		}

		System.out.println(user);
		// userRepo.save(user);
		return "register";
	}

	@GetMapping("/login")
	public String getLoginPage(Model model) {
		model.addAttribute("loginForm", new LoginForm());
		return "login";
	}

	@PostMapping("/login")
	public String LoginPageHandler(@ModelAttribute("loginForm") LoginForm loginForm, Model model) {

		String status = userService.loginform(loginForm);

		if (status.contains("success")) {
			// redirect req to display dashboard
			return "redirect:/dashboard";
		}

		model.addAttribute("errMsg", status);
		// userRepo.save(user);
		return "login";
	}
}
