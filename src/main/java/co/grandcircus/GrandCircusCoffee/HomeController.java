package co.grandcircus.GrandCircusCoffee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.GrandCircusCoffee.model.User;
import co.grandcircus.GrandCircusCoffee.model.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService us;

	@RequestMapping("/")
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView("index", "userList", us.getAllUsers());
		return mv;
	}

	@RequestMapping("/newUser")
	public String newUserPage() {
		return "newUser";
	}

	@RequestMapping("/login")
	public String userLoginInfo() {
		return "login";
	}

	@PostMapping("/logUser")
	public ModelAndView logUser(String email, String pass) {
		boolean loginSuccessful = us.loginSuccessful(email, pass);
		if (loginSuccessful) {
			return new ModelAndView("userInfo", "loggedUser", us.getUserByEmail(email));
		} else {
			return new ModelAndView("login", "notValidloginAlert", "Login invalid.");
		}
	}

	@PostMapping("/userInfo")
	public ModelAndView userInfoPage(User u) {
		us.addUser(u);
		ModelAndView mv = new ModelAndView("userInfo", "loggedUser", u);

		return mv;
	}

	@RequestMapping("/help")
	public ModelAndView helpMe(int myNum) {
		return new ModelAndView("index", "theNum", myNum);
	}

}
