package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	private int IDcopy;
	
	// TO DO: Constructor that takes an IDcopy
	public Physician(int IDcopy) {
		this.IDcopy = IDcopy;
	}
	
    // TO DO: Implement HIPAACompliantUser!
	public boolean assignPin(int pin) {
		String pind = Integer.toString(pin);
		if(pind.length() != 4) {
			return false;
		}
		return true;
	}
	
	public boolean accessAuthorized(Integer confirmedAuthID) {
    	if(this.IDcopy != confirmedAuthID) {
    		return false;
    	}
    	return true;
    }
	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	// TO DO: Setters & Getters
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

	public int getIDcopy() {
		return IDcopy;
	}

	public void setIDcopy(int iDcopy) {
		IDcopy = iDcopy;
	}
	
}
