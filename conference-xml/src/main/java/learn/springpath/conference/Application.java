package learn.springpath.conference;

import learn.springpath.conference.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpeakerService service = context.getBean("speakerService", SpeakerService.class);
        System.out.println(service.findAll());
    }
}
