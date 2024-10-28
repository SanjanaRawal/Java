import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String str = in.next();
        System.out.print("Enter letter : ");
        char target = in.next().charAt(0);

        System.out.println("Do you wanna check whether a letter is present or want to find it's position?");
        System.out.println("Use c for check and f to get position");
        System.out.print("Enter your choice : ");
        char ch = in.next().charAt(0);

        if(ch=='c') {
            System.out.println("Is " + target + " in " + str + " ?");
            boolean ans = check(str , target);
            System.out.println(ans);
        }

        if(ch=='f') {
            int ans = find(str , target);

            if(ans==-1)
                System.out.println(target + " isn't present in " + str);
            else
                System.out.println("First occurrence of " + target + " in " + str + " is at index " + ans);
        }

    }

    static boolean check(String str , char target) {

        if(str.isEmpty())  //if(str.length()==0)
            return false ;

        for(char ele : str.toCharArray()) {
            if(ele == target)
                return true ;
        }

        return false ;
    }

    static int find(String str , char target) {

        if(str.isEmpty())
            return -1 ;

        for(int i = 0 ; i < str.length() ; i++) {
            if(target == str.charAt(i))
                return i;
        }

        return -1 ;
    }
}

