package com.temelt.issuemanagament;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import java.net.URISyntaxException;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
public class IssueManagamentApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssueManagamentApplication.class, args);
	}

	//ModelMapper'ı kullanabilmemiz için onun instance'ını oluşturmamız gerekiyor. Herkes aynı instance üzerinde çalışsın.
	//IssueServiceImpl Classımıza inject etmeiz gerekiyor.


	@Bean
	public ModelMapper getModelMapper() {
	return new ModelMapper();
	}
}
