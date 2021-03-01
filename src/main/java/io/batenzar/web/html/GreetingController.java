package io.batenzar.web.html;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

	/**
	 * End-point to return HTML<br>
	 * 
	 * @return HTML content
	 */
	@GetMapping(value = "/welcome", produces = MediaType.TEXT_HTML_VALUE)
	@ResponseBody
	public String welcomeAsHTML() {
		return "<html>\n" + "<header><title>Welcome</title></header>\n" + "<body>\n" + "Hello world\n" + "</body>\n"
				+ "</html>";
	}

	/**
	 * End-point to retrieve web page.<br>
	 * Request parameter
	 * <li>name
	 * 
	 * @param name
	 * @param model
	 * @return view name
	 */
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return "greetingPage"; // match the file name in /templates/<filenmae>.html
	}
}
