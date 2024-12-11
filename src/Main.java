import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LocalDateTime DATE_TIME = LocalDateTime.now();
        System.out.println(DATE_TIME);
        System.out.println(DATE_TIME.getDayOfMonth());
        System.out.println(DATE_TIME.getMonthValue());
        System.out.println(DATE_TIME.getYear());



    }
}