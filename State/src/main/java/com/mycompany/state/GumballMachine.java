package com.mycompany.state;

public class GumballMachine {
    
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    
    State state;
    
    int count = 0;
    
    public GumballMachine(int numberGumball) {
        soldOutState =  new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        
        this.count = numberGumball;
        if (numberGumball > 0) {
            state = noQuarterState;
            
        } else {
            state = soldOutState;
        }
    }
    
    public void insertQuarter() {
        state.insertQuarter();
    }
    
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count = count - 1;
            
        }
    }
    
     int getCount() {
        return count;
    }
    
    void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was refilled; its new count is:" + this.count);
        state.refill();
    }
    
    public State getSoldOutState() {
        return soldOutState;
    }
    
    public State getNoQuarterState() {
        return noQuarterState;
    }
    
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    
    public State getSoldState() {
        return soldState;
    }
    
    public State getState() {
        return state;
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + "gumball");
        if (count != 1) {
            result.append("s");
            
        }
result.append("\n");
result.append("\nMachine is: "+ state +"\n");
return result.toString();
        
    }
    
}
