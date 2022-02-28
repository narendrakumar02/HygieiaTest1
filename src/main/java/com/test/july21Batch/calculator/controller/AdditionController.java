package com.test.july21Batch.calculator.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {

     
@RequestMapping("add")
public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
	  
	  ModelAndView mv=new ModelAndView();
	  
	  int a = Integer.parseInt(request.getParameter("t1"));
	  int b = Integer.parseInt(request.getParameter("t2"));
	  int c = 0;
	  int ch =Integer.parseInt( request.getParameter("t3"));
	  if(ch==1){
           c=sum(a,b);
          }
      else if(ch==2){
          c=substract(a,b);
          }
      else if(ch==3){
    	  c=multiply(a,b);
    	  }
      else if(ch==4){
    	  c=divide(a,b);
    	  }
	  mv.setViewName("resultset");
      mv.addObject("result",c);
      return mv;
	
}

int sum(int a, int b)
    {  
	return a+b;  
	} 
int substract(int a, int b)   
    {  
    return a-b;  
    }  
int multiply(int a, int b)   
    {  
    return a*b;  
    } 
int divide(int a, int b)   
    {  
    return a/b;  
    }  
}  
