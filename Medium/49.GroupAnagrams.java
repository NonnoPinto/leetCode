class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> sol = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        char[] chars;
        Integer id = null;
        int counter = 0;
        for(int i = 0; i < strs.length; i++){
            chars = strs[i].toCharArray();
            Arrays.sort(chars);
            id = map.get(new String(chars));
            if(id == null){
                map.put(new String(chars), counter);
                counter++;
                List<String> list = new ArrayList();
                list.add(strs[i]);
                sol.add(list);
            }
            else{
                ListIterator<List<String>> iter = sol.listIterator(id);
                List<String> list = iter.next();
                list.add(strs[i]);
            }
        }
        return sol;
    }
}