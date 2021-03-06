package com.abdullah.init;

import com.abdullah.CustomerListDataBase.CustomerDAO;
import com.abdullah.CustomerListDataBase.jdbcCustomerDAO;
import com.abdullah.EmployeeDatabase.EmployeeDAO;
import com.abdullah.EmployeeDatabase.JdbcEmployeeDAO;
import com.abdullah.InventoryDataBase.InventoryDAO;
import com.abdullah.InventoryDataBase.JdbcInventoryDAO;
import com.abdullah.LoginDataBase.JdbcUserDAO;
import com.abdullah.LoginDataBase.UserDAO;
import com.abdullah.ProductDatabase.ProductsDAO;
import com.abdullah.ProductDatabase.jdbcProductsDAO;
import com.abdullah.ProjectDatabase.ProjectsDAO;
import com.abdullah.ProjectDatabase.jdbcProjectsDAO;
import com.abdullah.PurchaseDatabase.PurchaseDAO;
import com.abdullah.PurchaseDatabase.jdbcPurchaseDAO;
import com.abdullah.SalesDatabase.SalesDAO;
import com.abdullah.SalesDatabase.jdbcSalesDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;
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
	public ViewResolver PdfViewResolver()
	{
		ResourceBundleViewResolver resourceBundleViewResolver=new ResourceBundleViewResolver();
		resourceBundleViewResolver.setOrder(1);
		resourceBundleViewResolver.setBasename("views");
		return resourceBundleViewResolver;
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
		registry.addResourceHandler("/favicon.ico").addResourceLocations("/favicon.ico");
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
	@Bean
	public ProductsDAO getProductsDAO() {
		return new jdbcProductsDAO(dataSource());
	}
	@Bean
	public PurchaseDAO getPurchaseDAO() {
		return new jdbcPurchaseDAO(dataSource());
	}
	@Bean
	public SalesDAO getSalesDAO() {
		return new jdbcSalesDAO(dataSource());
	}
	@Bean
	public InventoryDAO getInventoryDAO() {
		return new JdbcInventoryDAO(dataSource());
	}


}
