/*
 Fiona Xie
 5/2/2020
Rolls two dice 1000 times and counts the number of times each combination pops up
 */
package e3_dice;

public class E3_Dice {

    public static void main(String[] args) {
        //sets array amount to 14, due to not using 0 or 1
       int total[] = new int[14];
       int d1; // dice one
       int d2;// dice two
       int sum;//integer to store the sum of the rolls
       int max = 6; // sets max value for random number
       int min = 1; // sets min value for random numbers
       
       //runs the program 1000 times aka, rolls 1000 times
       for (int i=0; i<1000;i++){
           
           //rolls the first die
           d1 = (int) ((Math.random()*((max-min)+1))+min); 
           //rolls the second die
           d2 = (int) ((Math.random()*((max-min)+1))+min);
           // gets the total of the two rolls
           sum = d1+d2;
       
           //testing if randomization was working
       /*System.out.println(d1);
       System.out.println(d2);
       System.out.println(sum);
       System.out.println(" ");*/
       
       
           if (sum==2){
               total[2]++; // if sum==total[i], adds one to total[i], does it for each number from 2-12
           }
           else if (sum==3){
               total[3]++;
           }
           else if (sum==4){
               total[4]++;
           }
           else if (sum==5){
               total[5]++;
           }
           else if (sum==6){
               total[6]++;
           }
           else if (sum==7){
               total[7]++;
           }
           else if (sum==8){
               total[8]++;
           }
           else if (sum==9){
               total[9]++;
           }
           else if (sum==10){
               total[10]++;
           }
           else if (sum==11){
               total[11]++;
           }
           else if (sum==12){
               total[12]++;
           }
           
       }
       System.out.println("Two was rolled "+total[2]+" times."); //prints out results for 2-12
       System.out.println("Three was rolled "+total[3]+" times.");
       System.out.println("Four was rolled "+total[4]+" times.");
       System.out.println("Five was rolled "+total[5]+" times.");
       System.out.println("Six was rolled "+total[6]+" times.");
       System.out.println("Seven was rolled "+total[7]+" times.");
       System.out.println("Eight was rolled "+total[8]+" times.");
       System.out.println("Nine was rolled "+total[9]+" times.");
       System.out.println("Ten was rolled "+total[10]+" times.");
       System.out.println("Eleven was rolled "+total[11]+" times.");
       System.out.println("Twelve was rolled "+total[12]+" times.");
       
    }
    
}
