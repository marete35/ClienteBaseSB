package ar.com.marete.clientebasesb.filters;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Component
@Order(1)
public class MDCFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        Cookie[] cookies = httpServletRequest.getCookies();
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        //log.info("Logging Request  {} : {}", req.getMethod(),req.getRequestURI());
        if(cookies!=null) {
            //MDC.put("sessionId",this.getCookieValue(cookies, "JSESSIONID"));
            MDC.put("sessionId","#1");
            MDC.put("nombre", "mario");
        }else {
            MDC.put("sessionId","-1");
            MDC.put("nombre", "no user");
        }
        chain.doFilter(request, response);
        //log.info("Logging Response :{}",res.getContentType());
    }

    /*
     * Dado las cookies y el nombre de una ella retorna su valor.
     */
    private String getCookieValue(Cookie[] cookies, String nameCookie) {
        String valueCookie = "";
        for(Cookie cookie:cookies) {
            if(nameCookie.equals(cookie.getName())) {
                valueCookie =  cookie.getValue();
            }
        }
        return valueCookie;
    }
}
