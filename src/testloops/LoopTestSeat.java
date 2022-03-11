/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testloops;

/**
 *
 * @author Ivan
 */
public class LoopTestSeat {
    public boolean seatWithSomeone;
    public int seatIndex;

    public LoopTestSeat() {
    }

    public LoopTestSeat(boolean seatWithSomeone, int seatIndex) {
        this.seatWithSomeone = seatWithSomeone;
        this.seatIndex = seatIndex;
    }

    public boolean isSeatWithSomeone() {
        return seatWithSomeone;
    }

    public void setSeatWithSomeone(boolean seatWithSomeone) {
        this.seatWithSomeone = seatWithSomeone;
    }

    public int getSeatIndex() {
        return seatIndex;
    }

    public void setSeatIndex(int seatIndex) {
        this.seatIndex = seatIndex;
    }
    
    
    
    
}
