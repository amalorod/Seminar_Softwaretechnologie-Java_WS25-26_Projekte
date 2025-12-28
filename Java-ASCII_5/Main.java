package koeln.uni.idh.java.ex9;


public class Main {

    public static void main(String[] args) {
        
        
 System.out.println("Neue Hunde:");
  	Dog dog1 = new Dog("Bello");
  	Dog dog2 = new Dog("Roxie");
  	Dog dog3 = new Dog("Turbo");
 System.out.println(" ");
        
 System.out.println("Auf dem Weg zu den 20ern:");
 System.out.println(" ");
       
       
 
 for (int jahr = 1; jahr <= 20; jahr++) {
            System.out.println("Jahr " + jahr + ":");
            dog1.birthday();
            dog2.birthday();
            dog3.birthday();
            
            
            

            
      
            if (jahr == 2) {
                
                dog1.mate(dog2);
                System.out.println("Die Hunde sind noch zu jung");               
            }
            
            if (jahr == 5) {
            	
            	 dog1.mate(dog2);
    	
            }

            if (jahr == 6) {
           
                 dog2.multimate(dog3);
                 
                 
  }
  
        }
  
    
   }
}