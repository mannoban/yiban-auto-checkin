package ink.verge.yiban_auto_checkin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("ink.verge.yiban_auto_checkin.mbg.mapper")
public class YibanAutoCheckinApplication {

    public static void main(String[] args) {
        SpringApplication.run(YibanAutoCheckinApplication.class, args);
    }

}
