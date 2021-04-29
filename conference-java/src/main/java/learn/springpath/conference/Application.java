package learn.springpath.conference;

import learn.springpath.conference.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        /*
        System.out.println(service);
        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service2);
        System.out.println("service == service2 : " + (service == service2));
        */
        System.out.println(service.findAll());
    }
}
