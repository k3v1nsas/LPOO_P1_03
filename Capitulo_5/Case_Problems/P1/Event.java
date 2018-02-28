
package eventdemo;

public class Event {
	
	public static Integer ppI = 35;
	public static Integer ppLE = 1750;
	private String Ne;
	private Integer InvXE;
	private Integer price;
	private boolean grande;	
	public void setNumE(String eventNumber) {
		this.Ne = eventNumber;
	}

	public void setNumInv(Integer invXe) {
		this.InvXE = invXe;
		this.price = this.InvXE * ppI;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getNumE() {
		return Ne;
	}

	public Integer getNumInv() {
		return InvXE;
	}
	
	
	public void setGrande() {
		if(price < ppLE) 
                    grande = false;
		else 
                    grande = true;
		
	}

	public String text() {
		setGrande() ;
		return "Evento:" + Ne + "\nNumero de invitados:" +
                        InvXE + "\nPrecio por invitado: "+ ppI + "\nPrecio Total="
				+ price + "\nLa fiesta es grande : "+grande;
	}

	

}