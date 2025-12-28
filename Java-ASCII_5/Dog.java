package koeln.uni.idh.java.ex9;

/**
 * Represents a Dog with a name and age.
 * This class models a simple dog that is created with a name and starts at age 0.
 */
public class Dog {

  /** The name of the dog */
  String name;
  
  /** The age of the dog in years */
  int age;
  
  /**
   * Creates a new Dog with the specified name.
   * The dog is initialized with an age of 0.
   * 
   * @param name the name to give to the dog
   */
  public Dog(String name) {
    this.name = name;
    this.age = 0;
    System.out.println("The dog " + name + " was born");
  }
  
  
  
  public void birthday() {
	  
	  
	  this.age++;
	  System.out.println(this.name + " hat heute " + "den "  + this.age +  "ten Geburtstag! 🦴 🎉");
  }
  
  
  public Dog mate(Dog Partner) {
	  
	  if (this.age > 3 && Partner.age > 3) {
		  System.out.println("Erfolgreiche Paarung");
		  return new Dog("Baby von " + this.name + " & " + Partner.name);
	  } else {
		  
		  return null;
	  }
	  
  }
  
  public Dog[] multimate(Dog Partner) {
	  if (this.age <= 3 || Partner.age <= 3) {
		  return null;
	  }
	  
	  
	  int HundeArray = (int) (Math.random() * 10) + 1;
	  
	
      Dog[] wurf = new Dog[HundeArray];

     
      for (int i = 0; i < wurf.length; i++) {
          wurf[i] = new Dog("Welpe Nr. " + (i+1));
      }

    
      return wurf;
  }

	 
	  
  }

