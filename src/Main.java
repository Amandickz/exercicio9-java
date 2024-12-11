import classes.Client;
import classes.Order;
import classes.OrderItem;
import classes.Product;
import entities.OrderStatus;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        String name, email, birthday, status;
        int quantOrder;

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormat =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do Cliente: ");
        System.out.print("Nome: ");
        name = scanner.nextLine();
        System.out.print("E-mail: ");
        email = scanner.nextLine();
        System.out.print("Aniversário (dd/mm/yyyy): ");
        birthday = scanner.nextLine();

        Date birthDate = new Date();
        birthDate = dateFormat.parse(birthday);

        Client client = new Client(name, email,birthDate);
        System.out.println(client);

        System.out.println("Entre com as informações do pedido: ");
        System.out.print("Status: ");
        status = scanner.nextLine();
        System.out.print("Quantos itens serão inseridos no pedido? ");
        quantOrder = scanner.nextInt();

        LocalDateTime dateTimeOpen = LocalDateTime.now();
        Order order = new Order(client, dateTimeOpen, OrderStatus.valueOf(status));
        System.out.println(order);

        for (int i = 0; i < quantOrder; i++) {

            System.out.println("Entre com o item #: " + (i + 1));
            System.out.print("Nome do Produto: ");
            scanner.nextLine();
            String productName = scanner.nextLine();
            System.out.print("Valor do Produto: ");
            double productValue = scanner.nextDouble();
            System.out.print("Quantidade: ");
            Integer productQuantity = scanner.nextInt();

            Product product = new Product(productName, productValue);
            OrderItem item = new OrderItem(productQuantity, productValue, product);
            order.addItem(item);

        }

        System.out.println("\nRESUMO DO PEDIDO:");
        System.out.println("Data e Hora do pedido: " + dateTimeFormat.format(order.getMoment()));
        System.out.println("Status: " + order.getStatus());
        System.out.println("Cliente: " + order.getClient().getName() + " (" + dateFormat.format(order.getClient().getBirthDate()) + ")" +" - " + order.getClient().getEmail());
        



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