package com.meeting_site_project.YM.service;

import com.meeting_site_project.YM.repository.MybatisRepository;
import com.meeting_site_project.YM.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    MybatisRepository mybatisRepository;
    @Autowired
    public AuthService(MybatisRepository mybatisRepository) {
        this.mybatisRepository = mybatisRepository;
    }

    public Member selectById(String userId, String userPassword) {
       return mybatisRepository.selectById(userId);
    }
}
