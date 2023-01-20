package day2;
//identification of static members from top to bottom [1- 6]
//execution of static variable and static blocks from top to bottom[7-12]
//main method execution

public class StaticFlow {
	static int i = 10;   //1  //7
    static {    //2
        m1(); //8
        System.out.println("first static block");//10
    }
    public static void main(String[] args) { //3
        m1(); //13
        System.out.println("main"); //15
    }
    public static void m1() {  //4
        System.out.println(j);  //9 //14
    }
    static { //5
        System.out.println("2nd block");  //11
    }
    static int j = 20;  //6 //12
}
//output:
//0
//first static block
//2nd block
//20
//main