package se.systementor;

import static com.diogonunes.jcolor.Ansi.*;
import static com.diogonunes.jcolor.Attribute.*;


public class BankSystem {
    
    public void login(){
        System.out.print(colorize("Skriv in din email:", 
            BLUE_TEXT(), 
            BLACK_BACK()));                        
        String namn = System.console().readLine();
        System.out.print(colorize("Skriv in din kod:", 
            YELLOW_TEXT(), 
            BLACK_BACK()));                        
        String kod = System.console().readLine();
        //här skulle vi kunna kolla namn och kod mot en databas
        // filer
    }

    public void visaMeny2(){
        while(true){
            System.out.println(colorize("*** INLOGGAD ***", 
                BLUE_TEXT(), 
                BLACK_BACK()));                        
            System.out.println(colorize("1. Ta ut pengar", 
                BLUE_TEXT(), 
                BLACK_BACK()));                        
            System.out.println(colorize("0. Tillbaka till huvudmeny", 
                RED_TEXT(), 
                BLACK_BACK()));                        
            int sel = Integer.parseInt(System.console().readLine());
            if(sel == 0)
                break;
        }


    }

    public void run(){
        while(true){
            System.out.println(colorize("*** HUVUDMENY ***", 
                YELLOW_TEXT(), 
                BLACK_BACK()));                        
            System.out.println("1. Login");                
            System.out.println("2. Skapa konto");                
            System.out.println("3. Avsluta programmet");                
            System.out.print("Vad vill du göra?");                
            int sel = Integer.parseInt(System.console().readLine());
            if(sel == 3){
                break;
            }
            if(sel == 1){
                login();        
                visaMeny2();
            }




        }
    }
}
