package LocatorsConcepts;

public class XpathAllSyntax {

	public static void main(String[] args) {

				//Facebook First Name and Last Name : Combination of Two HTML Attributes
				//1.input[@type='text' and @name='firstname']
				
				
				//With the help of Text() funtion
				//2. //span[text()='Create an account']
				//3. //a[text()='Data Policy']
				
				//Parent and child reference
				//1.//div[@id=navbar-collapse']/ul/li/a[text()='Features']
				//2.//div[@id=navbar-collapse']//a[text()='Features']
				
				/*Syntax 
				1.//tagname[@attribute='value' and @attribute='value'] - Combination of Two HTML attributes
				2.//tagname[text()='value'] - Text Function
				3.//parentTag[@parentAttribute='value']/childTag[@childAtt='value']   - Parent and child  reference
				4.//*[@attribute='value']
				5.//tagname[text()='value']  			- //td[text()='QTP']  			- Independent 
				6.//tagname[text()='value']/..//tagname	- //td[text()='QTP']/..//input 	- Dependent
				7.//* , //div/* , //input[@*] , //*[@*]      - Wildcard Search in Xpath
				8.//div[contains(text(),'2019') and contains[@id,'last_trade')]    		- Two or more contains with 'and' operators
				9.//htmltag[normalize-space(text())='value'] 			- Normalize-space
				10.//htmltag[starts-with(@attribute,'value')]			- Starts-with
				11.//htmltag[ends-with(@attribute,'value')]				-Ends-with
				*/
		
		//div/a[last()]
		//div/a[position()='1']

	}

}
