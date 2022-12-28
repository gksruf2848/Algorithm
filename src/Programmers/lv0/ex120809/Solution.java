package Programmers.lv0.ex120809;
import java.util.*;


class Solution {
public ArrayList<Integer> solution(int[] numbers) {
    ArrayList<Integer> answer = new ArrayList<>();

    for(int x:numbers)
        answer.add(x*2);

    return answer;
}
}
