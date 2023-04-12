package hello.servelt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan //서블릿들을 자동으로 등록을 해주는 Annotation
@SpringBootApplication
public class ServeltApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServeltApplication.class, args);
	}

}
