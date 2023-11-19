package com.oppProject.GrammoFol.Service;

import com.oppProject.GrammoFol.Model.User;
import com.oppProject.GrammoFol.Model.CustomUserDetail;
import com.oppProject.GrammoFol.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEmail(email);
        user.orElseThrow(()-> new UsernameNotFoundException("User not found"));
        return user.map(CustomUserDetail::new).get();
    }
}
