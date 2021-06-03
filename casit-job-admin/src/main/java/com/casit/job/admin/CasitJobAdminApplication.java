package com.casit.job.admin;

import com.iplatform.commons.config.WebMvcConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.FilterType;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableDiscoveryClient
@EnableFeignClients
@EnableSwagger2
@SpringBootApplication()
//@ComponentScans(value = {@ComponentScan(basePackages = {"com.iplatform.commons", "com.casit.job.admin"})})
@ComponentScans(value = {@ComponentScan(basePackages = {"com.iplatform.commons", "com.casit.job.admin"},
		excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = WebMvcConfig.class)})})
public class CasitJobAdminApplication {

	public static void main(String[] args) {
        SpringApplication.run(CasitJobAdminApplication.class, args);
	}

}