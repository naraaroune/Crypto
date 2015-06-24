import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class CypherHomo {

	Map<Integer, ArrayList<Byte>> frequenceSymbole = new HashMap();
	Frequencies f=new Frequencies();
	public CypherHomo(){
		initTableFrequencies(f.getFrequenceLetter());
	}
	
	public void initTableFrequencies(HashMap <Character, Double> map){
		int index=0;
		for (HashMap.Entry<Character, Double> entry : map.entrySet()) {
			int i=entry.getValue().intValue();
			System.out.println("value: "+entry.getValue()+" ---->"+i);
			ArrayList<Byte> array=new ArrayList<>();
			for(int j=0;j<i;i++){
				array.add(new Byte(Integer.toString(index)));
			}
			frequenceSymbole.put(i, array);
		}
	}
	public Map<Integer, ArrayList<Byte>> getFrequenceSymbole(){
		return frequenceSymbole;
	}
	public HashMap<Character,Double> getFrequenceLetter(){
		return f.getFrequenceLetter();
	}
}
