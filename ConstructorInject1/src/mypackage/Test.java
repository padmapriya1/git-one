package mypackage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) { 
    	
    	System.out.println("hi");
    //IOC 
        Resource r1=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r1);  
          
        
        Employee obj =(Employee)factory.getBean("e1"); //object 
                obj.show();
                

           }  
}  


