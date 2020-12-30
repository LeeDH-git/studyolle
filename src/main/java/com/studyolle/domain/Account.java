package com.studyolle.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
// @EqualsAndHashCode(of="id") id만 사용하는 이유는?
// 연관관계가 복잡해질 때 @EqualsAndHashCode 에서 서로 다른 연관관계를 순환참조 하느라 무한루프가 발생하고,
// 결국에는 stackoverflow 가 발생할 수 있다. 그래서 id 를 주로 사용한다.
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    // Account에 필요한 데이터
    // 로그인, 프로필, 알림설정
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String nickname;

    private String password;

    private String emailVerified;

    private String emailCheckToken;

    private LocalDateTime joinedAt;

}
