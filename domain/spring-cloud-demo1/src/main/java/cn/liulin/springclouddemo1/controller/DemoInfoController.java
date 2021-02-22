package cn.liulin.springclouddemo1.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * cn.liulin.springclouddemo1.controller$
 *
 * @author ll
 * @date 2021-02-22 13:36:17
 **/
@RestController
public class DemoInfoController {

    @RequestMapping("/getDemoInfo")
    public String getDemoInfo(HttpServletRequest request) {
        Map<String, String> map = new HashMap<>();
        Enumeration<String> headerNames = request.getHeaderNames();
        Enumeration<String> parameterNames = request.getParameterNames();
        while (headerNames.hasMoreElements()) {
            String s = headerNames.nextElement();
            map.put(s, request.getHeader(s));
        }
        while (parameterNames.hasMoreElements()) {
            String s = parameterNames.nextElement();
            map.put(s, request.getParameter(s));
        }
        return JSON.toJSONString(map);
    }
}
