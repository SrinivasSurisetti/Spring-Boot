package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CseHome {
	@RequestMapping ("/csehome")
	public String demo() {
		return "cseindex";
	}
}
