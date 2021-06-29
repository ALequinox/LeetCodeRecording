import java.util.*;

public class Test34 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Deque<Character> deque = new LinkedList<>();
        int i = 0;
        if(str.charAt(i) != '(' ){
            System.out.println("NO");
            System.exit(0);
        }
        deque.push(str.charAt(i));
        i++;
        while (i != str.length()){
            if(str.charAt(i) == '(' ){
                deque.push(str.charAt(i));
            }else if(str.charAt(i) == ')'){
                if (deque.isEmpty()){
                    System.out.println("NO");
                    System.exit(0);
                }
                deque.pop();
            }else{
                System.out.println("NO");
                System.exit(0);
            }
            i++;
        }
        if(deque.isEmpty())
            System.out.println("YES");
        else
            System.out.println("NO");*/

        Test34 test34 = new Test34();
        System.out.println(test34.unique_string("hellowelcometoxiaomi"));

    }


    public String unique_string (String s) {
        // write code here
        Set<Character> unique = new TreeSet<>();
        StringBuilder newS = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(unique.add(s.charAt(i))){
                newS.append(s.charAt(i));
            }
        }
        return newS.toString();


    }
}
