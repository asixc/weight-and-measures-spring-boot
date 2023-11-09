package dev.jotxee.weightandmeasures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeightAndMeasuresApplication {
/*
	@Autowired
	private Environment environment;

	@Value("${spring.datasource.url}")
	private String databaseUrl;

	@Value("${spring.datasource.username}")
	private String databaseUsername;

	@Value("${spring.datasource.password}")
	private String databasePassword;

*/
	public static void main(String[] args) {
		SpringApplication.run(WeightAndMeasuresApplication.class, args);
	}
/*
	@PostConstruct
	public void printProperties() {
		String[] activeProfiles = environment.getActiveProfiles();
		System.out.println("Propiedades de la aplicación:");
		System.out.println("Active Profiles: " + Arrays.toString(activeProfiles));
		System.out.println("Server Port: " + environment.getProperty("server.port"));
		System.out.println("Datasource: " + databaseUrl);
		System.out.println("Username: " + databaseUsername);
		System.out.println("Password: " + databasePassword);
	}

	@Bean
	public CommandLineRunner printDataSourceProperties() {
		return (args) -> {
			System.out.println("URL de la base de datos: " + databaseUrl);
			System.out.println("Usuario de la base de datos: " + databaseUsername);
			System.out.println("Contraseña de la base de datos: " + databasePassword);
		};
	}

 */
}
