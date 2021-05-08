package vn.ghtk.springsecurity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vn.ghtk.springsecurity.model.User;
import vn.ghtk.springsecurity.model.CustomUserDetails;
import vn.ghtk.springsecurity.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(s);
        if (user == null) throw new UsernameNotFoundException(String.format("User %s is not found!", s));
        return new CustomUserDetails(user);
    }

    public List<User> getUserList() {
        return userRepository.findAll();
    }

}
