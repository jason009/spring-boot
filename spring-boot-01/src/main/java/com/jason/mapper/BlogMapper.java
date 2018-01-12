package com.jason.mapper;

import com.jason.domain.Blog;
import org.springframework.stereotype.Service;

/**
 * <b><code>BlogMapper</code></b>
 * <p>
 * class_comment
 * <p>
 * <b>Creation Time:</b> 2018/1/10 18:54.
 *
 * @author yangjiangshui
 * @version ${Revision} 2018/1/10
 * @since spring-boot project_version
 */

public interface BlogMapper {
    Blog selectBlog(String id);
    Integer insertBlog(Blog blog);
}
