package org.example.HTTPServerSun;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class Services implements HttpHandler {


    @Override
    public void handle(HttpExchange exchange) throws IOException {
        OutputStream outputStream = exchange.getResponseBody();

        StringBuilder response =new StringBuilder();
        response.append("<html>");

        response.append("<head>");
        response.append("<style>");

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

        response.append(".my-list { ");
        response.append("list-style-type: none;");
        response.append("margin: 0;");
        response.append("padding: 0;");
        response.append("background-color: #f1f1f1;");
        response.append("}");

        response.append(".my-list li {");
        response.append("display: block;");
        response.append("margin: 0;");
        response.append("padding: 25px;");
        response.append("border-bottom: 1px solid #ccc;");
        response.append("}");

        response.append(".image {");
        response.append("height: 60%;");
        response.append("width: 100%;");
        response.append("display: flex;");
        response.append("align-items: center;");
        response.append("justify-content: center;");
        response.append("}");

        response.append(".my-list li:last-child {");
        response.append("border-bottom: none;");
        response.append("}");

        response.append("p {");
        response.append(" font-size: 20px;");
        response.append(" font-weight: bold;");
        response.append(" font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;");
        response.append(" color: black;");
        response.append("}");


        response.append("</style>");
        response.append("</head>");

        response.append("<b>");
        response.append("<ul>");
        response.append("<li><a href=\"/homepage\">Home</a></li>");
        response.append("<li><a href=\"/aboutus\">About Us</a></li>");
        response.append("<li><a href=\"/contactus\">Contact Us</a></li>");
        response.append("<li><a href=\"/services\">Services</a></li>");
        response.append("</ul>");
        response.append("<h1>");
        response.append("Our Services Include");
        response.append("</h1>");
        response.append("<div class=\"image\">");
        response.append("<img src=\"https://media.istockphoto.com/id/1408255024/photo/developers-discussing-programming-code.jpg?b=1&s=170667a&w=0&k=20&c=PubfAY8Hoh8l3D5SUPnA7yZl99Lwv5Dq3ktvyuHqso8=\">");
        response.append("</div>");
        response.append("<p>");
        response.append("We train tech talents that become big shots on the following:");
        response.append("</p>");
        response.append("<ul class=\"my-list\">");
        response.append("<li>");
        response.append("Java");
        response.append("</li>");
        response.append("<li>");
        response.append("Python");
        response.append("</li>");
        response.append("<li>");
        response.append(".Net");
        response.append("</li>");
        response.append("<li>");
        response.append("Golang");
        response.append("</li>");
        response.append("<li>");
        response.append("NodeJs");
        response.append("</li>");
        response.append("<li>");
        response.append("Blockchain Development");
        response.append("</li>");
        response.append("<li>");
        response.append("Web3");
        response.append("</li>");

        response.append("</ul>");
        response.append("</p>");
        response.append("</b>");
        response.append("</body>");
        response.append("<html>");
        String stringMessage = response.toString();

        exchange.sendResponseHeaders(200, stringMessage.length());
        outputStream.write(stringMessage.getBytes());
        outputStream.flush();
        outputStream.close();
    }
}
