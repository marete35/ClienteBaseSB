package ar.com.marete.clientebasesb.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties("server")
public class EnvProperties {

    private String port;
    private String urlBase;
    private String env;
    private String urlApi;

}
