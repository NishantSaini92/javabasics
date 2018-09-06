package collectionofprogram;

import java.util.EnumSet;



enum fru {
	mango,apple,orange,banana
	};//this is how we define enum

public class CollectionEnumSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EnumSet<fru> es=EnumSet.of(fru.mango,fru.apple);//using two values from enum
        System.out.println(es); 
        EnumSet<fru> es1=EnumSet.allOf(fru.class);//using all values from enum
        System.out.println(es1);
        
	}

}
