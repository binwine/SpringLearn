package org.example;

import org.example.service.MailService;
import org.example.service.User;
import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ){

//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        UserService userService = context.getBean(UserService.class);
        UserService userService = new UserService();
        MailService mailService = new MailService();
        userService.setMailService(mailService);
        User user = userService.login("bob@example.com", "password");
        System.out.println(user.getName());
    }
}
