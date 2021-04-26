package learn.springpath.conference.service;

import learn.springpath.conference.model.Speaker;

import java.util.List;

public interface SpeakerService {

    List<Speaker> findAll();
}
