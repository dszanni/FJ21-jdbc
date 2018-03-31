package br.caelum.exception;

public class DAOException extends RuntimeException{
	
	@Override
	public String getMessage() {
		System.out.println("Exception DAO");
		return super.getMessage();
	}

}
