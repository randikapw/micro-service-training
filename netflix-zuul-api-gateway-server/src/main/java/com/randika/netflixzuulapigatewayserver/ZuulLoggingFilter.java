package com.randika.netflixzuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;


@Component
public class ZuulLoggingFilter extends ZuulFilter{
	
	//Creating the logger instance
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// Logging Logic here
		HttpServletRequest request = 
				RequestContext.getCurrentContext().getRequest();
		
		logger.info("request -> {} requestUri -> {}",
				request, request.getRequestURI());
		
		return null;
	}

	@Override
	public String filterType() {
		return "pre"; //pre, post, error
	}

	@Override
	public int filterOrder() {
		// filter order for the priority for this filter
		return 1;
	}

}
