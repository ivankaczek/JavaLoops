/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testloops.services;

import java.util.ArrayList;
import java.util.Random;
import testloops.LoopTestSeat;

/**
 *
 * @author Ivan
 */
public class TestLoopsServices {
    
    
    public void test3times(ArrayList<LoopTestSeat> seats){
      int counter = 1;
      boolean keepGoing = true;
      
      do {
          
          System.out.println("This is the #" + counter + " time that we try");
          int index2test = returnRandomIndexMax05();
          System.out.println("We test seat with index #" + index2test);
          LoopTestSeat seat2check = seats.get(index2test);
          System.out.println("It is " + checkIfSeatOccupied(seat2check) + " that the seat is occupied");
          counter ++;
          System.out.println("");
          if(counter > 3){
              keepGoing = false;
          }
      } while (keepGoing);
        //System.out.println("");
    }
    
    public void test3timesStopWhenEmptySeatFound(ArrayList<LoopTestSeat> seats){
       int counter = 1;
      boolean keepGoing = true;
      
      do {
          
          System.out.println("This is the #" + counter + " time that we try");
          int index2test = returnRandomIndexMax05();
          System.out.println("We test seat with index #" + index2test);
          LoopTestSeat seat2check = seats.get(index2test);
          boolean theSeatIsOccupied = checkIfSeatOccupied(seat2check);
          System.out.println("It is " + theSeatIsOccupied + " that the seat is occupied");
          counter ++;
          System.out.println("");
          if(counter > 3){
              keepGoing = false;
          }
          if (!theSeatIsOccupied){
              keepGoing = false;
              System.out.println("Since the seat is empty, we no longer need to keep looking for");
          }
      } while (keepGoing); 
        
        
        
    }
    
    public int returnRandomIndexMax05(){
        Random r = new Random();
        int low = 0;
        int high = 5;            
        int result = r.nextInt(high-low) + low;
        return result;
    }
    
    public boolean checkIfSeatOccupied(LoopTestSeat seat){
        boolean seatWithSomeone = false;
        if(seat.isSeatWithSomeone()){
            seatWithSomeone = true;
        }
        return seatWithSomeone;
    }
    
}
