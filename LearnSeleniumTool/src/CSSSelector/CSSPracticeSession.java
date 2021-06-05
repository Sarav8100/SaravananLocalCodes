package CSSSelector;

public class CSSPracticeSession {

	public static void main(String[] args) {

		//Ex : 1.<div name ='19306065_username_54494-6546' class = 'c' id='p' >
		//Ex : 2.<label abc = '54479998_fdsv' id = '"User" >
		//Ex : 3.<input id="username_1664685_abcd' type="text">
		
		//1.Tagname[attribute='value']
		
		/*
		Wild card CSS Selector :  (Dynamic Locator)
		1. ^ (Carrat Character)  : tagname[attribute^='value']  --> Ex: input[id^='username'] --->Fixed part of the First
		2. $ (Dollar Character) : tagname[attribute$='value']  --> Ex: label[abc$=_fdsv] -->Ending part of the particular locator
		3. * (Asterisk Character) : tagname[attribute*='value'] -->div[name*='username'] --> Fixed part present in the Middle
		
		
		CSS Combinators : Ex: Facebook page
		1. Descendant Selector : ('Space')
			Ex : form[method='post'] div div[class='_6lux']
		2. Child Selector : ('>')
			Ex : div[class^='pvl']>div
		3. Adjacent Sibling Selector : ('+')
			Ex : div[id='u_0_4'] +div
		4. General Sibling Selector : ('~')
			Ex : div[id='u_0_4'] ~div
		 */
	}

}
