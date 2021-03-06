package com.vhouzi.abc.admin.framework.config;

import com.vhouzi.abc.admin.framework.filter.SimpleCORSFilter;
import com.vhouzi.abc.common.utils.StringUtils;
import com.vhouzi.abc.common.xss.XssFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.DispatcherType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Filter配置
 *
 * @author yiran
 */
@Configuration
public class FilterConfig
{
    @Value("${xss.enabled}")
    private String enabled;

    @Value("${xss.excludes}")
    private String excludes;

    @Value("${xss.urlPatterns}")
    private String urlPatterns;

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Bean
    public FilterRegistrationBean xssFilterRegistration()
    {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setDispatcherTypes(DispatcherType.REQUEST);
        registration.setFilter(new XssFilter());
        registration.addUrlPatterns(StringUtils.split(urlPatterns, ","));
        registration.setName("xssFilter");
        registration.setOrder(Integer.MAX_VALUE);
        Map<String, String> initParameters = new HashMap<String, String>();
        initParameters.put("excludes", excludes);
        initParameters.put("enabled", enabled);
        registration.setInitParameters(initParameters);
        return registration;
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Bean
    public FilterRegistrationBean simpleCORSFilterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setDispatcherTypes(DispatcherType.REQUEST);
        registrationBean.setName("simpleCORSFilter");
        SimpleCORSFilter simpleCORSFilter = new SimpleCORSFilter();
        registrationBean.setFilter(simpleCORSFilter);
        registrationBean.setOrder(Integer.MAX_VALUE);
        List<String> urlList = new ArrayList<String>();
        urlList.add("/api/yiran/*");
        registrationBean.setUrlPatterns(urlList);
        return registrationBean;
    }
}
