class Solution {
    public boolean rotateString(String s, String goal) {
         if(s.equals(goal))
         return true;

         if(s.length() != goal.length())
         return false;

         s += s;

         return s.contains(goal);
    }
}