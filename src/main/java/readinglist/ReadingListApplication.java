package readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication	//컴포넌트 검색과 자동 구성 활성화

public class ReadingListApplication {

	public static void main(String[] args) {
		//어플리케이션 부트스트랩
		SpringApplication.run(ReadingListApplication.class, args);
	}

}
