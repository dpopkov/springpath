package learn.springpath.conference.repository;

import learn.springpath.conference.model.Speaker;

import java.util.List;

public interface SpeakerRepository {

    List<Speaker> findAll();
}
