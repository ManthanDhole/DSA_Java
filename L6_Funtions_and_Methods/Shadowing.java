public class Shadowing {
    static int x = 10;
    static int y = 10;
    public static void main(String[] args) {
        System.out.println(x); //The top level variable will be used
        int x = 20; //Declaring a variable with the same name will Shadow over the top level variable and will be
        //used until the scope exists for the newly initialized variable.
        System.out.println(x);


        System.out.println(y);
        int y;
//        System.out.println(y);  //This statement will throw error as the locally scoped variable could not be used
        //until it is declared. Only initializing would not work in this case.
        y = 20;
        System.out.println(y);
    }

}
