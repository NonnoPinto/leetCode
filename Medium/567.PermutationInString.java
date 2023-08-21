public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() == 0 || s2.length() < s1.length()) return false;

        char[] s1ToCh = s1.toCharArray();
        List<Character> c1 = new ArrayList<>();
        int sub = s1.length(), pos;
        
        for(int i = 0; i < sub; i++)
            c1.add(s1ToCh[i]);

        char c;
        List<Character> found = new ArrayList<>();

        for(int i = 0; i < s2.length(); i++){
            // found in s1
            c = s2.charAt(i);
            if((pos = c1.indexOf(c)) >= 0){
                c1.remove(pos);
                if(c1.isEmpty()) return true;
                found.add(c);
            }
            // found again
            else if((pos = found.indexOf(c)) >= 0){
                for(int k = 0; k < pos; k++){
                    c1.add(found.get(0));
                    found.remove(0);
                }
                found.add(found.get(0));
                found.remove(0);
            }
            // not found
            else {
                c1.addAll(found);
                found.clear();
            }
        }
        return false;
    }
}
        // HERE ABOVE A VERY GREAT IDEA BY A FRIEND OF MINE
        // unfortunately LeetCode had an output limit that didn't allowed big integers
        
        /* if(s1.length() == 0 || s2.length() < s1.length()) return false;
        
        int[] primes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        BigInteger subTot, search;
        subTot = BigInteger.valueOf(1);
        search = BigInteger.valueOf(1);
        int l1 = s1.length(), l2 = s2.length();

        for(int i = 0; i < alphabet.length(); i++){
            Character c = alphabet.charAt(i);
            map.put(c, primes[i]);
        }

        for(int i = 0; i < l1; i++){
            System.out.println(subTot + " " + search);
            subTot = subTot.multiply(BigInteger.valueOf(map.get(s1.charAt(i))));
            search = search.multiply(BigInteger.valueOf(map.get(s2.charAt(i))));
        }

        if(search.equals(subTot)) return true;
        
        for(int i = l1; i < s2.length(); i++){
            System.out.println(subTot + " " + search);
            //System.out.println(s2.charAt(i-l1) + " " + s2.charAt(i));
            search = search.multiply(BigInteger.valueOf(map.get(s2.charAt(i))));
            search = search.divide(BigInteger.valueOf(map.get(s2.charAt(i-l1))));
            if(search.equals(subTot)) return true;
        }

        return false; */ {
    
}
