import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayListA = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Заполните Лист \"A\": Заполнено: " + i + " из 5");
            arrayListA.add(scanner.next());
        }
        System.out.println("============================================================");
        System.out.println("Лист А заполнен : ");
        System.out.println(arrayListA);

        System.out.println("------------------------------------------------------------");

        ArrayList<String> arrayListB = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Заполните Лист \"B\": Заполнено: " + i + " из 5");
            arrayListB.add(scanner.next());
        }
        System.out.println("============================================================");
        System.out.println("Лист B заполнен : ");
        System.out.println(arrayListB);

        System.out.println("--------------");

        System.out.println("==========================");
        System.out.println("Общий список А и В");
        System.out.println("Сптсок листа \"A\" - " + arrayListA);
        System.out.println("список листа \"В\" - " + arrayListB);

        System.out.println("------------------------");
        Collections.reverse(arrayListB);

        int lenthList = arrayListA.size();

        ArrayList<String> arrayListC = new ArrayList<>(lenthList);
        for (int i = 0; i < lenthList; i++) {
            arrayListC.add(arrayListA.get(i));
            arrayListC.add(arrayListB.get(i));
        }
        System.out.println(arrayListC);
        System.out.println("---------------------------------");

        arrayListC.sort(Comparator.comparingInt(String::length));
        System.out.println(arrayListC);
    }
}
