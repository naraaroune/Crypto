import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.SortedSet;
import java.util.Map.Entry;

public class MonoEncocdedAttck {

	/**
	 * Frequence d'apparition des lettres dans la langue francaise
	 */
	public static final double[] FREQUENCE_LETTRE = { 7.636, 0.901, 3.260,
			3.669, 14.715, 1.066, 0.866, 0.737, 7.529, 0.545, 0.049, 5.456,
			2.968, 7.095, 5.378, 3.021, 1.362, 6.553, 7.948, 7.244, 6.311,
			1.626, 0.114, 0.387, 0.308, 0.136 };
	List<Entry<Character, Double>> list;

	HashMap<Character, Double> frequencies2 = new HashMap<>();
	HashMap<Character, Character> map=new HashMap<Character, Character>();
	public String findKey(String encoded, String key) {

		return null;
	}

	public HashMap<Character, Double> getFrequencies(String message) {
		HashMap<Character, Integer> frequencies = new HashMap<>();

		for (int i = 0; i < message.length(); i++) {
			Integer c = frequencies.get(message.charAt(i));
			if (c == null) {
				frequencies.put(message.charAt(i), 1);
			} else {
				frequencies.put(message.charAt(i), c + 1);
			}
		}
		for (HashMap.Entry<Character, Integer> entry : frequencies.entrySet()) {
			double d = entry.getValue();
			d = d * 100 / message.length();
			frequencies2.put(entry.getKey(), d);
		}
		return frequencies2;
	}
	public List<Entry<Character, Double>> getList(){
		return list;
	}
	public HashMap<Character, Character> getKey(List<Entry<Character, Double>> reelValues, List<Entry<Character, Double>> getValues){
		
		for (int i = 0; i < getValues.size(); i++) {
			map.put(reelValues.get(i).getKey(), getValues.get(i).getKey());
		}
		return map;
	}
	
	public void getMap(){
		System.out.println(map);
		String theKey="";
		for (HashMap.Entry<Character, Character> entry : map.entrySet()) {
			theKey += entry.getValue();
		}
		System.out.println(theKey);
	}
	public void printSorted(){		
		list=new ArrayList<Entry<Character, Double>>(frequencies2.entrySet());
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
