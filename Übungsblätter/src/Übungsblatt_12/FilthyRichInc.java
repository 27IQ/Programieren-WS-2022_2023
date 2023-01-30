import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilthyRichInc {
	public static void main(String[] args) {
		List<Mitarbeiter> mitarbeiterliste = new ArrayList<Mitarbeiter>();
		List<Mitarbeiter> gefilterteListe = new ArrayList<Mitarbeiter>();
		fillList(mitarbeiterliste);
		System.out.println("Ursprüngliche Liste:" + mitarbeiterliste.toString());
		
		//Sortiere Liste
		//Collections.sort
		
		mitarbeiterliste=mitarbeiterliste.stream().sorted((m1,m2)->m1.getNachname().compareTo(m2.getNachname())).collect(Collectors.toList());

		System.out.println("\nNach Nachnamen sortierte Liste:" + mitarbeiterliste.toString());
		
		//drucke gefilterte Liste
		System.out.print("\nNach Bedingung gefilterte Liste:");
		druckeGefilterteListe(mitarbeiterliste, new Bedingung() {

			@Override
			public boolean erfuellt(Mitarbeiter m) {
				return m.getAbteilung().equals(Abteilung.MANAGEMENT);
			}

		});

		// Mitarbeiter mit Gehalt über 2500

		gefilterteListe=sucheMitarbeiterNachKriterium(mitarbeiterliste, new Bedingung() {

			@Override
			public boolean erfuellt(Mitarbeiter m) {
				return m.getGehalt()>2500;
			}
			
		});

		System.out.println("\n\nMitarbeiter mit Gehalt über 2500$:" + gefilterteListe.toString());
		
		
		// Mitarbeiter im Verkauf

		gefilterteListe=sucheMitarbeiterNachKriterium(mitarbeiterliste, new Bedingung() {

			@Override
			public boolean erfuellt(Mitarbeiter m) {
				return m.getAbteilung().equals(Abteilung.VERKAUF);
			}
			
		});

		System.out.println("\nMitarbeiter im Verkauf:" + gefilterteListe.toString());
		
		
		
		// Mitarbeiter mit Nachnamen beginnend mit G

		gefilterteListe=sucheMitarbeiterNachKriterium(mitarbeiterliste, new Bedingung() {

			@Override
			public boolean erfuellt(Mitarbeiter m) {
				return m.getNachname().startsWith("G");
			}
			
		});

		System.out.println("\nMitarbeiter deren Nachname mit G beginnt:" + gefilterteListe.toString());

		
		
		//Aufgabenteil E
		
		gefilterteListe=sucheMitarbeiterNachKriterium(mitarbeiterliste, new Bedingung() {

			@Override
			public boolean erfuellt(Mitarbeiter m) {
				return m.getAbteilung().equals(Abteilung.WERBUNG);
			}
			
		});

		gefilterteListe.forEach(m->m.setGehalt(m.getGehalt()*2));
			
		gefilterteListe=sucheMitarbeiterNachKriterium(gefilterteListe, new Bedingung() {

			@Override
			public boolean erfuellt(Mitarbeiter m) {
				return m.getGehalt()>10000;
			}
			
		});

		gefilterteListe.sort((m1,m2)->m1.getGehalt()-m2.getGehalt());
		

		System.out.println("\nMitarbeiter über 10.000$:"+gefilterteListe.toString());
		
	}

	public static List<Mitarbeiter> sucheMitarbeiterNachKriterium(List<Mitarbeiter> liste, Bedingung bedingung) {

		return liste.stream().filter(m->bedingung.erfuellt(m)).collect(Collectors.toList());
	}

	public static void druckeGefilterteListe(List<Mitarbeiter> liste, Bedingung bedingung) {

		List<Mitarbeiter> temp=liste.stream().filter(m->bedingung.erfuellt(m)).collect(Collectors.toList());

		temp.forEach(m->System.out.println(m.toString()));
	}
	
	//nur zur Listenbefüllung benötigt. Muss von ihnen nicht bearbeitet werden.
	private static void fillList(List<Mitarbeiter> mitarbeiterliste) {
		mitarbeiterliste.add(new Mitarbeiter("Peter", "Dinklage", 5351, Abteilung.VERSAND));
		mitarbeiterliste.add(new Mitarbeiter("Kit", "Harington", 1656, Abteilung.MANAGEMENT));
		mitarbeiterliste.add(new Mitarbeiter("Sophie", "Turner", 9287, Abteilung.VERKAUF));
		mitarbeiterliste.add(new Mitarbeiter("Maisie", "Williams", 2018, Abteilung.WERBUNG));
		mitarbeiterliste.add(new Mitarbeiter("Isaac", "Hempstead-Wright", 4806, Abteilung.VERTRIEB));
		mitarbeiterliste.add(new Mitarbeiter("Emilia", "Clarke", 2363, Abteilung.RECHNUNGSWESEN));
		mitarbeiterliste.add(new Mitarbeiter("Lena", "Headey", 4557, Abteilung.VERSAND));
		mitarbeiterliste.add(new Mitarbeiter("Nell", "Williams", 7791, Abteilung.MANAGEMENT));
		mitarbeiterliste.add(new Mitarbeiter("Nikolaj", "Coster-Waldau", 5396, Abteilung.VERKAUF));
		mitarbeiterliste.add(new Mitarbeiter("Rory", "McCann", 7917, Abteilung.WERBUNG));
		mitarbeiterliste.add(new Mitarbeiter("Iain", "Glen", 6565, Abteilung.VERTRIEB));
		mitarbeiterliste.add(new Mitarbeiter("Alfie", "Allen", 4650, Abteilung.RECHNUNGSWESEN));
		mitarbeiterliste.add(new Mitarbeiter("Jack", "Gleeson", 5692, Abteilung.VERSAND));
		mitarbeiterliste.add(new Mitarbeiter("Michelle", "Fairley", 9094, Abteilung.MANAGEMENT));
		mitarbeiterliste.add(new Mitarbeiter("Richard", "Madden", 8226, Abteilung.VERKAUF));
		mitarbeiterliste.add(new Mitarbeiter("Jason", "Momoa", 8878, Abteilung.WERBUNG));
		mitarbeiterliste.add(new Mitarbeiter("Sean", "Bean", 5021, Abteilung.VERTRIEB));
		mitarbeiterliste.add(new Mitarbeiter("Sebastian", "Croft", 3482, Abteilung.RECHNUNGSWESEN));
		mitarbeiterliste.add(new Mitarbeiter("Robert", "Aramayo", 8435, Abteilung.VERSAND));
		mitarbeiterliste.add(new Mitarbeiter("Mark", "Addy", 6169, Abteilung.MANAGEMENT));
		mitarbeiterliste.add(new Mitarbeiter("Harry", "Lloyd", 1156, Abteilung.VERKAUF));
		mitarbeiterliste.add(new Mitarbeiter("Aidan", "Gillen", 4860, Abteilung.WERBUNG));
		mitarbeiterliste.add(new Mitarbeiter("Jerome", "Flynn", 3051, Abteilung.VERTRIEB));
		mitarbeiterliste.add(new Mitarbeiter("John", "Bradley", 1967, Abteilung.RECHNUNGSWESEN));
	}

}
