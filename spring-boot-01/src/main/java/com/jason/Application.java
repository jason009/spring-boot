
package com.jason;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * <b><code>Application</code></b>
 * <p>
 * class_comment
 * <p>
 * <b>Creation Time:</b> 2017/12/12 1:50.
 *
 * @author yangjiangshui
 * @version ${Revision} 2017/12/12
 * @since sprint-boot project_version
 */
@SpringBootApplication
@MapperScan(basePackages = "com.jason.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

