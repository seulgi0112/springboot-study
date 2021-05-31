package readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@SpringBootApplication	//컴포넌트 검색과 자동 구성 활성화

public class ReadingListApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		//어플리케이션 부트스트랩
		SpringApplication.run(ReadingListApplication.class, args);
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry){
		//login 경로를 login 템플릿으로 매핑
		registry.addViewController("/login").setViewName("login");
	}
	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers){
		//Reader 타입의 객체가 컨트롤러 매개변수로 있을 때 처리할 리졸버 설정
		argumentResolvers.add(new ReaderHandlerMethodArgumentResolver());
	}


}
