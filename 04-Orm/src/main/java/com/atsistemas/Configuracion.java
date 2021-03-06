package com.atsistemas;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.atsistemas.persistencia")
@EnableTransactionManagement
public class Configuracion {

	@Bean
	public SessionFactory sessionFactory(DataSource datasource){
		LocalSessionFactoryBuilder sessionFactoryBuilder = new LocalSessionFactoryBuilder(datasource);
		
		sessionFactoryBuilder.scanPackages("com.atsistemas.entidades");
		sessionFactoryBuilder.setProperty("hibernate.show_sql", "true");
		sessionFactoryBuilder.setProperty("hibernate.format_sql", "true");
		sessionFactoryBuilder.setProperty("hibernate.hbm2ddl.auto", "create");
		
		
		return sessionFactoryBuilder.buildSessionFactory();
	}
	
	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		return new HibernateTransactionManager(sessionFactory);
	}
	
	@Bean
	public DataSource datasource(){
		BasicDataSource ds = new BasicDataSource();
		
		ds.setUrl("jdbc:derby://localhost:1527/Clientes;create=true");
		ds.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
		ds.setUsername("user");
		ds.setPassword("user");
		ds.setDefaultCatalog("User");
		
		return ds;
	}
	
}
