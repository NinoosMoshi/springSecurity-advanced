package com.ninos.service;

import com.ninos.dao.SubscriberRepo;
import com.ninos.model.Subscriber;
import com.ninos.model.SubscriberSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {


    private SubscriberRepo subscriberRepo;

    @Autowired
    public CustomUserDetailsService(SubscriberRepo subscriberRepo) {
        this.subscriberRepo = subscriberRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        List<Subscriber> subscribers = subscriberRepo.findByEmail(email);
        if (subscribers.isEmpty()){
            throw new UsernameNotFoundException("Email is not Exists");
        }

        return new SubscriberSecurity(subscribers.get(0));
    }

}
