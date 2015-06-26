import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class TranspositionAttack {

	public static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	Map<String, Float> dictionary;

	public TranspositionAttack() throws IOException {
		Map<Character, Float> baseFrequencies = getLetterFrequencies(alphabet, false);
		dictionary = getDictionnary();
	}

	public static Map<String, Float> getDictionnary() throws IOException {
		Map<String, Float> listWord = new HashMap<>();

		File file = new File("C:\\Users\\Aroune\\Desktop\\dico.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));

		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] parts = line.split("#");
			listWord.put(parts[0], Float.parseFloat(parts[1]));
		}
		return listWord;
	}

	public static Map<Character, Float> getLetterFrequencies(
			String alphabetFilter, boolean reverse) throws IOException {
		Map<Character, Float> listLetter = new HashMap<>();
		File file = new File("C:\\Users\\Aroune\\Desktop\\freq.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] parts = line.split("#");
			if (alphabetFilter.indexOf(parts[0].charAt(0)) != -1) {
				listLetter.put(parts[0].charAt(0), Float.parseFloat(parts[1]));
			}
		}
		return listLetter;
	}
	
	public Map<String, Float> selectWordsWith(final Character f){
        final Map<String, Float> words = new HashMap<>();
        dictionary.forEach(new BiConsumer<String, Float>() {
            @Override
            public void accept(String s, Float aFloat) {
                if(s.indexOf(f) != -1){
                    words.put(s, aFloat);
                }
            }
        });
        return words;
    }
}
