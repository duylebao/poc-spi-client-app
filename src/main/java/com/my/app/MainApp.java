package com.my.app;

import java.util.Arrays;
import java.util.List;

import com.walmart.platform.exp.client.ae.context.model.AssignmentTreatment;
import com.walmart.platform.exp.smartcomm.client.ExpoAEClient;

public class MainApp {

    public static void main(String[] args) {
        try {
            ExpoAEClient client = ExpoAEClient.getInstance();
            List<String> cids = Arrays.asList(
                    "dle",
                    "other",
                    "expo"
                    );
            for (String cid : cids) {
                System.out.println();
                System.out.println("==============================================");
                System.out.println("cid: " + cid);
                System.out.println("==============================================");
                AssignmentTreatment treatment = client.getAssignmentTreatment(cid);
                System.out.println("assignments: " + treatment.getAssignments());
                System.out.println("treatments: " + treatment.getTreatments());
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }

    }

}
