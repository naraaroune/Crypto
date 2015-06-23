import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;


public class Frequencies {
	HashMap<Character, Double> frequenceLetter = new HashMap<Character, Double>();
	Map<Character, Double> m = new TreeMap<Character, Double>();

	String texte = "POURQUOI AVOIR ATTENDU LA FIN DU MOIS DE JUIN POUR ANNONCER LA CANDIDATURE ALORS QUE DES FEVRIER LORS DE LA PRESENTATION DU PROJET A LHOTEL DE VILLE DE PARIS LE CHOIX SEMBLAIT DEJA PRIS"
			+ "BERNARD LAPASSET  IL Y AVAIT EFFECTIVEMENT PAS MAL DE TEMPS QUE NOUS SENTIONS QUE LE DOSSIER ETAIT MUR ET QUE NOUS POUVIONS LANNONCER PARCE QUE NOUS AVIONS LACCORD DE LETAT ET DE LA VILLE QUI SONT LES DEUX SIGNATAIRES AVEC LE COMITE OLYMPIQUE DE LA CANDIDATURE MAIS IL ETAIT AUSSI IMPORTANT DAVOIR LE TEMPS DECHANGER AVEC LES AUTRES PARTENAIRES NOUS DEVONS TRAVAILLER EN COLLECTIF AVEC UN PRINCIPE  CE SONT LES ATHLETES ET LE MONDE SPORTIF QUI SONT DEVANT"
			+ "A QUEL MOMENT DONNEREZ VOUS PLUS DE PRECISIONS SUR LE DOSSIER DE CANDIDATURE QUELLES SONT LES PROCHAINES ETAPES"
			+ "IL FAUT COMPTER JUSQUA DEBUT OU MI SEPTEMBRE POUR AVOIR LA PREMIERE VERSION COMPLETE DU DOSSIER NOUS MENONS UN TRAVAIL DAPPROCHE AVANT POUR TRAVAILLER SUR LA PARTIE MARITIME PUISQUE SIX DOSSIERS SERONT PRESENTES POUR LES EPREUVES DE VOILE OU DE NAGE EN EAU LIBRE NOUS AURONS AUSSI UNE APPROCHE PLUS DIRECTE AVEC UN CERTAIN NOMBRE DE COMMUNES QUE NOUS VOYONS REGULIEREMENT AFIN DE DEFINIR DES PRINCIPES ET VOIR COMMENT ELLES PEUVENT Y REPONDRE AVANT QUE NOUS SOYONS EVENTUELLEMENT AMENES A LES RETENIR"
			+ "LEMPLACEMENT DU VILLAGE OLYMPIQUE UN CHANTIER PRESSENTI EN SEINE SAINT DENIS SERA DONC CONNU EN SEPTEMBRE AU PLUS TARD"
			+ "OUI NOUS SOMMES EN PLEIN DEDANS MAIS NOUS NE POUVONS PAS VRAIMENT DONNER DES ELEMENTS DINFOS POUR LINSTANT CEST TROP CONFIDENTIEL DANS LA MESURE OU AUJOURDHUI IL NY A DE CERTITUDE SUR AUCUN DES SITES"
			+ "LE COUT DU DOSSIER DE CANDIDATURE A ETE ESTIME A  MILLIONS DEUROS"
			+ "OUI SUR DEUX ANS IL EST POUR LINSTANT ETABLI SUR LA BASE DES QUATRE ACTIONNAIRES NOUS NE SOMMES PAS ENCORE DANS UNE CONFIGURATION TELLE QUELLE SERA DANS LE DOSSIER DEFINITIF AVEC UN GIP GROUPEMENT DINTERET PUBLIC OU UN GIE GROUPEMENT DINTERET ECONOMIQUE NOUS SOMMES EN TRAIN DE DISCUTER AVEC LETAT SUR LES FORMES JURIDIQUES DE NOTRE PROCHAINE ASSOCIATION DANS LE CADRE DE LASSOCIATION TEMPORAIRE AUJOURDHUI NOUS AVONS DEJA RECU  MILLIONS DEUROS    EUROS DU MOUVEMENT SPORTIF LA MEME CHOSE DE LA VILLE DE LA REGION ET DE LETAT"
			+ "COMMENT GARANTIR LA PROBITE DUNE CANDIDATURE ALORS QUE LATTRIBUTION DES COUPES DU MONDE DE FOOTBALL A RECEMMENT FAIT SCANDALE "
			+ "CE NEST PAS COMPLIQUE IL FAUT RESPECTER LES REGLES ETABLIES LA TRANSPARENCE EST LUN DES ELEMENTS DE LAGENDA  UNE FEUILLE DE ROUTE PRESENTEE EN DECEMBRE  PAR LE CIO POUR ASSAINIR LES JEUX OLYMPIQUES JE NOTE DEJA UN SIGNE FORT QUI MONTRE LA FACON DONT EST ABORDEE CETTE NOTION DE TRANSPARENCE  LE CIO A PUBLIE LE MONTANT DES INDEMNITES QUIL VA LAISSER A SES MEMBRES ET A SON PRESIDENT THOMAS BACH"
			+ "AVEZ VOUS PREVU UNE COMMISSION DE CONTROLE INDEPENDANTE POUR FACILITER LE SUVI DE LA CANDIDATURE"
			+ "JATTENDS DE VOIR CE QUE LE CIO NOUS DEMANDE MAIS TOUS LES CAS DE FIGURE SONT ENVISAGES"
			+ "ET QUEN EST IL DUN REFERENDUM POUR ASSOCIER DAVANTAGE LES FRANCILIENS A LEVENEMENT"
			+ "JE NE CROIS PAS QUIL Y EN AURA UN ON SEST PLUTOT MIS DACCORD AVEC LA VILLE POUR METTRE EN PLACE DES CONSULTATIONS REGULIERES A LECHELLE DUNE VILLE DUNE REGION OU DUN SECTEUR DACTIVITE MAIS CE NE DEVRAIT PAS ETRE UN REFERENDUM CAR CEST UN MODELE EXTREMEMENT LOURD IL FAUT AU MOINS  POURCENT DE PARTICIPANTS POUR QUUN REFERENDUM SOIT RECONNU ET ENCORE FAUT IL POSER LA BONNE QUESTION LIDEE AU LIEU DE DEMANDER AUX HABITANTS DE REPONDRE OUI  OU NON  A UNE QUESTION IL SAGIRA DE LES FAIRE PARTICIPER A DES DEBATS SUR DES QUESTIONS PRECISES CONCERNANT TEL OU TEL ASPECT DU DOSSIER";

