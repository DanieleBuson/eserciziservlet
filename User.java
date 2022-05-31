package com.academy;

import jakarta.servlet.RequestDispatcher;

public class User {
	private String nome; 
	private String email; 
	private String password; 
	
	public User() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean checkLogin() {
		boolean isLoggato = false;
		
		if(this.nome.equals("daniele") && this.password.equals("abcd")) 
			isLoggato = true;
			
		return isLoggato;
	}

	public void error(String string, Throwable throwable) throws Exception {
		throw new Exception("Errore! User o password errati!");
	}
	
	
	
}
