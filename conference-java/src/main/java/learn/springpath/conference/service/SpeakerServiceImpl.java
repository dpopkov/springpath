package learn.springpath.conference.service;

import learn.springpath.conference.model.Speaker;
import learn.springpath.conference.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
        System.out.println("SpeakerServiceImpl Repository constructor");
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
        System.out.println("SpeakerServiceImpl setter");
    }

    @PostConstruct
    private void initialize() {
        System.out.println("initialize() method called after the constructors ");
    }

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
