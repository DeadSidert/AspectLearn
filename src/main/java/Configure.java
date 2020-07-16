import com.nik.up.AOP.Logging;
import com.nik.up.Dao.TypicalUser;
import com.nik.up.Dao.User;
import com.nik.up.Service.Work;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Configure {

    @Bean("TypicalUser")
    public User getUser(){
        return new TypicalUser();
    }
    @Bean
    public Work getWork(@Qualifier("TypicalUser") User user){
        return new Work(user);
    }

    @Bean
    public Logging getLogging(){
        return new Logging();
    }
}
