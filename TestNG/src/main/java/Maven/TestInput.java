package Maven;

public enum TestInput {
	
	URL_GMAIL ("https:gmail.com/"),
	Username ("sarav1006@gmail.com"),
	Username_Blank (""),
	Invalid_Usename ("#$%^"),
	Password ("Dhoni5012"),
	
	Ebay_URL ("https://www.ebay.com/"),
	Ebay_Search_Item ("Electri Guitar");

	public String value;

	TestInput(String string) 
	{
		this.value = value;	
	}
	
	public String getValue()
	{
		return value;
	}



}
