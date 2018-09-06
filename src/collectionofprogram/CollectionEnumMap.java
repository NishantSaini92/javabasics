package collectionofprogram;

import java.util.EnumMap;

public class CollectionEnumMap {
	public enum fru {
		apple,mango,orange,grapes
	
	};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap<fru,Integer> em=new EnumMap<fru,Integer>(fru.class);
		em.put(fru.apple, 2);//key is Enum constants here
		em.put(fru.orange, 1);
		em.put(fru.mango, 4);
		em.put(fru.grapes, 6);
		System.out.println(em);
	}

}
