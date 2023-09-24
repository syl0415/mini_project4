package com.aegis.image_shop.common.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class CustomAccessDeniedHandler implements AccessDeniedHandler {

    public void handle(HttpServletRequest request, HttpServletResponse response,
                       AccessDeniedException accessException) throws IOException,
            ServletException{
        log.info("Access Denied Handler");

        log.info("Redirect...");

        response.sendRedirect("/error/accessError");
    }
}
