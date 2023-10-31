
public abstract class Antragsteller {

	public String name;
	public String nachname;
	public String adresse;
	private String iban;
	private String bezahlungsart;
	
	
	public Antragsteller(String name, String nachname, String adresse,
			String iban, String bezahlungsart) {
		super();
		this.name = name;
		this.nachname = nachname;
		this.adresse = adresse;
		this.iban = iban;
		this.bezahlungsart = bezahlungsart;
	}


	@Override
	public String toString() {
		return name + " " + nachname
				+ " " + adresse + " " + iban
				+ " " + bezahlungsart;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getBezahlung() {
		return bezahlungsart;
	}
	public void setBezahlung(String bezahlungsart) {
		this.bezahlungsart = bezahlungsart;
	}
	
	


	
	
	
}