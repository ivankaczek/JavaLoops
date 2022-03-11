/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testloops;

import java.util.ArrayList;
import testloops.services.TestLoopsServices;

/**
 *
 * @author Ivan
 */
public class TestLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<LoopTestSeat> seats = new ArrayList();
        
        LoopTestSeat seat01 = new LoopTestSeat(true, 1);
        LoopTestSeat seat02 = new LoopTestSeat(true, 1);
        LoopTestSeat seat03 = new LoopTestSeat(true, 2);
        LoopTestSeat seat04 = new LoopTestSeat(true, 3);
        LoopTestSeat seat05 = new LoopTestSeat(false, 4);
        LoopTestSeat seat06 = new LoopTestSeat(false, 5);
        seats.add(seat01);
        seats.add(seat02);
        seats.add(seat03);
        seats.add(seat04);
        seats.add(seat05);
        seats.add(seat06);
        
        TestLoopsServices serv = new TestLoopsServices();
        //serv.test3times(seats);
        
        serv.test3timesStopWhenEmptySeatFound(seats);
        
        int counter = 1;
        boolean keepGoing = true;
        
        
        
        
        
        
        
        
    }
    
}
