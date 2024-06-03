package dev.sandeep.JpaDemo;

import dev.sandeep.JpaDemo.service.BrandService;
import dev.sandeep.JpaDemo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	@Autowired
	private BrandService brandService;

	@Autowired
	private TeamService teamService;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//brandService.getBrand();
		teamService.getTeam();
	}
}
