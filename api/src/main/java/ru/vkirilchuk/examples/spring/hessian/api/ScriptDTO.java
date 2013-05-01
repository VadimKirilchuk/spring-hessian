package ru.vkirilchuk.examples.spring.hessian.api;

import java.io.Serializable;

/**
 * Script interface
 **/
public class ScriptDTO implements Serializable {

	private static final long serialVersionUID = 6709170372856048637L;

	private final String type;
	private final String text; 
	
	public ScriptDTO(String type, String text) {
		this.type = type;
		this.text = text;
	}
	
	public String getType() {
		return type;
	}

	public String getText() {
		return text;
	}
	
}

