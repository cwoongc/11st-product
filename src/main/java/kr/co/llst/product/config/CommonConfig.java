package kr.co.llst.product.config;

import kr.co.llst.product.support.AcceptInterceptor;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class CommonConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	    viewResolver.setPrefix("/");
	    viewResolver.setSuffix(".html");
	    viewResolver.setContentType("text/html; charset=euc-kr");
	    return viewResolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		registry.addResourceHandler("/**").addResourceLocations("/product/dist/");
	}

	@Bean
	public AcceptInterceptor acceptInterceptor() {
		return new AcceptInterceptor();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(acceptInterceptor());
	}


	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {

		return new EmbeddedServletContainerCustomizer() {
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
//				container.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/resources/pageNotFound.jsp"));
//				container.addErrorPages(new ErrorPage(HttpStatus.UNAUTHORIZED, "/resources/pageNotFound.jsp"));
//				container.addErrorPages(new ErrorPage(HttpStatus.PAYMENT_REQUIRED, "/resources/pageNotFound.jsp"));
//				container.addErrorPages(new ErrorPage(HttpStatus.FORBIDDEN, "/resources/pageNotFound.jsp"));
//				container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/resources/pageNotFound.jsp"));
//				container.addErrorPages(new ErrorPage(HttpStatus.METHOD_NOT_ALLOWED, "/resources/pageNotFound.jsp"));
//
//				container.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/resources/internalError.jsp"));
//				container.addErrorPages(new ErrorPage(HttpStatus.NOT_IMPLEMENTED, "/resources/internalError.jsp"));
//				container.addErrorPages(new ErrorPage(HttpStatus.BAD_GATEWAY, "/resources/internalError.jsp"));
//				container.addErrorPages(new ErrorPage(HttpStatus.SERVICE_UNAVAILABLE, "/resources/internalError.jsp"));
//				container.addErrorPages(new ErrorPage(HttpStatus.GATEWAY_TIMEOUT, "/resources/internalError.jsp"));
			}
		};
	}
	
}
