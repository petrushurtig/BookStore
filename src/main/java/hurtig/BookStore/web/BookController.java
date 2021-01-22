package hurtig.BookStore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	@GetMapping("/index")
	public String bookForm(Model model) {
		model.addAttribute("book", new Book());
		return "books";
	}
}
