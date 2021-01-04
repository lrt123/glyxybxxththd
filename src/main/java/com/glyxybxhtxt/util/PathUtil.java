package com.glyxybxhtxt.util;

import org.springframework.stereotype.Component;

import java.io.File;

/**
 * @Author lrt
 * @Date 2020/12/11 17:08
 * @Version 1.0
 **/
@Component
public class PathUtil {

    public static String getUploadPath() {
//        File path;
//        path = this.getClass().getResource("/").getPath();
//        path = new File(ClassLoader.getSystemResource("").getPath());
        //            path = new File(ResourceUtils.getURL("classpath:").getPath());
//        if (!path.exists()) path = new File("");
        String path = "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\bx\\WEB-INF\\classes";
        File upload = new File(path, "static/bxdimg/");
        if (!upload.exists()) upload.mkdirs();
        return upload.getAbsolutePath();
//        return this.getClass().getResource("/").getPath().substring(1);
    }

}
