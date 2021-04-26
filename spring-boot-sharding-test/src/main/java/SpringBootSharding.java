import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Mathartsys
 */
@SpringBootApplication
@MapperScan("mapper")
@ComponentScan("/")
public class SpringBootSharding {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootSharding.class, args);
    }
}
