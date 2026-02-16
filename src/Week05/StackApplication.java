package Week05;

public class StackApplication {
    public static void main(String[] args){
//        StackChar s = new StackChar();
//        s.push('A');
//        s.push('B');
//        s.push('C');
//        s.display();
//        System.out.println(s);
        System.out.println(isBalanced("(())()")); // Should return true
        System.out.println(isBalanced("(())(")); // Should return false
        System.out.println(isBalanced("(())))")); // Should return false
        System.out.println(isBalanced("((((((((())))")); // Should return false
    }

    public static boolean isBalanced(String paren){
        StackChar s = new StackChar(30);
        //"(())))"
        for(int i = 0; i < paren.length(); i++){
            char current = paren.charAt(i);
            if(current == '('){
//                System.out.println("Pushing " + current);
                s.push(current);
//                System.out.println(s);
            } else if(current == ')'){
                if(s.isEmpty()){
                    return false;
                }
//                System.out.println("Popping: " + s.top() + ", Current " + current);
                s.pop();
//                System.out.println(s);
            }
        }

        if(!s.isEmpty()){
            return false;
        }

        return true;
    }
}
