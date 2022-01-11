import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Kfc> list = new ArrayList<>();
        Kfc KFC = new Kfc("KFC");

        System.out.println("Zadej pocet kurat, ktera si chces objednat / END pro ukonceni ");

        while(sc.hasNextInt()){
            String input = sc.nextLine();
            if(input.toUpperCase().equals("END")){
                break;
            } KFC.sellChicken(Integer.parseInt(input));
        }
    }
}
