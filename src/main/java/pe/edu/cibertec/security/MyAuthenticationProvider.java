package pe.edu.cibertec.security;

import java.util.ArrayList;
import java.util.List;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

@Component("myAuthenticationProvider")
public class MyAuthenticationProvider implements AuthenticationProvider {

    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String name = authentication.getName();
        String password = authentication.getCredentials().toString();
        if (name.equals("usuario") && password.equals("password123")) {
            List<GrantedAuthority> grantedAuths = new ArrayList();
            grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
            grantedAuths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            Authentication auth = new UsernamePasswordAuthenticationToken(name, password, grantedAuths);
            return auth;
        } else {
            return null;
        }
    }

    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
