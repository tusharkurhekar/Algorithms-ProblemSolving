package Challenge14;

import java.util.HashMap;

public class ValidAnagram {
	
	public boolean validAnagram(String s, String t) {
        

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length();i++){

            if(map.containsKey(s.charAt(i))){
                map.replace(s.charAt(i), map.get(s.charAt(i))+1);
            }else{

                map.put(s.charAt(i), 1);
            }
        }

        HashMap<Character, Integer> map1 = new HashMap<>();


        for(int i=0; i<t.length();i++){

            if(map1.containsKey(t.charAt(i))){
                map1.replace(t.charAt(i), map1.get(t.charAt(i))+1 );
            }else{
                map1.put(t.charAt(i), 1);
            }
        }

        System.out.println(map);
        System.out.println(map1);

        return map.equals(map1);

	}


}
