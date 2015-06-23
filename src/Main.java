
public class Main {

	public static void main(String[] args) {
		MonoCypher cypher = new MonoCypher();
		String key = cypher.generatedKey();
		Frequencies f=new Frequencies();
		String mesageEncoded = f.getTexte();
		System.out.println(key);
		System.out.println();
		
		String encodedMessage = cypher.encode(f.getTexte(), key);
		System.out.println("encoded: " + encodedMessage);
		System.out.println("decoded: " + cypher.decode(encodedMessage, key));
		System.out.println();

		MonoEncocdedAttck mea = new MonoEncocdedAttck();

		f.printSorted();;
		mea.getFrequencies(mesageEncoded);
		mea.printSorted();
	}

}
