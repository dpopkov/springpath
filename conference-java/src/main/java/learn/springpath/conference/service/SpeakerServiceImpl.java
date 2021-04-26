package learn.springpath.conference.service;

import learn.springpath.conference.model.Speaker;
import learn.springpath.conference.repository.HibernateSpeakerRepositoryImpl;
import learn.springpath.conference.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private final SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
