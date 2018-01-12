package com.jason.web;

import com.jason.domain.Blog;
import com.jason.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <b><code>BlogController</code></b>
 * <p>
 * class_comment
 * <p>
 * <b>Creation Time:</b> 2018/1/10 18:57.
 *
 * @author yangjiangshui
 * @version ${Revision} 2018/1/10
 * @since spring-boot project_version
 */
@Controller
@RequestMapping("/api/blog")
public class BlogController {
    @Autowired
    private BlogMapper blogMapper;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Blog getBlog(@PathVariable(value = "id", required = true) String id) {
        Blog blog = blogMapper.selectBlog(id);
        return blog;
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String addBlog(@RequestBody Blog blog) {
        Integer result = blogMapper.insertBlog(blog);
        return result.toString();
    }
}
