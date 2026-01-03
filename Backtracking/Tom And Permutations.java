class Solve{
  ArrayList<String> permute(String str){
    ArrayList<String> result = new ArrayList<>();
    char[] chars = str.toCharArray();
    Arrays.sort();

  boolean[] used = new boolean[chars.length];
    backtrack(chars, new StringBuilder(), used, result);
     return result;
  }
  private void backtrack(char[] chars , StringBuilder current , boolean[] used, ArrayList<String> result{
    if(current.length()==chars.length){
      result.add(current.toString());
      return ;
    }
    for(int i=0;i<chars.length;i++){
      if(used[i]) continue ;
        used[i] = true;
            current.append(chars[i]);
            backtrack(chars, current, used, result);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }
}
