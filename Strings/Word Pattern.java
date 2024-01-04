class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] sarray = s.split(" ");
       Map<Character, String> map = new HashMap<>();

       if(sarray.length != pattern.length())
       return false;

       for(int i = 0; i < sarray.length; i++){

           //check for existing key
           if(map.containsKey(pattern.charAt(i))){

               if(!sarray[i].equals(map.get(pattern.charAt(i))))
               return false;
           }
           //doesnot contains key
           else{
               //check if value already exist in the map or not
               if(map.containsValue(sarray[i]))
               return false;

               map.put(pattern.charAt(i), sarray[i]);
           }
       } 
       return true;
    }
}
