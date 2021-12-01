package com.capgemini.ebugtracker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsernamePasswordInvalidException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public UsernamePasswordInvalidException() {
		super();
	}
}

