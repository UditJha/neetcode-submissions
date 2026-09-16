class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Long> anagramMap = new HashMap();

        for (int i=0; i<s.length(); i++) {
            if(anagramMap.containsKey(s.charAt(i))) 
            {
                anagramMap.put(s.charAt(i), anagramMap.get(s.charAt(i))+1L);
            }
            else {
                anagramMap.put(s.charAt(i), 1L);
            }
        }


        for (int i=0; i<t.length(); i++) {
            if(anagramMap.containsKey(t.charAt(i))) 
            {
                anagramMap.put(t.charAt(i), anagramMap.get(t.charAt(i))-1L);
            }
            else {
                return false;
            }
        }

        for(Long val : anagramMap.values()) 
        {
              if (val != 0L) 
            return false;

        }
           return true;
        }
       

    }

