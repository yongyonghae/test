package a.b.c;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import a.b.c.bean.Member;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
		return "home";
	}
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public ModelAndView join(Model model, @ModelAttribute("mb") Member mb2) { 
		System.out.println(mb2);
//		mm.join(model,mb);
		ModelAndView mav = new ModelAndView();
		mav.addObject("mb",mb);
		mav.setViewName("main");
		//		model.addAttribute("mb",mb); //model->request
		return mav;
	}

}
