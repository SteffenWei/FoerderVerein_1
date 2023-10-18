
public abstract class Mitglieder {
	
	public String name;
	public String nachname;
	public String anmeldename;
	private String passwort;
	public String adresse;
	
	//ToString
	@Override
	public String toString() {
		return name + " " + nachname +  " " + anmeldename + " " + passwort
				+ " "+  adresse + " " + iban;
	}
	private String iban;
	
	public Mitglieder(String name, String nachname, String anmeldename,
			String passwort, String adresse, String iban) {
		super();
		this.name = name;
		this.nachname = nachname;
		this.anmeldename = anmeldename;
		this.passwort = passwort;
		this.adresse = adresse;
		this.iban = iban;
	
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
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
	public String getAnmeldename() {
		return anmeldename;
	}
	public void setAnmeldename(String anmeldename) {
		this.anmeldename = anmeldename;
	}
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	 
	
	

}
