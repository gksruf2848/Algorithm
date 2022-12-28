import java.util.*;
class Main03{
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!=-1){
            String tmp=str.substring(0, pos);
            int len=tmp.length();

        }
        return answer;
    }
    public static void main(String[] args){
        Main03 T = new Main03();
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(T.solution(str));
    }
}
