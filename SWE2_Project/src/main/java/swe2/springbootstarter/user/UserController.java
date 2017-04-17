package swe2.springbootstarter.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class UserController {
	
	
		@Autowired
		UserService userService;
	
		@RequestMapping (method=RequestMethod.POST,value="/teacher")
		public void addUser(@RequestBody Teacher user  ){
				
			userService.addUser(user);
			
		}
	
	
		@RequestMapping (method=RequestMethod.GET,value="/teacher/{teacherMail}")
		public Users addUser(@PathVariable String teacherMail  ){
				
			return userService.getUser(teacherMail);
			
		}
	
	
	
	

}
