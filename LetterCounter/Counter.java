package Example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Art {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < a; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        for (int i = 0; i < alphabet.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {

                String alphavit = list.get(j);
                char[] test = alphavit.toCharArray();
                for (int x = 0; x < test.length; x++) {
                    if (alphabet.get(i).equals(test[x])) {
                        count++;
                    }
                }
            }
            System.out.println(alphabet.get(i) + " " + count);
        }
    }
}

