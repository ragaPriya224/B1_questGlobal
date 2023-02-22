package main.java;

public class SingletonPattern {

	// Static variable reference of single_instance
    // of type Singleton
    private static SingletonPattern single_instance = null;
  
    public String s;
  
    private SingletonPattern()
    {
        s = "This is Singleton class";
    }
  
    public static SingletonPattern getInstance()
    {
        if (single_instance == null) {
        	single_instance = new SingletonPattern();
        }
        return single_instance;
    }

}
