import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class CypherHomo {

	Map<Character, ArrayList<Byte>> frequenceSymbole = new HashMap();
	Frequencies f=new Frequencies();
	public CypherHomo(){
		initTableFrequencies(f.getFrequenceLetter());
	}
	
	public void initTableFrequencies(HashMap <Character, Double> map){
		int index=0;
		for (HashMap.Entry<Character, Double> entry : map.entrySet()) {
			int i=entry.getValue().intValue();
			if(i==0)i+=1;
			String s=i+"";
			//System.out.println("s: "+s);
			ArrayList<Byte> array=new ArrayList<>();
			for(int j=0;j<i;j++){
				array.add(new Byte(Integer.toString(index)));				
				index++;
			}
			frequenceSymbole.put(entry.getKey(), array);
		}
	}
	public Map<Character, ArrayList<Byte>> getFrequenceSymbole(){
		return frequenceSymbole;
	}
	
	public void printFrequenceSymbole(){
		String key="";
		for (HashMap.Entry<Character, ArrayList<Byte>> entry : frequenceSymbole.entrySet()) {
			key+=entry.getKey();
			ArrayList<Byte> array=entry.getValue();
			//System.out.println("    "+entry.getKey()+" "+entry.getValue().size()+"   ");
			for(int i=0;i<array.size();i++){
				key+=array.get(i);
			}
		}
		System.out.println(key);
	}
	public HashMap<Character,Double> getFrequenceLetter(){
		return f.getFrequenceLetter();
	}
}
