package in.suraj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	
	@GetMapping("/dashboard")
	public String Dashboard() {
		System.out.println("Dashboard method called");
		return "dashboard";
	}

	@GetMapping("/createBlog")
	public String createBlogPage() {
		return "createBlog";
	}
}
