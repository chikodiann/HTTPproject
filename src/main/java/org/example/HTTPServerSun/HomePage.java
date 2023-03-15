package org.example.HTTPServerSun;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HomePage implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        OutputStream outputStream = exchange.getResponseBody();

        StringBuilder response = new StringBuilder();
        response.append("<html>");
        response.append("<head>");
        response.append("<style>");

        response.append("body {");
        response.append("  background-image: url(\"https://techpoint.africa/wp-content/uploads/2021/05/Leadspace-New-25.jpg\");");
        response.append("  background-size: cover;");
        response.append("}");

        response.append("ul {");
        response.append("  list-style-type: none;");
        response.append("  margin: 0;");
        response.append("  padding: 0;");
        response.append("  overflow: hidden;");
        response.append("  background-color: #333;");
        response.append("}");

        response.append("h1, p {");
        response.append("background: white;");
        response.append("}");

        response.append("ul {");
        response.append("    list-style-type: none;");
        response.append("    margin: 0;");
        response.append("    padding: 0;");
        response.append("    overflow: hidden;");
        response.append("    background-color: #333;");
        response.append("}");

        response.append("li {");
        response.append("    float: left;");
        response.append("}");

        response.append("li a {");
        response.append("    display: inline-block;");
        response.append("    color: white;");
        response.append("    text-align: center;");
        response.append("    padding: 14px 16px;");
        response.append("    text-decoration: none;");
        response.append("}");

        response.append("li a:hover {");
        response.append("    background-color: #111;");
        response.append("}");

        response.append("</style>");
        response.append("</head>");
        response.append("<body>");
        response.append("<h1><b>WELCOME TO ANN N' TECH</b></h1>");
        response.append("<p>Become a world class Software Engineer and attract high paying jobs in just 14 days</p>");

        response.append("<ul>");
        response.append("<li><a href=\"/homepage\">Home</a></li>");
        response.append("<li><a href=\"/aboutus\">About Us</a></li>");
        response.append("<li><a href=\"/contactus\">Contact Us</a></li>");
        response.append("<li><a href=\"/services\">Services</a></li>");
        response.append("</ul>");
        response.append("</body>");
        response.append("<html>");
        String stringMessage = response.toString();

        exchange.sendResponseHeaders(200, stringMessage.length());
        outputStream = exchange.getResponseBody();
        outputStream.write(stringMessage.getBytes());
        outputStream.flush();
        outputStream.close();
    }
}