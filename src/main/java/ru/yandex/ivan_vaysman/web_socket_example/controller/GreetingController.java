package ru.yandex.ivan_vaysman.web_socket_example.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import ru.yandex.ivan_vaysman.web_socket_example.model.sockets.Greeting;
import ru.yandex.ivan_vaysman.web_socket_example.model.sockets.HelloMessage;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greet(HelloMessage message) throws InterruptedException {
        Thread.sleep(2000);
        return new Greeting("Hello " + HtmlUtils.htmlEscape(message.getName()));
    }
}
