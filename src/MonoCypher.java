import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Random;

public class MonoCypher implements ICypher {

	final char[] KeyBase = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
			'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'S', 'T', 'U', 'V', 'W', 'X',
			'Y', 'Z' };
	private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + " ";
	
	@Override
	public String generatedKey(){

        char[] charTable = alphabet.toCharArray();
        int currentIndex = charTable.length, randomIndex;
        char temporaryValue;

        // While there remain elements to shuffle...
        while (0 != currentIndex) {

            // Pick a remaining element...
            randomIndex = (int) Math.floor(Math.random() * currentIndex);
            currentIndex -= 1;

            // And swap it with the current element.
            temporaryValue = charTable[currentIndex];
            charTable[currentIndex] = charTable[randomIndex];
            charTable[randomIndex] = temporaryValue;
        }

        return new String(charTable);
    }
	
	private HashMap<Character, Character> buildConversionTable(String key, boolean reverse){
        HashMap<Character,Character> table = new HashMap<Character, Character>();
        for(int i=0 ; i < alphabet.length() ; i++){
            if(reverse){
                table.put(key.charAt(i), alphabet.charAt(i));
            }else{
                table.put(alphabet.charAt(i), key.charAt(i));
            }
        }
        return table;
    }
	
	public String encode(String message, String key) {
		  HashMap<Character,Character> table = buildConversionTable(key, false);
	        StringBuilder stringBuilder = new StringBuilder();

	        for (int i = 0 ; i < message.length(); i++){
	            stringBuilder.append(table.get(message.charAt(i)));
	        }

	        return stringBuilder.toString();
	}
	
	public String decode(String crypted, String key) {
		  HashMap<Character,Character> table = buildConversionTable(key, true);
	        StringBuilder stringBuilder = new StringBuilder();

	        for (int i = 0 ; i < crypted.length(); i++){
	            stringBuilder.append(table.get(crypted.charAt(i)));
	        }

	        return stringBuilder.toString();

	}

	public void generatedKey(File key) {

		char alphabet[] = KeyBase.clone();
		

		Random rand = new Random();
		for (int i = 0; i < alphabet.length; i++) {
			int randomIndex = rand.nextInt(alphabet.length - i + 1);
			char c = alphabet[i];
			alphabet[randomIndex] = c;
		}

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(key));
			writer.write(new String(alphabet));
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	
}
