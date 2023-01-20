package day2;
// first static flow will happen
//instance flow starts

//identification of instance members from top to bottom [3-8]
//execution of instance variable and instance blocks from top to bottom
//constructor will be executed 

public class InstanceControlFlow {
    int i = 10; //3 //9
    {   //4
        m1();  //10
        System.out.println("first block");  //12
    }

    InstanceControlFlow() { //5
        System.out.println("CONSTRUCTOR"); //15
    }

    public static void main(String[] args) { //1
        InstanceControlFlow i = new InstanceControlFlow(); //2
        System.out.println("main method"); //16
        InstanceControlFlow i2 = new InstanceControlFlow(); 
    }
    public void m1(){  //6 
        System.out.println(j);  //11
    }
    {  //7
        System.out.println("second block");  //13
    }
    int j = 20; //8 //14

}

//output:
//0
//first block
//second block
//CONSTRUCTOR
//main method