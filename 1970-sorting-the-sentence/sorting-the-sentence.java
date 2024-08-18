class Solution {
    public String sortSentence(String s) {
	String[] str = s.split(" ");               
	String[] res = new String[str.length];     
	StringBuilder sb = new StringBuilder();   
                      
	for (String elem : str) {
		int i = elem.charAt(elem.length()-1)-'0'; 
		res[i - 1] = elem.substring(0, elem.length() - 1); 
	}

	for (int i = 0; i<res.length ;i++){
	sb.append(res[i]);
      if (i < res.length - 1) {
                sb.append(" ");
            }
    }
	return (sb.toString()).trim();
    }
}