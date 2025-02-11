import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the string you would like reversed: ");
        String input = inp.nextLine();
        String out = "";
        for(int i = 1; i <= input.length(); i++) {
            out += input.charAt(input.length()-i);
        }
        System.out.println("Your reversed string is \"" + out + "\"");
        inp.close();
    }
    
}
