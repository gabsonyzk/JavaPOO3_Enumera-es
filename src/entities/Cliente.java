package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	private String name;
	private String email;
	private Date dataNas;
	
	public Cliente() {
	}

	
	public Cliente(String name, String email, Date dataNas) {
		this.name = name;
		this.email = email;
		this.dataNas = dataNas;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDataNas() {
		return dataNas;
	}


	public void setDataNas(Date dataNas) {
		this.dataNas = dataNas;
	}


	@Override
	public String toString() {
		return "Cliente:" + name + "(" + sdf.format(dataNas) + ") - " + email;
	}


}
