package learn.springpath.conference.repository;

import learn.springpath.conference.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar calendar;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();
        speakers.add(new Speaker("Jane", "Doe"));
        System.out.println("cal: " + calendar.getTime());
        return speakers;
    }
}
