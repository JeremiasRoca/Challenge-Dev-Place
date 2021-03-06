package com.apiUsers.apiUsers.configuration;

import com.sun.net.httpserver.HttpsServer;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@Component
public class AEntryPoint extends BasicAuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authEx) throws IOException {
       response.addHeader("WWW-Authenticate","Basic.realm="+ getRealmName());
       response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);


    }

    @Override
    public void afterPropertiesSet() {
        setRealmName("POCfwhibbit");
        super.afterPropertiesSet();
    }
}
