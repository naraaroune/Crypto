import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PolyAlpha {
	private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private ArrayList<Character> arrayAlphabet = new ArrayList<Character>();

	
	public PolyAlpha() {
		for (int i = 0; i < alphabet.length(); i++) {
			arrayAlphabet.add(alphabet.charAt(i));
		}
	}

	public int getRandomInt() {
		Random r = new Random();
		int i = r.nextInt(26);
		return i;
	}

	public String generateKey() {
		Collections.shuffle(arrayAlphabet);
		String key = "";
		for (int i = 0; i < getRandomInt(); i++) {
			key += arrayAlphabet.get(i);
		}
		return key;
	}
	
	public String encoded(String key,String message){
		int j=0;
		String messageEncoded="";
		for(int i=0;i<message.length();i++){
			char c=key.charAt(i);//letter of key
			int index=alphabet.indexOf(c);//index of c
			char c2=message.charAt(j);//letter of message
			int index2=alphabet.indexOf(c2);//index of c			
			char newChar=alphabet.charAt(index+index2);
			
			messageEncoded+=newChar;
			if(j==message.length()-1){
				break ;
			}
			if(i==key.length()-1 && key.length()<message.length()){
				i=-1;
			}
			j++;
		}
		return messageEncoded;
	}
}
