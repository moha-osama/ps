import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public String encode(List<String> strs) {
        StringBuilder encodedText = new StringBuilder();
        for(String s : strs) {
            encodedText.append(s.length()).append("#").append(s);
        }
        return encodedText.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        int i = 0;
        while(i<str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            decodedList.add(str.substring(i, j));
            i = j;
        }
        return decodedList;
    }

    public static void main(String[] args) {
        List<String> testSet = Arrays.asList("neet","code","love","you");
        Main testCase = new Main();
        String decodedText = testCase.encode(testSet);
        System.out.println(decodedText);
        System.out.println(testCase.decode(decodedText));
    }
}