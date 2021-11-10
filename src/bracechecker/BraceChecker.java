package bracechecker;

public class BraceChecker {

    private String text;

    //klassi konstruktorn e,vory petq e ynduni String tipi text ev veragri verevi textin
    public BraceChecker(String text) {
        this.text = text;


    }

    //sa himnakan metodne,vori mej grelu enq amboxj logikan,ashxatelu enq stacki ev texti het
    public void check() {
        // char[] chars = text.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            // for (int j = text.length()-1; j >0 ; j--) {
            char c = text.charAt(i);
            //char ch=text.charAt(text.length()-1-i);

            switch (c) {
                case '(':
                    stack.push('(');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case '{':
                    stack.push('{');
                    break;
                case ')':
                    if (!stack.isEmpty()) {
                        char a = (char) stack.pop();
                        if ((a != '(')) {
                            System.err.println("error: opened" + a + "but close" + c + "at line" + i);
                        }
                    }else System.err.println("Stack is empty");
                    break;
                case ']':
                    if (!stack.isEmpty()) {
                        char b = (char) stack.pop();
                        if ((b != '[')) {
                            System.err.println("error opened" + b + "but close" + c + "at line" + i);
                        }
                    }else System.err.println("Stack is empty");
                    break;
                case '}':
                    if (!stack.isEmpty()) {
                        char d = (char) stack.pop();
                        if ((d != '{')) {
                            System.err.println("error opened" + d + "but closed" + c + "at line" + i);
                        }
                    } else System.err.println("Stack is empty");
                    break;
                default:
                    break;
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("error: not found closed checker");
        } else System.out.println("ok");

    }
}


//textic stanal simvolneri chareri zangvac vor ira vra for franq,(char c = text.charAt(5) )
//switch case 6depq 3 bacvox 3 pakvox
//fori mej erb push, erb pop stack
// System.err.println("error: opened ( but closed } at 20");
//bacvoxy qcel stacki mej , pakvoxn el stugel hamahuncg e pakvoxin?


