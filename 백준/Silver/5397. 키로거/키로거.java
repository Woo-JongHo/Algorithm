import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        try {
            int test = Integer.parseInt(reader.readLine());

            while (test-- > 0) {
                String input = reader.readLine();
                LinkedList<Character> list = new LinkedList<>();
                ListIterator<Character> iterator = list.listIterator();

                for (char c : input.toCharArray()) {
                    if (c == '<') {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    } else if (c == '>') {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    } else if (c == '-') {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                            iterator.remove();
                        }
                    } else {
                        iterator.add(c);
                    }
                }

                for (char ch : list) {
                    answer.append(ch);
                }
                answer.append("\n");
            }

            System.out.print(answer);

        } catch (IOException e) {
            System.out.println("입력 오류: " + e.getMessage());
        }
    }
}
