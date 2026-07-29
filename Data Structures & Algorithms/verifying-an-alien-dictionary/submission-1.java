class Solution {
    public boolean isAlienSorted(String[] words, String order) {

        //ordering hashmap
        HashMap<Character, Integer> alphabet = new HashMap<>();
        for(int i = 0; i < order.length(); i++) {
            alphabet.put(order.charAt(i), i);
        }

        //flag for exact match OR a failure
        boolean issue = false;
        for (int i = 0; i < words.length - 1; i++) {
            boolean exactMatch = false;
            System.out.println("ASDIUKALSGDHALKSHJD");
            System.out.println(issue);


            int shorter = (words[i].length() < words[i+1].length()) ? words[i].length() : words[i+1].length();

            for (int j = 0; j < shorter; j++) {
                char comparatorA = words[i].charAt(j);
                char comparatorB = words[i+1].charAt(j);

                if (alphabet.get(comparatorB) > alphabet.get(comparatorA)) break;

                if (j == shorter - 1 && alphabet.get(comparatorB) <= alphabet.get(comparatorA)) {
                    exactMatch = true;
                    System.out.println("Clause A");
                }
                if (alphabet.get(comparatorB) < alphabet.get(comparatorA)) {
                    issue = true;
                    System.out.println("Clause B");
                }
            }
            System.out.println("POST: " + issue);
            
            if (issue || (exactMatch && words[i].length() > words[i+1].length())) return false;
        }

        return true;
    }
}