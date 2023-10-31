import java.util.ArrayList;
import java.util.Scanner;


public class FoerderantragListe {

	static ArrayList<Foerderantrag> Entries = new ArrayList<Foerderantrag>();
	
	//defining a scanner
	static Scanner scn = new Scanner(System.in);
	
	//creating a List for the Entries
	
	//Function to create a new Entry and add it to the List.
	 static void addEntry(){
		// TODO Auto-generated method stub
		
		//WARNING!!!! EVERY USER CONSOLE INPUT NEEDS TO BE REPLACED WITH GUI INPUTS
		 System.out.println("Status: g, a,");
	     boolean tempStatus = scn.nextBoolean();
	     
	     System.out.println("Name: ");
	     String tempName = scn.next();
	     
	     System.out.println("Betrag:");
	     float  tempBetrag = scn.nextFloat();
	     
	     System.out.println("Datum:");
	     String tempDatum = scn.next();
	     
	     System.out.println("Fachbereich:");
	     String tempFachbereich = scn.next();
	     
	     System.out.println("Zahlungsrhymus in €/monat:");
	     String tempZahlungsrhytmus = scn.next();
	//WARNING END
	     
	     
	     Foerderantrag tempEntry = new Foerderantrag(tempStatus, tempName,tempBetrag, tempDatum,tempFachbereich, tempZahlungsrhytmus);
	     Entries.add(tempEntry);
	}
	
	 
	 
	 
	 
	 static boolean getAntragStatus(){
		 boolean foundStatus = false;
		 for(int i=0; i < Entries.size();i++){ 
			  foundStatus = Entries.get(i).isStatus(); 
		 }
		 return foundStatus;
	 }
	 static String getAntragName(){
		 String foundName = null;
		 for(int i=0; i < Entries.size();i++){ 
			  foundName = Entries.get(i).getName(); 
		 }
		 return foundName;
	 }
	 
	 
	 ///MAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIANMAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIANMAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIANMAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIAN
	 ///MAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIANMAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIANMAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIANMAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIAN
	 ///MAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIANMAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIANMAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIANMAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIAN
	 /// MAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIANMAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIANMAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIANMAINMAINMAINMAINMAINMAINMAINMAINAMINAMINAMINAMKIAN
	 
	 

	 
	 
	 
	 
	public static void main(String[] args) {
		
		addEntry();
		// TODO Auto-generated method stub
		
		
	}
}

