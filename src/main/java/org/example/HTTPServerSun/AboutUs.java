package org.example.HTTPServerSun;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class AboutUs implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        OutputStream outputStream = exchange.getResponseBody();
        StringBuilder response = new StringBuilder();

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

        response.append("p {");
        response.append(" font-size: 24px;");
        response.append(" font-weight: bold;");
        response.append(" font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;");
        response.append(" color: #333;");
        response.append(" text-align: center;");
        response.append(" margin-top: 80px;");
        response.append(" line-height: 1.5;");
        response.append(" text-shadow: 2px 2px 5px rgba(0,0,0,0.5);");
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

        response.append("<div class=\"image\">");
        response.append("<img src=\"https://media.istockphoto.com/id/1402604850/photo/the-word-about-us-on-wooden-cubes-business-communication-and-information.jpg?s=612x612&w=0&k=20&c=Oc2HZUPVJRXFsjTwKVgWY_ddWrKeQUG0KCyKUGef-ig=\">");
        response.append("</div>");
        response.append("</h1>");
        response.append("<p>");
        response.append("At Ann N' Tech, we ensure the success of our students by delivering an intensive 14day program on fullstack software development. We pride ourselves in producing world-class devs in the shortest time, who can compete with other devs in the international space.");
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
