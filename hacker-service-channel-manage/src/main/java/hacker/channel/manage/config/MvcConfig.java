package hacker.channel.manage.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @description 拦截器注册配置
 * @Description: J X N H
 * @EnglishName LuKe
 * @authod LiuQi
 * @date 2019/6/3 11:44
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * 视图跳转集中配置
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/dr").setViewName("dr");
    }

    /**
     * 配置拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AppInterceptor())
                //放行
                .addPathPatterns("/**")
                .excludePathPatterns("/api/login")
                .excludePathPatterns("/error")
                .excludePathPatterns("/dr")
                .excludePathPatterns("/**")
                .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**")
                .excludePathPatterns("/static/**");
    }

}
