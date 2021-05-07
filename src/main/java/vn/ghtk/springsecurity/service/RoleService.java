package vn.ghtk.springsecurity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.ghtk.springsecurity.repository.RoleRepository;


@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;
}
