package com.ninos.dao;

import com.ninos.model.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriberRepo extends JpaRepository<Subscriber, Long> {

     List<Subscriber> findByEmail(String email);

}
