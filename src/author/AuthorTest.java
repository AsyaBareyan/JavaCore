package author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        System.out.println("Qani heginak uneq?, mutqagrel tivy");
        Scanner scanner = new Scanner(System.in);
        AuthorStorage au=new AuthorStorage();
        Author author=new Author("Poxos","Poxosyan","pox.mail.ru",29,"male");
        au.add(author);
        au.add(author);
        au.add(author);
//        au.add(author);
//        au.add(author);
//        au.add(author);


        int a=scanner.nextInt();
        for (int i = 0; i < a; i++) {
            //au.add(Author);
           author.toString();

        }au.print();

        //Author author = new Author();
    }
}
