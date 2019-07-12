package com.shandesh.repository;

import com.shandesh.dao.AppUserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface AppUserRepository extends JpaRepository<AppUserDTO, Integer> {

    List<AppUserDTO> findByUserName(String userName);
    List<AppUserDTO> findByUserId(Integer userId);
    List<AppUserDTO> findAll();

    @Modifying
    Long deleteByUserName(String userName);

    @Modifying
    Long deleteByUserid(Integer userId);

}
