package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * -Djavax.net.debug=all
 * -Djavax.net.ssl.keyStoreType=jks
 * -Djavax.net.ssl.keyStore=E:\npfsourcecode\java\sourcecode\two-way-ssl-authentication\server-side\src\main\resources\serversidekeystore.jks
 * -Djavax.net.ssl.keyStorePassword=123456
 */
@SpringBootApplication
@EnableFeignClients
public class ServerSide {

    public static void main(String[] args) {
        System.setProperty("javax.net.debug","all");
        System.setProperty("javax.net.ssl.keyStoreType","jks");
        System.setProperty("javax.net.ssl.keyStore","E:\\npfsourcecode\\java\\sourcecode\\two-way-ssl-authentication\\server-side\\src\\main\\resources\\serversidekeystore.jks");
        System.setProperty("javax.net.ssl.keyStorePassword","123456");
        SpringApplication.run(ServerSide.class);
    }
}
