package com.itech.ultimate.abssRest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itech.ultimate.abssController.Login;

@RestController
public class LoginRest implements ErrorController{
	
	private static final String template = "Hello, %s!";
	private static final String PATH = "/error";
	
	private final AtomicLong counter = new AtomicLong();
    

    @RequestMapping("/login")
    public Login login(@RequestParam(value="username", defaultValue="World") String username, 
    		@RequestParam(value="pass", defaultValue="p@ssw0rd") String pass) {
    		
    		Login log = new Login(counter.incrementAndGet(),username,String.format(template, username));
    		
    		return log;
    }
    
    @Override
    public String getErrorPath() {
        return PATH;
    }
}
