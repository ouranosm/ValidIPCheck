import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true) {
            Scanner scanner = new Scanner(System.in);
            String learnRegex = scanner.nextLine();


            String compareRegex = "[1-2]?[0-9]?[0-9]\\.[1-2]?[0-9]?[0-9]\\.[1-2]?[0-9]?[0-9]\\.[1-2]?[0-9]?[0-9]";

            //System.out.println(learnRegex.matches(compareRegex));
            boolean secondCheck = true;
            if (learnRegex.matches(compareRegex)) {

                String[] res = learnRegex.split("[.]", 0);
                for (String myStr : res) {
                    if (Integer.parseInt(myStr) > 255) {
                        secondCheck = false;
                        //System.out.println(Integer.parseInt(myStr) + 1);
                    }
                }

            }
            if (learnRegex.matches(compareRegex) && secondCheck == true ) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


        }
}


}