class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> hm=new HashMap<>();

        for(String s : strs){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            if(!hm.containsKey(str)){
                List<String> li = new ArrayList<>();
                li.add(s);
                hm.put(str,li);
            }else{
                List<String> li = hm.get(str);
                li.add(s);
            }
        }
        for(List<String> group : hm.values()){
            list.add(group);
        }
        return list;
    }
}