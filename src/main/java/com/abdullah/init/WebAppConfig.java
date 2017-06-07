package com.abdullah.init;

import com.abdullah.CustomerListDataBase.CustomerDAO;
import com.abdullah.CustomerListDataBase.jdbcCustomerDAO;
import com.abdullah.DataBase.JdbcUserDAO;
import com.abdullah.DataBase.UserDAO;
import com.abdullah.EmployeeDatabase.EmployeeDAO;
import com.abdullah.EmployeeDatabase.JdbcEmployeeDAO;
import com.abdullah.ProjectDatabase.ProjectsDAO;
import com.abdullah.ProjectDatabase.jdbcProjectsDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.abdullah")
@EnableWebMvc
public class WebAppConfig extends WebMvcConfigurerAdapter {


	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/HMERP");
		dataSource.setUsername("root");
		dataSource.setPassword("rifat20081995");
		/*
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://185.116.214.8:2082/thehub_wp398");
		dataSource.setUsername("thehub");
		dataSource.setPassword("DQnR3!}Ehem6");
		*/
		return dataSource;
	}

	@Bean
	public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/Pages/jsp/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/Design/");
	}

	@Bean
	public UserDAO getContactDAO() {
		return new JdbcUserDAO(dataSource());
	}
	@Bean
	public EmployeeDAO getEmployeeDAO() {
		return new JdbcEmployeeDAO(dataSource());
	}
	@Bean
	public ProjectsDAO getProjectsDAO() {
		return new jdbcProjectsDAO(dataSource());
	}
	@Bean
	public CustomerDAO getCustomerDAO() {
		return new jdbcCustomerDAO(dataSource());
	}


}
