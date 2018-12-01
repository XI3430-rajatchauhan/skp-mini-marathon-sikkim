package me.sumithpuri.github.sikkim.spring.ws.xfire.client.sample;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import me.sumithpuri.github.sikkim.spring.ws.xfire.sample.StockTrader;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri

 * GitHub URL 			https://github.com/sumithpuri
 * Code Sample			Brainbench Spring 2.5 Certification [+ Spring In Action Samples]
 * Sample Topic			Core Spring (Web Services)
 * Certificate URL		https://goo.gl/X321kd
 * Package Prefix 		me.sumithpuri.github.sikkim
 * Project Codename		sikkim
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sub-license and/or sell copies of the Software and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public class SpringWSClient {
	
	static {
		
		System.out.println("Copyright (c) 2018-19,	Sumith Kumar Puri");
		System.out.println();
		System.out.println("Project Codename      Sikkim");
		System.out.println("Project Description   Core Spring (Web Services Client)");
		System.out.println("Certification         Brainbench Spring 2.5 Certification");
		System.out.println("Certificate URL	      https://goo.gl/X321kd");
		System.out.println("[Developer Notes]     [01] Use Java Version 9.0+ Compiler");
		System.out.println("[Developer Notes]     [02] Use Apache Tomcat 9.0+ Compiler");
		System.out.println();
	}

	public static void main(String args[]) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-xfire-client.xml");
		
		StockTrader stockTrader = (StockTrader) context.getBean("stockService");
	
		System.out.println("\nInvoking Web Service...");
		String[] stocks = stockTrader.getStockQuotes();
		System.out.println();
		for(String str: stocks) {
			System.out.println(str);
		}
	}
}
