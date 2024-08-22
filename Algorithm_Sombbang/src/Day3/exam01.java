package Day3;

import java.util.ArrayDeque;
import java.util.Stack;

/*
문제 : 올바른 괄호
문제 설명
괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어

- "()()" 또는 "(())()" 는 올바른 괄호입니다.
- ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고,
올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

제한사항
- 문자열 s의 길이 : 100,000 이하의 자연수
- 문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.

입출력 예
  s	    answer
"()()"	true
"(())()"	true
")()("	false
"(()("	false

    올바른 괄호가 아닌 판단 조건
    1. 닫히는 괄호가 들어왔는데, 스택이 비어있다.
    2. 마지막에  스택에 데이터가 남아있다.
* */
public class exam01 {
    class Solution {
        boolean solution(String s) {
            Stack<Character> stack = new Stack<>();
            boolean answer = true;
            System.out.println("Hello Java");

            for(int i = 0; i < s.length() ; i++) {
                if(s.charAt(i) =='(') {
                    stack.push('(');
                } else if (s.charAt(i) == ')') {
                    if(stack.isEmpty()) {
                        return false;
                    }
                    stack.pop();
                }
            }

            if(!stack.isEmpty()) {
                answer = false;
            }
            return answer;
        }
    }

    //강사님 풀이
    class Solution1 {
        boolean solution(String s) {
            //조건문안에 시간복잡도 계산?
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 5; j++) {
                    // 이 안쪽 코드가 몇 번이 수행이 되지? 10 * 5
                    // 사용하는 메서드, api 시간복잡도 생각
                }
            }
            ArrayDeque<Character> stack = new ArrayDeque<>();
            // O(N)
            for (int i = 0; i < s.length(); i++) {
                char now = s.charAt(i); //O(1)

                if (now == '(') {
                    stack.addLast(now);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        stack.pollLast();
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
