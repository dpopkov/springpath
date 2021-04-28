package learn.springpath.conference;

import learn.springpath.conference.service.SpeakerService;
import learn.springpath.conference.service.SpeakerServiceImpl;

public class Application {

    public static void main(String[] args) {
        SpeakerService service = new SpeakerServiceImpl();
        System.out.println(service.findAll());
    }
}
