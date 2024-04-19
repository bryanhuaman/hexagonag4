package com.codigo.msregistro.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.codigo.*") //Cuando se trabaja con modulos se utiliza, para que reconozca todos lo modulos
@EnableJpaRepositories("com.codigo") //Tiene que buscar los repositorios jpa en los modulos
@EntityScan("com.codigo.*") //Tiene que buscar las entidades en los modulosz
public class ApplicationLauncher {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationLauncher.class,args);
    }

}
