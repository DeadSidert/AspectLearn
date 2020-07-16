import com.nik.up.Service.Work;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext ap = new AnnotationConfigApplicationContext(Configure.class);
        Work work = ap.getBean(Work.class);
        work.userInfo();
    }
}
