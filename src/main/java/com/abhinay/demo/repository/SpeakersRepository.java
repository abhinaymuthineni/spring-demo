package com.abhinay.demo.repository;


import com.abhinay.demo.entity.Speakers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakersRepository extends JpaRepository<Speakers, Integer> { }
