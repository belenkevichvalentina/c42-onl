package homework_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataExtractor {

    public void findAbbreviation(String text) {
        Pattern pattern = Pattern.compile("\\s[A-ZА-ЯЁ]{2,6}\\s");
        Matcher matcher = pattern.matcher(text);
        Boolean flag = false;
        System.out.print("Аббревиатуры: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
            flag = true;
        }
        if (!flag) {
            System.out.println("не найдены.");
        }
    }

    public void parsingData(String data) {
        findDoc(data);
        findEmail(data);
        findPhone(data);
    }

    public void findDoc(String data) {
        Pattern pattern = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b");
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            System.out.println("document number: " + matcher.group());
        }
    }

    public void findEmail(String data) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9._+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            System.out.println("email: " + matcher.group());
        }
    }

    public void findPhone(String data) {
        Pattern pattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            System.out.println("phone number: " + matcher.group());
        }
    }

}
