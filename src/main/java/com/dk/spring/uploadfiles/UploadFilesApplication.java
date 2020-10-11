package com.dk.spring.uploadfiles;

import com.dk.spring.uploadfiles.property.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class UploadFilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadFilesApplication.class, args);
	}

}
