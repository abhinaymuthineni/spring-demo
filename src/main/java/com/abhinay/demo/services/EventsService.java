package com.abhinay.demo.services;

import com.abhinay.demo.entity.Events;

import java.util.List;

public interface EventsService {

    List<Events> listEvents();
    Events getEventById(int id);
    Events saveEvent(Events event);
    void deleteEvent(int id);
}
