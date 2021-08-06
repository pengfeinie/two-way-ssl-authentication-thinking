package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClientSide {

    public static void main(String[] args) {
        System.setProperty("javax.net.debug","all");
        System.setProperty("javax.net.ssl.keyStoreType","jks");
        System.setProperty("javax.net.ssl.keyStore","E:\\npfsourcecode\\java\\sourcecode\\two-way-ssl-authentication\\client-side\\src\\main\\resources\\clientsidekeystore.jks");
        System.setProperty("javax.net.ssl.keyStorePassword","123456");
        SpringApplication.run(ClientSide.class);
    }
}
