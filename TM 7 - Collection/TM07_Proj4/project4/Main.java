import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, ArrayList<Card>> map = new TreeMap<>();
        System.out.println("Enter Number of Cards :");
        int noOfCards = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<noOfCards;i++) {
            System.out.println("Enter card " + i+1);
            char symbol = sc.nextLine().charAt(0);
            int number = sc.nextInt();
            Card card = new Card();
            card.setSymbol(symbol);
            card.setNumber(number);
            sc.nextLine();
            if (!map.containsKey(symbol)) {
                ArrayList<Card> list = new ArrayList<>();
                list.add(card);
                map.put(symbol, list);
            } else {
                ArrayList<Card> list = map.get(symbol);
                list.add(card);
            }
        }
        System.out.println("Distinct Symbols are :");
        Set<Entry<Character, ArrayList<Card>>> s = map.entrySet();
        Iterator<Entry<Character, ArrayList<Card>>> i = s.iterator();
        while (i.hasNext()) {
            System.out.print(i.next().getKey() + " ");
        }
        System.out.println();
        s = map.entrySet();
        i = s.iterator();
        while (i.hasNext()) {
            int sum = 0;
            Map.Entry<Character, ArrayList<Card>> me = i.next();
            ArrayList<Card> list = me.getValue();
            System.out.println("Cards in " + me.getKey() + " Symbol");
            for (Card card : list) {
                System.out.println(card.getSymbol() + " " + card.getNumber());
                sum += card.getNumber();
            }
            System.out.println("Number of cards : " + list.size());
            System.out.println("Sum of Numbers : " + sum);
        }
        sc.close();
    }
}