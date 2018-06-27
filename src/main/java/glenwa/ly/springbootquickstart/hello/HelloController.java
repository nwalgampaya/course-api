package glenwa.ly.springbootquickstart.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value= "/hello" ,method = RequestMethod.GET)
	public String sayHi() {
		return "Hi , Its me";
	}
	
	@RequestMapping(value= "/hello/{id}" ,method = RequestMethod.GET)
	public String sayHiName(@PathVariable ("id") int id) {
		String Name = null;
		if(id==1) {
			Name = "Nalin";
		}else
			Name = "All";
		return "Hi , "+ Name;
	}
}
