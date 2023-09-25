import java.util.*;

class Solution {
    public int solution(String num_str) {
        int answer = 0;
        //1. 
        // answer = num_str.chars().map(c -> c - 48).sum();
        
        //2.
        String[] numArr = num_str.split("");
        for(String num : numArr) {
            answer += Integer.parseInt(num);
        }
        
        return answer;
    }
}