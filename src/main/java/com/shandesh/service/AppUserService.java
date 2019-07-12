package com.shandesh.service;

import com.shandesh.dao.AppUserDTO;
import com.shandesh.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    public List<AppUserDTO> getAllAppUsers() {
        return appUserRepository.findAll();
    }
}
