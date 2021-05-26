package qachallenges;
	 
	import java.util.Scanner;
	 
	//import helpers.S;
	 
	public class AddMenu {
	 
	    public boolean is_running;
	    public String[] menuItems;
	 
	    public AddMenu() {
	        is_running = true;
	        menuItems = new String[]{"Motorbike","Car","Truck"};
	    }//end constructor
	 
	    public void run()
	    {
	        while(is_running)
	        {
	            addMenuShow() ;
	            menu_user_input();
	        }
	    }
	 
	    public void addMenuShow()
	    {
	        int i=1;//iterator
	        //foreach menu_items
	        for(String item :menuItems)
	        {
	            S.o(i+") "+item);
	            i++;
	        }
	    }//end menu_show
	 
	    public void menu_user_input()
	    {
	    	
	        //get user input
	        Scanner userInput = new Scanner( System.in );
	        String next = userInput.next();
	        //if user entered 1
	        if(next.equals("1"))
	        {
	            S.o("Enter the details of motorbike - ID1 , true, false, false, namehere, rangeAsINT \n");
	        }
	        //if user entered 2 etc etc
	        if(next.equals("2"))
	        {
	            S.o("Car is not implemented yet. \n");
	            is_running = false;
	        }
	 
	        if(next.equals("3"))
	        {
	            S.o("Truck is not implemented yet. \n");
	            is_running = false;
	        }
	 
	        //exit program if user writes exit
	        if(next.equals("exit"))
	        {
	            S.o("program ended");
	            is_running = false;
	        }
	 
	    }//end menu_user_input
	    
	    public void addVehicle() {
	    	
	    }
	    	
	    
	 
	}

