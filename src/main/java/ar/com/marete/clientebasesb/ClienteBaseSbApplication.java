package ar.com.marete.clientebasesb;

import ar.com.marete.clientebasesb.config.EnvProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClienteBaseSbApplication implements CommandLineRunner {

	@Autowired
	private EnvProperties envProperties;

	public static void main(String[] args) {
		SpringApplication.run(ClienteBaseSbApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println(envProperties);
	}


}