	public String getTexte() {
		return texte;
	}

	public Frequencies() {
		frequenceLetter.put(' ', 16.024);
		frequenceLetter.put('A', 7.636);
		frequenceLetter.put('B', 0.901);
		frequenceLetter.put('C', 3.260);
		frequenceLetter.put('D', 3.669);
		frequenceLetter.put('E', 14.715);
		frequenceLetter.put('F', 1.066);
		frequenceLetter.put('G', 0.866);
		frequenceLetter.put('H', 0.737);
		frequenceLetter.put('I', 7.529);
		frequenceLetter.put('J', 0.545);
		frequenceLetter.put('K', 0.049);
		frequenceLetter.put('L', 5.456);
		frequenceLetter.put('M', 2.968);
		frequenceLetter.put('N', 7.095);
		frequenceLetter.put('O', 5.378);
		frequenceLetter.put('P', 3.021);
		frequenceLetter.put('Q', 1.362);
		frequenceLetter.put('R', 6.553);
		frequenceLetter.put('S', 7.948);
		frequenceLetter.put('T', 7.244);
		frequenceLetter.put('U', 6.311);
		frequenceLetter.put('V', 1.628);
		frequenceLetter.put('W', 0.114);
		frequenceLetter.put('X', 0.387);
		frequenceLetter.put('Y', 0.308);
		frequenceLetter.put('Z', 0.136);

		m.put(' ', 16.024);
		m.put('A', 7.636);
		m.put('B', 0.901);
		m.put('C', 3.260);
		m.put('D', 3.669);
		m.put('E', 14.715);
		m.put('F', 1.066);
		m.put('G', 0.866);
		m.put('H', 0.737);
		m.put('I', 7.529);
		m.put('J', 0.545);
		m.put('K', 0.049);
		m.put('L', 5.456);
		m.put('M', 2.968);
		m.put('N', 7.095);
		m.put('O', 5.378);
		m.put('P', 3.021);
		m.put('Q', 1.362);
		m.put('R', 6.553);
		m.put('S', 7.948);
		m.put('T', 7.244);
		m.put('U', 6.311);
		m.put('V', 1.628);
		m.put('W', 0.114);
		m.put('X', 0.387);
		m.put('Y', 0.308);
		m.put('Z', 0.136);
	}

	public void print() {
		System.out.println(frequenceLetter);
	}


	public void printSorted(){		
		//SortedSet<Double> values = new TreeSet<Double>(frequenceLetter.values());
		List<Entry<Character, Double>> list=new ArrayList<Entry<Character, Double>>(frequenceLetter.entrySet());
		Collections.sort(list,new ComparatorNew());
		System.out.println(list);
	}
	
	public class ComparatorNew implements Comparator<Entry<Character, Double>>  {
		@Override
		public int compare(Entry<Character, Double> arg0,
				Entry<Character, Double> arg1) {
			return arg1.getValue().compareTo(arg0.getValue());
		}
	}
}