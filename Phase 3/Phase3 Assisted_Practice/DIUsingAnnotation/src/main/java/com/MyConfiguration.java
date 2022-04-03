package com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration  	//Like beans.xml
@ComponentScan(basePackages = "com")	//here use ComponentScan
public class MyConfiguration {

}
