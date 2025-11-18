class Solution {
    public boolean isAnagram(String s, String t) {

        // HashMap<Character, Integer> map = new HashMap<>();

        // for(char ch : s.toCharArray()){
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }

        // for(char c : t.toCharArray()){
        //     if(!map.containsKey(c)){
        //         return false;
        //     }
        //     map.put(c, map.getOrDefault(c, 0) - 1);
        //     if(map.get(c) == 0){
        //         map.remove(c);
        //     }
        // }
        // return map.isEmpty();

        if(s.length() != t.length()){
            return false;
        }

        int[] arr = new int[128];

        for(int i=0; i<s.length(); i++){
            int ascii = s.charAt(i);
            arr[ascii] = arr[ascii] + 1;
        }

        for(int i=0; i<t.length(); i++){
            int ascii = t.charAt(i);
            arr[ascii] = arr[ascii] - 1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                return false;
            }
        }

        return true;
    }
}