class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+ 1);
        }
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        Map<Character, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Character, Integer> entry : list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : sortedMap.entrySet()){
        sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return  sb.toString();

    }
}