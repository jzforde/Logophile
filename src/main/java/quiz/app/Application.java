package quiz.app;

import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * Starter for my quiz app
 */
@SpringBootApplication
public class Application {
    //Declaring the servlet wrapper for the H2 database console and mapping it to the path of /console.

    @Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}
