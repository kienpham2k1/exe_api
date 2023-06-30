//package com.example.exe.security;
//
//import com.example.exe.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
///**
// * @author Samson Effes
// */
//
//@Component
//public class LibraryUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return userRepository.findByName(username)
//                .map(LibraryUserDetails::new)
//                .orElseThrow(() -> new UsernameNotFoundException("No user found"));
//    }
//}