package apple;

public class book {
	public final String TITLE, AUTHOR, PUBLISHER;
public int total_pages, current_page;
	
	public int open(){
		current_page=1;
		return current_page;
	}
	
	public int open(int cp){
		current_page=cp;
		return current_page;
	}
	
	public void close(){
		current_page=0;
		System.out.println("book closed"); 
	}
	
	public void turnleft(){
		current_page+=1;
		System.out.println("Current page: "+current_page); 
	}
	
	public void turnright(){
		current_page-=1;
		System.out.println("Current page: "+current_page); 
	}
	
	public boolean checkclosed()
	{
		if(current_page==0)
			return true;
		else
			return false;
	}
	
	
	public book()
	{ 
		TITLE="MY LIFE";
		AUTHOR="ROWLING";
		PUBLISHER="KALYANI";
		current_page=8;
		total_pages=100;
		
	}
	


}
