package io.bootify.demo1.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("io.bootify.demo1.domain")
@EnableJpaRepositories("io.bootify.demo1.repos")
@EnableTransactionManagement
public class DomainConfig {
}
