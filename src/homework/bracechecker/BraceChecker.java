package homework.bracechecker;

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
        boolean isValid = true;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    char a = (char) stack.pop();
                    if (stack.isEmpty()) {
                        isValid = false;
                        System.err.println("Stack is empty");
                    } else if ((a != '(')) {
                        isValid = false;
                        System.err.println("error: opened " + a + " but closed " + c + " at line " + i);
                    }
                    break;
                case ']':
                    char b = (char) stack.pop();
                    if (stack.isEmpty()) {
                        isValid = false;
                        System.err.println("Stack is empty");
                    } else if ((b != '[')) {
                        isValid = false;
                        System.err.println("error: opened " + b + " but closed " + c + " at line " + i);
                    }
                    break;
                case '}':
                    char d = (char) stack.pop();
                    if (stack.isEmpty()) {
                        isValid = false;
                        System.err.println("Stack is empty");
                    } else if ((d != '{')) {
                        isValid = false;
                        System.err.println("error: opened " + d + "but closed " + c + " at line " + i);
                    }
                    break;
            }
        }
        if (!stack.isEmpty() && isValid==false) {
            System.err.println("error: not found closed checker");
        } else if (isValid){System.out.println("ok");}

    }
}


//textic stanal simvolneri chareri zangvac vor ira vra for franq,(char c = text.charAt(5) )
//switch case 6depq 3 bacvox 3 pakvox
//fori mej erb push, erb pop stack
// System.err.println("error: opened ( but closed } at 20");
//bacvoxy qcel stacki mej , pakvoxn el stugel hamahuncg e pakvoxin?


