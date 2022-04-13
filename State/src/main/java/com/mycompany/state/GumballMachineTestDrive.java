package com.mycompany.state;

import com.mycompany.state.GumballMachine;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballmachine = new GumballMachine(5);
        
        System.out.println(gumballmachine);
        

        gumballmachine.insertQuarter();
        gumballmachine.turnCrank();
        System.out.println(gumballmachine);
        

        gumballmachine.insertQuarter();
        gumballmachine.ejectQuarter();
        gumballmachine.turnCrank();
        System.out.println(gumballmachine);


        gumballmachine.insertQuarter();
        gumballmachine.turnCrank();
        gumballmachine.insertQuarter();
        gumballmachine.turnCrank();
        gumballmachine.ejectQuarter();
        System.out.println(gumballmachine);

        
        gumballmachine.insertQuarter();
        gumballmachine.insertQuarter();
        gumballmachine.turnCrank();
        gumballmachine.insertQuarter();
        gumballmachine.turnCrank();
        gumballmachine.insertQuarter();
        gumballmachine.turnCrank();

        System.out.println(gumballmachine);
    }

}
