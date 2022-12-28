package Programmers.lv0.ex120811;
import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[(array.length-1)/2];
    }
}