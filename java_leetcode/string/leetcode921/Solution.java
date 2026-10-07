package java_leetcode.string.leetcode921;

class Solution {
    public int minAddToMakeValid(String s) {
        int pInt = 0, res = 0;
        for(String p: s.split("")){
            if (p.equals("(")) {
                pInt++;
            }else if(p.equals(")") && pInt > 0){
                pInt--;
            } else{
                res++;
            }
        }
        return res + Math.abs(pInt);
    }
}