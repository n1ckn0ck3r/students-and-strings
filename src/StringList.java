import java.util.Arrays;

public class StringList {
    private String[] strings;

    private void sortStrings() {
        strings = Arrays.stream(strings).
                sorted((String a, String b) -> Integer.compare(a.length(), b.length())).
                toArray(String[]::new);
    }

    public StringList() {
        this.strings = new String[0];
    }

    public void addString(String newString) {
        String[] newStrings = new String[strings.length + 1];
        System.arraycopy(strings, 0, newStrings, 0, strings.length);

        newStrings[strings.length] = newString;
        strings = newStrings;
        sortStrings();
    }

    public String getMaxLengthString() {
        return strings[strings.length - 1];
    }

    public double getAverageLength() {
        double averageLength = 0;
        for (String string : strings) {
            averageLength += string.length();
        }
        return averageLength / strings.length;
    }
}
