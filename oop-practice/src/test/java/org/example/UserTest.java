package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class UserTest {

    @DisplayName("올바른 패스워드 초기화 여부를 판단한다.")
    @Test
    void passwordTest() {

        //given
        User user = new User();

        //when
        user.initPassword(new CorrectlyFixedPasswordGenerator());

        //then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("잘못된 패스워드 초기화 여부를 확인한다.")
    @Test
    void CorrectPasswordTest(){
        User user = new User();
        user.initPassword(new WrongPasswordGenerator());

        assertThat(user.getPassword()).isNull();
    }
}