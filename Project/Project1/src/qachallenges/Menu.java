package qachallenges;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
//import helpers.S;
 
public class Menu {
	
	private ArrayList<Vehicle> theVehicles = new ArrayList<>();
	Garage myGarage = new Garage();
	Motorbike honda = new Motorbike(1, true, false, false, "hondamsx", 120);
	Motorbike yamaha = new Motorbike(1, true, false, false, "mt125", 110);
	Car volkswagen = new Car(2, false, true, false, "Polo", 155,3);
	Lorry volvo = new Lorry(3, false, false, true, "Trucker", true, 300);
	Car toyota = new Car(2, false, true, false, "Camry", 160,5);
	

 
    public boolean is_running;
    public String[] menu_items;
 
    public Menu() {
        is_running = true;
        menu_items = new String[]{"Show all Vehicles","Add a Vehicle","Edit a Vehicle"};
    }//end constructor
 
    public void run()
    {
        while(is_running)
        {
            menu_show() ;
            menu_user_input();
        }
    }
 
    public void menu_show()
    {
        int i=1;//iterator
        //foreach menu_items
        for(String item :menu_items)
        {
            S.o(i+") "+item);
            i++;
        }
    }//end menu_show
    
    public void garageHolder() {
    	myGarage.addVehicle(volvo);
		myGarage.addVehicle(toyota);
		myGarage.addVehicle(yamaha);
		myGarage.addVehicle(honda);
		myGarage.addVehicle(volkswagen);
    }
 
    public void menu_user_input ()
    {
    	
        //get user input
        Scanner userInput = new Scanner( System.in );
        String next = userInput.next();
        //if user entered 1
        if(next.equals("1"))
        {
            S.o("you chose show all \n");
    		myGarage.addVehicle(volvo);
    		myGarage.addVehicle(toyota);
    		myGarage.addVehicle(yamaha);
    		myGarage.addVehicle(honda);
    		myGarage.addVehicle(volkswagen);
    		myGarage.getTheVehicles();
            getTheVehicles();
    		S.o("\n");

        }
        //if user entered 2 etc etc
        if(next.equals("2"))
        {
            S.o("We will take you to the add menu. \n");
            is_running = false;
            addVehicleMenu();
            userInput.close();
        }
 
        if(next.equals("3"))
        {
            S.o("Not implemented \n");
            is_running = false;
        }
 
        //exit program if user writes exit
        if(next.equals("exit"))
        {
            S.o("program ended");
            is_running = false;
        }
 
    }//end menu_user_input
    
    public boolean addVehicle(Vehicle newVehicle) {
		theVehicles.add(newVehicle);
		return true;
	}
    
    public boolean getTheVehicles() {
		for (Vehicle i : theVehicles) {
			System.out.println(i.getBrand());
		}
		return false;
	}

	public void addVehicleMenu() {
    	S.o("What Vehicle would you like to add?");
    	S.o("1. Motorbike");
    	S.o("2. Car");
    	S.o("3. Truck");
    	S.o("Type exit to exit program.");
    	@SuppressWarnings("resource")
		Scanner userInput = new Scanner( System.in );
        String next = userInput.next();
        //if user entered 1
        
        if(next.equals("1"))
        {
            S.o("Enter Motorbike details. \n");
            Motorbike newBike = new Motorbike (userInput.nextInt(), userInput.nextBoolean(), userInput.nextBoolean(), userInput.nextBoolean(), userInput.next(),userInput.nextInt());
            ((List<Vehicle>) myGarage).add(newBike);
            getTheVehicles();
            S.o("Should show vehicles with new bike now...");
        }
        //if user entered 2 etc etc
        if(next.equals("2"))
        {
            S.o("Car \n");
            is_running = false;
        }
 
        if(next.equals("3"))
        {
            S.o("Truck \n");
            is_running = false;
        }
 
        //exit program if user writes exit
        if(next.equals("exit"))
        {
            S.o("program ended");
            is_running = false;
        }
 
    }
    	
    }
 
