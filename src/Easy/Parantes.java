package Easy;

import java.util.Stack;

public class Parantes {
//    Easy.Parantes parantes = new Easy.Parantes();
//        System.out.println(parantes.isValid("()"));
//        System.out.println(parantes.isValid("()[]{}"));
//        System.out.println(parantes.isValid("(]"));
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char currentCharacter = s.charAt(i);
            if(currentCharacter == '(' || currentCharacter == '[' || currentCharacter == '{'){
                stack.push(currentCharacter);
            } else {
                if(stack.size() <= 0) return false;

                char top = stack.pop();

                if((currentCharacter == ')' && top != '(') ||
                    (currentCharacter == ']' && top != '[') ||
                    (currentCharacter == '}' && top != '{')){
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}
