package lab;

public class ParkingInvoice {
	private String type;
	private int duration;
	private boolean paid;
	
	public ParkingInvoice()
	{
		type = "short";
		duration = 1;
		paid = false;
	}
	
	public ParkingInvoice(String type, int duration)
	{
		this.type = type;
		this.duration = duration;
		paid = false;
	}
	
	public void setType (String type)
	{
		if (type.equals("short") || type.equals("long"))
			this.type = type;
		else
			this.type = "short";
	}
	
	public void setDuration (int duration)
	{
		if (duration>0)
			this.duration= duration;
		else 
			this.duration= 1;
	}
	
	public void setPaid (boolean paid)
	{
		this.paid= paid;
	}

	public int getDuration() {
		return duration;
	}

	public boolean getPaid() {
		return paid;
	}
	
	public int calcPrice()
	{
		if (type.equals("short"))
			return 10*duration;
		else 
			return 5 * duration;
	}
	
	public void print()
	{
		String noORyes;
		if (paid==false)
			 noORyes = "no";
		else
			noORyes = "yes"; 
		
		System.out.printf("Invoice [type: %s, duration: %d hour(s), paid: %s, price: %d SR.]\n", this.type, this.duration, noORyes, this.calcPrice());
	}
	
	

}
