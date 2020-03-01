package com.vhouzi.abc.admin.server.api;

import com.vhouzi.abc.admin.framework.web.base.BaseController;
import com.vhouzi.abc.admin.system.domain.SysUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.WebAsyncTask;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/jwt/test")
public class JwtTestController extends BaseController {

	
    @PostMapping(value = "/test2")
    public WebAsyncTask test2(HttpServletRequest request){
        WebAsyncTask test2 = new WebAsyncTask( () -> {
            String test = request.getParameter("test");
            System.out.println("dddddddddd");
            return "5464";
        });
        return test2;
    }
    @PostMapping(value = "/test3")
    public WebAsyncTask test3(HttpServletRequest request, @RequestBody String bodyData){
        WebAsyncTask test2 = new WebAsyncTask( () -> {
            String test = request.getParameter("test");
            System.out.println("dddddddddd");
            return bodyData;
        });
        return test2;
    }
    @PostMapping(value = "/test4")
    public WebAsyncTask test4(HttpServletRequest request, @RequestBody SysUser SysUser){
        WebAsyncTask test2 = new WebAsyncTask( () -> {
            return SysUser;
        });
        return test2;
    }
    @PostMapping(value = "/test5")
    public WebAsyncTask test5(HttpServletRequest request, SysUser SysUser){
        WebAsyncTask test2 = new WebAsyncTask( () -> {
            return SysUser;
        });
        return test2;
    }

}