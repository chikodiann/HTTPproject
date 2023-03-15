package org.example;

import com.sun.net.httpserver.HttpServer;
import org.example.HTTPServerSun.AboutUs;
import org.example.HTTPServerSun.ContactUs;
import org.example.HTTPServerSun.HomePage;
import org.example.HTTPServerSun.Services;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress("localhost", 8080), 0);
        httpServer.createContext("/", new HomePage());
        httpServer.createContext("/aboutus", new AboutUs());
        httpServer.createContext("/contactus", new ContactUs());
        httpServer.createContext("/services",new Services());
        httpServer.start();



    }
}