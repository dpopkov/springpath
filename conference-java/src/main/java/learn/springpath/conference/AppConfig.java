package learn.springpath.conference;

import learn.springpath.conference.repository.HibernateSpeakerRepositoryImpl;
import learn.springpath.conference.repository.SpeakerRepository;
import learn.springpath.conference.service.SpeakerService;
import learn.springpath.conference.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setSpeakerRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}