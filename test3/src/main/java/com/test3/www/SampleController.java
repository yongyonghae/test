package com.test3.www;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test3.www.domain.SampleDTO;
import com.test3.www.domain.SampleDTOList;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	@RequestMapping("")
	public void test() {
		log.info("test");
	}
	
	@RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
	public void testGet() {
		log.info("testGet");
	}
	
	@GetMapping("/testOnlyGet")
	public void testGet2() {
		log.info("testOnlyGet");
	}

	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		log.info("dto=" + dto);
		return "ex01";
	}
	
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
		log.info("ids:" + ids);
		
		return "ex02List";
	}
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		System.out.println("list dto222:" + list);
		log.info("list dto:" + list);
		
		return "<h1>ex02Bean</h1>";
	}
		
	
}
