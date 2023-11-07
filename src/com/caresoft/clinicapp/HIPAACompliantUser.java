package com.caresoft.clinicapp;

public interface HIPAACompliantUser {
	abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
    
    default void tenCount() {
    	for(int i = 1; i < 11; i++) {
    		System.out.println(i);
    	}
    }
}
