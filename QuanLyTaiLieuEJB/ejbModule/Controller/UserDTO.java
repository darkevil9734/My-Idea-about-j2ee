package Controller;

import javax.ejb.EJB;
import javax.ejb.EJBs;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.sun.faces.action.RequestMapping;

import SessionBeans.UserDAOLocal;

@Controller

public class UserDTO {
	@EJB
	private UserDAOLocal u;
	
	@RequestMapping("/log-in")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("txtUsername");
		String password = request.getParameter("txtPassword");
		
		return null;		
	}
	
	@RequestMapping("/register")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) {
		
		return null;		
	}
}
