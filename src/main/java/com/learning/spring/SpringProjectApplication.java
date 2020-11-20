package com.learning.spring;

import com.learning.resource.HelloServletListener;
import com.learning.resource.HelloStateServlet;
import com.learning.resource.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServlet;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = HelloWorldController.class)

public class SpringProjectApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringProjectApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean<HelloStateServlet> stateServlet() {
		ServletRegistrationBean<HelloStateServlet> servRegBean = new ServletRegistrationBean<>();
		servRegBean.setServlet(new HelloStateServlet());
		servRegBean.addUrlMappings("/app/state/*");
		servRegBean.setLoadOnStartup(1);
		return servRegBean;
	}


	@Bean
	public ServletListenerRegistrationBean<ServletContextListener> listener() {
		ServletListenerRegistrationBean<ServletContextListener> bean =
				new ServletListenerRegistrationBean<>();
		bean.setListener(new HelloServletListener());
		return bean;
	}

}
