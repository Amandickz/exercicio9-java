import classes.Client;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com os dados do Cliente: ");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("Aniversário (dd/mm/yyyy): ");
        String aniversario = scanner.nextLine();

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = new Date();
        birthDate = dateFormat.parse(aniversario);

        Client client = new Client(nome, email,birthDate);
        System.out.println(client);

        /*LocalDateTime DATE_TIME = LocalDateTime.now();
        System.out.println(DATE_TIME);
        System.out.println(DATE_TIME.getDayOfMonth());
        System.out.println(DATE_TIME.getMonthValue());
        System.out.println(DATE_TIME.getYear());

        System.out.print("Digite a data de Nascimento: ");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        date = dateFormat.parse(scanner.nextLine());
        System.out.println(dateFormat.format(date));*/

    }
}