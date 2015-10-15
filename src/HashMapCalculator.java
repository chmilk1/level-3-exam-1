import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int maches = 0;
		for (String s:hashmap1.keySet()){
			if(hashmap1.get(s).equals(hashmap2.get(s))){
				maches=maches+1;
			}
		}
		return maches;
	}



}
