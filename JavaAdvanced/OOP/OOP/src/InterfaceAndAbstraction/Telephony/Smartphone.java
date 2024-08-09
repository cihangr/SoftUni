package InterfaceAndAbstraction.Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {

        StringBuilder sb = new StringBuilder();
        for (String number  : numbers ) {
            if (number.matches("[0-9]+")) {
                sb.append("Calling... ").append(number);
            } else {
                sb.append("Invalid number!");
            }
            sb.append(System.lineSeparator());
        }

        return sb.toString().trim();
    }

    @Override
    public String browse() {
        StringBuilder sb2 = new StringBuilder();
        for (String url  : urls ) {
            if (!url.matches(".*[0-9].*")) {
                sb2.append("Browsing: ").append(url).append("!");
            } else {
                sb2.append("Invalid URL!");
            }
            sb2.append(System.lineSeparator());
        }
        return sb2.toString().trim();
    }
}
