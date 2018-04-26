package com.my.app;

import com.walmart.platform.exp.client.ae.context.model.AssignmentTreatment;
import com.walmart.platform.exp.smartcomm.client.ExpoAEClient;

public class MainApp {

    public static void main(String[] args) {
        try {
            ExpoAEClient client = ExpoAEClient.getInstance();
            AssignmentTreatment treatment = client.getAssignmentTreatment("dle");
            System.out.println("assignments: " + treatment.getAssignments());
            System.out.println("treatments: " + treatment.getTreatments());
        } catch (Throwable t) {
            t.printStackTrace();
        }

    }

}
