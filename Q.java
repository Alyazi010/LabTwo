import java.util.Scanner;

public class Q {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("How many times would you like to throw the dice? ");
            int roll = input.nextInt();
            int [] dice = new int [roll];
            System.out.println("\nRolling the dice " + roll + " times.");
            //here i created a for loop for the roll so it can roll to 6 without any stop.
            for(int i=0;i<roll;i++)
            {
             // here i wrote math.Random so it can guess random number every time the user 
            	//enter how  How many times they  would like to throw the dice? 
                int Yazi = (int)(Math.random()*6+1);      
                dice[i] = Yazi;       
            }
            
            Alyazi_53(dice, roll);     
   
}
    // we call the method getFace_Elyazi_53 
	 //so it send the array to the method and
    //to get the number of every face occurred during the rolling of the dice.
	public static void Elyazi_53() {
		
	}
	static void Alyazi_53(int [] array, int n) {
   	 
        int count1=0, count2=0, count3=0, count4=0, count5=0, count6=0;
        
        
        // we wrote here a loop for each array from 1-6
        // in each one these six arrays we wrote if statement
        //we created a for loop so the code stop when it reach to 6.
        for (int i=0; i<n; i++)
        {
            if(array[i]==1){
                count1+=1;
            }
            if(array[i]==2){
                count2+=1;
            }
            if(array[i]==3){
                count3+=1;
            }
            if(array[i]==4){
                count4+=1;
            }
            if(array[i]==5){
                count5+=1;
            }
            if(array[i]==6) {
                count6+=1;
            }
        }
        // to print out the statement including the Calculation  
        System.out.println("Dice with 1 face: " + count1 + "\n");
        System.out.println("Dice with 2 face: " + count2 + "\n");
        System.out.println("Dice with 3 face: " + count3 + "\n");
        System.out.println("Dice with 4 face: " + count4 + "\n");
        System.out.println("Dice with 5 face: " + count5 + "\n");
        System.out.println("Dice with 6 face: " + count6 + "\n");
}


}



	