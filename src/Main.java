
public class Main {

	public static void main(String[] args) {
//		MonoCypher cypher = new MonoCypher();
//		String key = cypher.generatedKey();
//		Frequencies f=new Frequencies();
//		System.out.println(key);
//		System.out.println();
		
//		String encodedMessage = cypher.encode(f.getTexte2(), key);
//		String decodedMessage=cypher.decode(encodedMessage, key);
//		System.out.println("encoded: " + encodedMessage);
//		System.out.println("decoded: " + decodedMessage);
//		System.out.println();
//
//		MonoEncocdedAttck mea = new MonoEncocdedAttck();
//
//		f.printSorted();
//		mea.getFrequencies(encodedMessage);
//		mea.printSorted();
//		mea.getKey(f.getList(), mea.getList());
//		mea.getMap();
		
//		CypherHomo ch= new CypherHomo();
//		ch.printFrequenceSymbole();
		//System.out.println(ch.getFrequenceLetter());
		//System.out.println(ch.getFrequenceSymbole());
		PolyAlpha pa=new PolyAlpha();
		String key=pa.generateKey();
		System.out.println(key);
		String message="IGMNP";
		System.out.println(message);
		String messageEncoded=pa.encoded("BACHELIER",message);
		String messageDecoded=pa.decoded(key,message);
		System.out.println(messageDecoded);
	}

}
