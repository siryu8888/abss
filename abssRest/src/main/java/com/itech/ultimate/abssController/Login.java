package com.itech.ultimate.abssController;


import io.jsonwebtoken.CompressionCodecs;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import java.security.Key;

import com.itech.ultimate.helper.DateHelper;

public class Login {
	
	private final long id;
	private final String username;
    private final String password;
    private final String token;
    
    public Login(long id, String username,String pass) {
        
    	Key key = MacProvider.generateKey();
    	this.id = id;
    
    	this.username = username;
    
    this.password = pass;
    
    	this.token = Jwts.builder()
    	  .setSubject(username)
    	  .setIssuedAt(DateHelper.getCurrentDate())
//    	  .compressWith(CompressionCodecs.DEFLATE)
    	  .signWith(SignatureAlgorithm.HS512, key)
    	  .compact();
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    
    public String getToken() {
    		return token;
    }
}
