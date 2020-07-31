package com.heu.chsphm;

import com.heu.chsphm.common.Constant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChsPhmApplication {

    public static void main(String[] args) {
        /**  配置加解密跟秘钥，与配置文件的密文分开放  */
        System.setProperty("jasypt.encryptor.password", Constant.JASYPT_ENCRYPTOR_PASSWORD);

        SpringApplication.run(ChsPhmApplication.class, args);
    }

}
