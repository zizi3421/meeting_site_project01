package com.meeting_site_project.YM.service;

import com.meeting_site_project.YM.repository.MybatisRepository;
import com.meeting_site_project.YM.vo.JoinMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    MybatisRepository mybatisRepository;
    @Autowired
    public JoinService(MybatisRepository mybatisRepository) {
        this.mybatisRepository = mybatisRepository;
    }

    public void insertMember(JoinMember joinMember){
        mybatisRepository.insertMember(joinMember);
    }
}
