package bu.clinix;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import bu.clinix.service.GenerateIdPatient;


@SpringBootApplication
public class ClinixApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(ClinixApplication.class, args);
		
		File file = new File("E:"+File.separator+"download" + File.separator + "images" + File.separator);
		  
		if (!(file.exists()))
		{
			file.mkdir(); 
		}
		
	} 

	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}

}
