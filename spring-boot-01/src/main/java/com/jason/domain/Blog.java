package com.jason.domain;

import org.omg.PortableServer.ServantActivator;
import org.springframework.core.serializer.Serializer;

import java.io.Serializable;

/**
 * <b><code>Blog</code></b>
 * <p>
 * class_comment
 * <p>
 * <b>Creation Time:</b> 2018/1/8 17:55.
 *
 * @author yangjiangshui
 * @version ${Revision} 2018/1/8
 * @since spring-boot project_version
 */
public class Blog implements Serializable{
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
