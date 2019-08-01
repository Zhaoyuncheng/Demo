package com.neuedu.servlet;

public class 笔记 {
	/**
	 * 1.AJAX  异步的JAvaScript AND XML（可扩展的标记语言）
	 * 	- 动态的网页技术 
	 *  - 同步和异步
	 *  	- 同步：等待
	 *  	- 异步：无须等待
	 *  
	 *  - 宗旨：提高用户的体验
	 *  
	 *  - 基本使用：
	 *  	- $.ajax({.....键值对})
	 *  		- 键值对：URL，type，success，error，data....(顺序可以随意)
	 *  	- $.get(URL,Data,function(){})
	 *  	- $.post(URL,Data,function(){})
	 *  
	 *  	- $.getJSON(URL,Data,function(){})
	 *  	- $("选择器").load(URL,Data)
	 *  
	 * 2. JSON JAvaScript Object Notation （JS 对象表示法）
	 * 		功能：		
	 * 		- 可以表示JS对象
	 * 		- JSON 是存储和交换文本信息的语法。类似 XML。
	 *		
	 *		特点：
	 *		- JSON 比 XML 更小、更快，更易解析。
	 *
	 *		- 基本语法：
	 *				- 数据在名称/值对中      ： 键值对描述数据（k:v）
	 *				- 键（名称）：使用字符串
	 *					- 放在引号之间（单引号，双引号，不用引号也可以）
	 *					注意：统一（代码可读性好）
	 *				- 值：可以放什么类型的数据
	 *					数字（整数或浮点数）
	 *					字符串（在双引号中）
	 *					逻辑值（true 或 false）
	 *					数组（在方括号中）
	 *					对象（在花括号中）
	 *					null   (了解)
	 *				- 数据由逗号分隔	：英文逗号每一个数据
	 *				- 花括号保存对象	：{'name':'赵四','age':23,'gender':true}
	 *				- 方括号保存数组	：[{},{},{}]
	 *		
	 *		1. 基本写法
	 *		2.{}--》[]
	 *		3.[]--》{}
	 *		
	 * 		- 获取数据
	 *		- 对象.键名
	 *		- 对象["键名"]
	 *		- 数组[索引]
	 *		
	 *	- JSON对象的数据遍历
	 * 		- 利用键 获取 值 
	 * 
	 * 
	 * 
	 */
	/**
	 * Servlet继承体系：
	 * 	- 如图：
	 * 
	 * Servlet的API：
	 * 	- 支持Http 协议的（学的就是这个）
	 * 		- 强转
	 * 	- 非Http 协议的
	 * 
	 * 生命周期：
	 * 	- （个人习惯）5部分
	 * 		- 加载  、init()、service()、destroy()、卸载
	 * 
	 * Servlet两个版本的手动创建：
	 * 	- 2.5版本
	 *  - 3.0版本
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	

}
