import java.util.*;



class CorporateEventList{
    Scanner sc1 = new Scanner(System.in);
    char choice1;
     double Venue_Rent;
     double Catering;
     double Security;
     double Decor;
     double Branding;
     static double Total_Package_Amount;
    {
        System.out.println("1.Exhibition");
        System.out.println("2.Expo");
        System.out.println("3.Conferences");
        System.out.println("4.Product Launch / Service Launch");
        System.out.println("5.Team building Events / Appreciation Events"); 
    }
    CorporateEventList(){
        System.out.println("Enter your choice:");
        int ch = sc1.nextInt();
        do{
            switch (ch) {
                case 1: Exhibition();
                    break;
                case 2: Expo();
                    break;
                case 3: Conference();
                    break;
                case 4: ProductLaunch_ServiceLaunch();
                    break;
                case 5: TeamBuilding_AppreciatonEvents();
                    break;
            
                default:System.out.println("Invalid Input");
            }
            System.out.println("Do you want to continue for Corpoarate list (Y/N)");
            choice1 = sc1.next().charAt(0);
        }while(choice1 == 'Y');

    }

    void CommonExpenses(){
        System.out.println("Enter Venue Rent Amount  =");
        Venue_Rent =  sc1.nextDouble();
        System.out.println("Enter Catering Charge  =");
        Catering =  sc1.nextDouble();
        System.out.println("Enter Security Charge  =");
        Security =  sc1.nextDouble();
        System.out.println("Enter Decoration Expenses  =");
        Decor =  sc1.nextDouble();
        System.out.println("Enter Branding Amount  =");
        Branding =  sc1.nextDouble();
    }
    
    void DisplayList(){

        System.out.println("1.Venue  Rent            =   "+Venue_Rent);
        System.out.println("4.Catering               =   "+Catering);
        System.out.println("3.Security               =   "+Security);
        System.out.println("6.Stall Design and Decor =   "+Decor);
        System.out.println("7.Promotional expenese   =   "+Branding);
        Total_Package_Amount= Venue_Rent+Catering+Security+Decor+Branding;
    }


    void Exhibition(){
        double Exhibition_Specific=0;
        CommonExpenses();  
        DisplayList();

        System.out.println("Enter Exhibition Specific Expenses  =");
        Exhibition_Specific =  sc1.nextDouble();
        Total_Package_Amount += Exhibition_Specific;
        System.out.println("Total Package amount    =   "+Total_Package_Amount);
    }

    void Expo(){
        double Expo_Specific=0;
        CommonExpenses();
        DisplayList();

        System.out.println("Enter Expo Specific Expenses  =");
        Expo_Specific =  sc1.nextDouble();
        
        Total_Package_Amount += Expo_Specific;
        System.out.println("Total Package amount    =   "+Total_Package_Amount);
    }

    void Conference(){
        double Conference_Specific=0;
        CommonExpenses();
        DisplayList();

        System.out.println("Enter Conference Specific Expenses  =");
        Conference_Specific =  sc1.nextDouble();

        Total_Package_Amount += Conference_Specific;
        System.out.println("Total Package amount    =   "+Total_Package_Amount);
    }

    void ProductLaunch_ServiceLaunch(){
        double ProductLaunch_ServiceLaunch_Specific=0;
        CommonExpenses();
        DisplayList();

        System.out.println("Enter ProductLaunch_ServiceLaunch Specific Expenses  =");
        ProductLaunch_ServiceLaunch_Specific =  sc1.nextDouble();

        Total_Package_Amount += ProductLaunch_ServiceLaunch_Specific;
        System.out.println("Total Package amount    =   "+Total_Package_Amount);
    }

    void TeamBuilding_AppreciatonEvents(){
        double TeamBuilding_AppreciatonEvents_Specific=0;
        CommonExpenses();
        DisplayList();

        System.out.println("Enter TeamBuilding_AppreciatonEvents Specific Expenses  =");
        TeamBuilding_AppreciatonEvents_Specific =  sc1.nextDouble();

        Total_Package_Amount += TeamBuilding_AppreciatonEvents_Specific;
        System.out.println("Total Package amount    =   "+Total_Package_Amount);
    }

}




class SocialEventList {
    Scanner sc2 = new Scanner(System.in);
    
    char choice2;
    double Venue_Rent;
    double Catering;
    double Security;
    double Decor;
    double Music;
    double Videography_Photography;
    static double Total_Package1_Amount;
    {
        System.out.println("1.Festival_gatherings");
        System.out.println("2.Ceremonies_Galas");
        System.out.println("3.Parties");
        System.out.println("4.Concerts");
    }


