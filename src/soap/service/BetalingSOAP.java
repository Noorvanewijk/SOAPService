package soap.service;

import java.io.Serializable;
import java.util.UUID;

public class BetalingSOAP implements Serializable {
	private static final long serialVersionUID = -5577579081118070434L;

	private String name;
	private int value;
	private String adress;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String id(String naam, String adres, int value) throws InterruptedException {
		setName(naam);
		setAdress(adress);
		setValue(value);
		
		Thread.sleep(1000 * 30); // hiermee zet je een timer van 30 seconden!

		String id = UUID.randomUUID().toString(); // hiermee genereer een random, unieke key

		return id; // return deze key
	}
}