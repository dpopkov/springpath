package learn.springpath.conference.repository;

import learn.springpath.conference.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();
        speakers.add(new Speaker("Jane", "Doe"));
        return speakers;
    }
}