    SocialEventList(){
        System.out.println("Enter you choice :");
        int ch = sc2.nextInt();
        do{
            switch (ch) {
                case 1: Festival_Gatherings();
                    break;
                case 2: Ceremonies_Galas();
                    break;
                case 3: Parties();
                    break;
                case 4: Concerts();
                    break;
            
                default:System.out.println("Invalid Input");
            }
            System.out.println("Do you want to continue Y/N");
            choice2 = sc2.next().charAt(0);
        }while(choice2 == 'Y');

    }

    void CommonExpenses_1(){
        System.out.println("Enter Venue Rent Amount  =");
        Venue_Rent =  sc2.nextDouble();
        System.out.println("Enter Catering Amount  =");
        Catering =  sc2.nextDouble();
        System.out.println("Enter Security Amount  =");
        Security =  sc2.nextDouble();
        System.out.println("Enter Decoration Amount  =");
        Decor =  sc2.nextDouble();
        System.out.println("Enter Music Amount  =");
        Music =  sc2.nextDouble();
        System.out.println("Enter Videography_Photography Amount  =");
        Videography_Photography =  sc2.nextDouble();
    }
    
    void DisplayList_1(){

        System.out.println("1.Venue  Rent            =   "+Venue_Rent);
        System.out.println("4.Catering               =   "+Catering);
        System.out.println("3.Security               =   "+Security);
        System.out.println("6.Stall Design and Decor =   "+Decor);
        System.out.println("7.Music                  =   "+Music);
        System.out.println("8.Videography_Photography=   "+Videography_Photography);
        Total_Package1_Amount = Venue_Rent+Catering+Security+Decor+Music+Videography_Photography;

    }


    void Festival_Gatherings(){
        double Festival_Specific=0;
        CommonExpenses_1();
        DisplayList_1();

        System.out.println("Enter Festival Specific Expenses  =");
        Festival_Specific =  sc2.nextDouble();
        Total_Package1_Amount += Festival_Specific;
        System.out.println("Total Package amount    =   "+Total_Package1_Amount);
    
    }

    void Ceremonies_Galas(){
        double Ceremonis_Specific=0;
        CommonExpenses_1();
        DisplayList_1();

        System.out.println("Enter Ceremonis Specific Expenses  =");
        Ceremonis_Specific =  sc2.nextDouble();
        Total_Package1_Amount += Ceremonis_Specific;
        System.out.println("Total Package amount    =   "+Total_Package1_Amount);

    }

    void Parties(){
        double Parties_Specific=0;
        CommonExpenses_1();
        DisplayList_1();

        System.out.println("Enter Parties Specific Expenses  =");
        Parties_Specific =  sc2.nextDouble();
        Total_Package1_Amount += Parties_Specific;
        System.out.println("Total Package amount    =   "+Total_Package1_Amount);

    }

    void Concerts(){
        double Concerts_Specific=0;
        CommonExpenses_1();
        DisplayList_1();

        System.out.println("Enter Concerts Specific Expenses  =");
        Concerts_Specific =  sc2.nextDouble();
        Total_Package1_Amount += Concerts_Specific;
        System.out.println("Total Package amount    =   "+Total_Package1_Amount);
    }


}





class Event{
	static void About_us(){
        System.out.println("    We provide Custom Event Management services that have not been experienced in the industry at affordable rates. ");
        System.out.println("Our first priority is client’s satisfaction. We firstly focus on what the requirements are after that we involve our creative and ");
        System.out.println("innovative ideas to make the event a memorable one.");
        
        System.out.println("Project Team members: ");
        System.out.println();
        System.out.println("1.Kumar Barbade");
        System.out.println("1.Kunal More");

    }

        
		 
		
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice1;

        

        System.out.println("Welcome to Garud Event Management Agency");

        do{

        System.out.println("Please choose Category");
        System.out.println("1.Corporate Events");
        System.out.println("2.Social Events");
        System.out.println("2.About us");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1: CorporateEventList cel = new CorporateEventList();
                    break;

            case 2: SocialEventList sel = new SocialEventList();
                    break;
			
			case 3: About_us();
                    break;			

            default : System.out.println("Invalid input");
        }
        System.out.println("Do you want to continue for Home page (Y/N)");
        choice1 = sc.next().charAt(0);

    }while(choice1  == 'Y');
    
    System.out.println("Thank you Have a nice day");
    
    }
}

