package learn.springpath.conference;

import learn.springpath.conference.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
@ComponentScan({"learn.springpath.conference"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory() {
        System.out.println("public CalendarFactory calFactory()");
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(3);
        return factory;
    }

    @Bean
    public Calendar cal() {
        System.out.println("public Calendar cal()");
        return calFactory().getObject();
    }

    /*
    @Bean(name = "speakerService")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        return new SpeakerServiceImpl();
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
    */
}
