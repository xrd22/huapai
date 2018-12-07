package com.huapai.scan.secuirty;


import com.huapai.scan.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CustomUserDetailsService  implements UserDetailsService {

   @Autowired
   private LoginService loginService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        com.huapai.mybatis.entry.User user  = loginService.gitUser();
        if(StringUtils.isEmpty(user) && StringUtils.isEmpty(user.getUsername())) {
            throw new UsernameNotFoundException("账号不存在");
        }
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        User userDetails  = new User(user.getUsername(),user.getUsername(),list );
        return userDetails;
    }



}
