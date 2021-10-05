package org.example.config.auth.dto;

import lombok.Getter;
import org.example.web.domain.user.User;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;
    // 인증된 사용자 정보만 필요하다.
    public SessionUser(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
