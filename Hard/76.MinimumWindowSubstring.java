class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        HashMap<Character, Integer> find = new HashMap<>();
        List<Integer> ind = new ArrayList<>();

        int subLen = t.length();
        for(int i = 0; i < subLen; i++)
            find.compute(t.charAt(i), (k,v)
                            -> (v == null)? 1 : v+1);

        Integer rep;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int sol[] = {0, -1};

        for(int i = 0; i < s.length(); i++){
            rep = find.computeIfPresent(s.charAt(i), (k,v)
                            -> v-1);

            if(rep!=null){
                ind.add(i);

                if(rep>=0) count++;
                else
                    for(int j = 0; j < ind.size(); j++)
                        if(s.charAt(ind.get(j)) == s.charAt(i)) {
                            ind.remove(j);
                            break;
                        }
                int left = ind.get(ind.size()-1), right = ind.get(0);
                if(count == subLen && (left - right) < min){
                    min = left - right;
                    sol[0] = right; sol[1] = left;
                }
            }
        }

        return s.substring(sol[0], sol[1]+1);
    }
}