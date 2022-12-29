package Inflearn.section01.ex04;
import java.util.*;

class Main {
    public ArrayList<String> solution(int t, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        String str[] = new String[t];
        for(int i=0; i<t; i++){
            str[i] = sc.next();
        }
        for(String x: T.solution(t, str)){
            System.out.println(x);
        }

    }
}
