package org.example.HTTPServerSun;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class ContactUs implements HttpHandler {

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

        response.append(".image {");
        response.append("margin-top: 15%;");
        response.append("height: 40%;");
        response.append("width: 100%;");
        response.append("display: flex;");
        response.append("align-items: center;");
        response.append("justify-content: center;");
        response.append("}");

        response.append(".button-container {");
        response.append("display: flex;");
        response.append("flex-wrap: flex;");
        response.append("align-items: center;");
        response.append("width: 80%;");
        response.append("margin: 0 auto;");
        response.append("}");

        response.append(".my-button {");
        response.append("  background-color: #333;");
        response.append("  border: none;");
        response.append("  color: white;");
        response.append("  padding: 15px 10px;");
        response.append("  text-align: center;");
        response.append("  text-decoration: none;");
        response.append("  display: inline-block;");
        response.append("  font-size: 16px;");
        response.append("margin-top: 30px;");
        response.append("  margin-right: -15px;");
        response.append("  margin-left: 10rem;");
        response.append("  width: fit-content;");
        response.append("}");


        response.append("p {");
        response.append("display: flex;");
        response.append("flex-direction: row;");
        response.append("align-items: space-around;");
        response.append("}");


        response.append("</style>");
        response.append("</head>");

        response.append("<ul>");
        response.append("<li><a href=\"/homepage\">Home</a></li>");
        response.append("<li><a href=\"/aboutus\">About Us</a></li>");
        response.append("<li><a href=\"/contactus\">Contact Us</a></li>");
        response.append("<li><a href=\"/services\">Services</a></li>");
        response.append("</ul>");

        response.append("<div class=\"image\">");
        response.append("<img src=\"https://uploads-ssl.webflow.com/5ef0df6b9272f7410180a013/5ef204bb10b93fdbe5e601bb_contact-2860030_1920-1024x683.jpg\">");
        response.append("</div>");
        response.append("<p>");
        response.append("<div class=\"button-container\">");
        response.append("<button type=\"button\" class=\"my-button\">EMAIL</button>\n");
        response.append("<button type=\"button\" class=\"my-button\">PHONE NUMBER</button>\n");
        response.append("<button type=\"button\" class=\"my-button\">INSTAGRAM</button>\n");
        response.append("<button type=\"button\" class=\"my-button\">FACEBOOK</button>\n");
        response.append("</div>");
        response.append("</p>");

        response.append("</body>");
        response.append("<html>");
        String stringMessage = response.toString();

        exchange.sendResponseHeaders(200, stringMessage.length());
        outputStream.write(stringMessage.getBytes());
        outputStream.flush();
        outputStream.close();
    }
}
