import java.io.IOException;
import java.util.List;


public class Main {

	public static void main(String[] args) throws IOException {
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
//		PolyAlpha pa=new PolyAlpha();
//		String key=pa.generateKey();
//		System.out.println("key: "+key);
//		String message="TCMWUB";
//		System.out.println("message: "+message);
//		String messageEncoded=pa.encoded(key,message);
//		String messageDecoded=pa.decoded("BC",message);
//		System.out.println("message decoded: "+messageDecoded);
		Transposition t=new Transposition();
		String message= "SALUT CRYPTO";
		System.out.println(message);
		List<Integer> key=t.generatePermutation(3);
		System.out.println(key);
		String messageEncoded=t.encode(message, key);
		System.out.println(messageEncoded);
		TranspositionAttack tp =new TranspositionAttack();
		
		

	}

}
