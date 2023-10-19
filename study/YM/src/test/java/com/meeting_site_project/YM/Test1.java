package com.meeting_site_project.YM;

import com.meeting_site_project.YM.mapper.MemberMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test1 {
    @Autowired
    private MemberMapper memberMapper;
    @Test
    public void getCnt(){

        int cnt = memberMapper.getCnt();

        Assertions.assertThat(cnt).isEqualTo(1);
    }


    //XML 방식
    @Test
    public void getCnt2(){
        int cnt = memberMapper.getCnt2();

        Assertions.assertThat(cnt).isEqualTo(1);
    }
}
