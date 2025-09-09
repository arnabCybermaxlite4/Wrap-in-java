package com.company;
// This class is a placeholder for the cellPhone class.
class cellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }
    public void vibrate() {
        System.out.println("Vibrating...");
    }
    public void callFriend() {
        System.out.println("Calling a friend...");
    }
}
public class L26_OPPS_PQ83_cellPhone {
    public static void main(String[] args) {
        // Create an instance of the cellPhone class
        cellPhone myPhone = new cellPhone();
        // Call methods on the cellPhone instance
        myPhone.ring();
        myPhone.vibrate();
        myPhone.callFriend();
    }
}
