import com.hh.domain.Beans;
import com.hh.domain.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created by IntelliJ IDEA.
 *
 * @author lijing
 * @date 2019/5/14 9:44
 **/
public class AnnotationApplicationContextTest {
    @Test
    public void getBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Beans.class);
        Car car = context.getBean("car", Car.class);
        System.out.println(car);
    }
}
