package com.desafio.componentes;

import com.desafio.componentes.entities.Order;
import com.desafio.componentes.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ComponentesApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(ComponentesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        double basic = sc.nextDouble();
        double discount = sc.nextDouble();
        Order order = new Order(code, basic, discount);

        System.out.println("Pedido código " + order.getCode());
        System.out.printf("Valor total: R$ %.2f", orderService.total(order));

        sc.close();
    }
}
