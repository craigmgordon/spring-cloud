package com.craigmgordon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RefreshScope
public class DemoController {
	
	@Value("${common-property}")
	String commonProperty;
	
	@Value("${message}")
	String envProperty;
	
	@Value("${password}")
	String encProperty;
	
	@RequestMapping("/properties")
	public String getPropertyInfo(Model m){
		m.addAttribute("commonProperty", commonProperty);
		m.addAttribute("envProperty", envProperty);
		m.addAttribute("encProperty", encProperty);
		
		return "propertyView";
	}
	
}
