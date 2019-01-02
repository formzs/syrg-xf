package com.boottemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.net.InetAddress;



@SpringBootApplication
public class XfApplication {
	private static final Logger logger = LoggerFactory.getLogger(XfApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(XfApplication.class, args);

		SpringApplication app = new SpringApplication(XfApplication.class);
		String protocol = "http";
		logger.info("\n----------------------------------------------------------\n\t" +
						"Application '{}' is running! Access URLs:\n\t" +
						"Local: \t\t{}://localhost:{}\n\t" +
						"External: \t{}://{}:{}\n\t" +
						"Profile(s): \t{}\n----------------------------------------------------------",
				"syrg-xf",
				protocol,
				9999,
				protocol,
				InetAddress.getLocalHost().getHostAddress(),
				9999,
				"local");




	}

}

