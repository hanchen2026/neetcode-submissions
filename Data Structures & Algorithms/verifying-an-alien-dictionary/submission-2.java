class Solution {
    public boolean isAlienSorted(String[] words, String order) {

        //ordering hashmap
        HashMap<Character, Integer> alphabet = new HashMap<>();
        for(int i = 0; i < order.length(); i++) {
            alphabet.put(order.charAt(i), i);
        }

        //flag for a failure
        boolean issue = false;
        for (int i = 0; i < words.length - 1; i++) {
            //flag for exact match (to be reset every pair config)
            boolean exactMatch = false;

            //loop through shorter prefix
            int shorter = (words[i].length() < words[i+1].length()) ? words[i].length() : words[i+1].length();

            for (int j = 0; j < shorter; j++) {
                char comparatorA = words[i].charAt(j);
                char comparatorB = words[i+1].charAt(j);

                //if already a fine word (ie: "CAN" and "CRY", move on)
                if (alphabet.get(comparatorB) > alphabet.get(comparatorA)) break;

                //if at the end, and the last is a match, it is an exact match
                if (j == shorter - 1 && alphabet.get(comparatorB) == alphabet.get(comparatorA)) exactMatch = true; 
                if (alphabet.get(comparatorB) < alphabet.get(comparatorA)) issue = true;
            }
            
            if (issue || (exactMatch && words[i].length() > words[i+1].length())) return false;
        }

        return true;
    }
}