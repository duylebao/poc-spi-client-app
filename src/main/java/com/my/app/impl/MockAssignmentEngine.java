package com.my.app.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.walmart.platform.exp.client.ae.context.IExpoAssignmentEngine;
import com.walmart.platform.exp.client.ae.context.model.AssignmentTreatment;
import com.walmart.platform.exp.client.ae.metadata.model.ExpoAssignmentMetadata;

public class MockAssignmentEngine implements IExpoAssignmentEngine{

    @SuppressWarnings("serial")
    @Override
    public Optional<AssignmentTreatment> getAssignmentTreatment(ExpoAssignmentMetadata expoAssignmentMetadata, String cid) throws Exception {
        AssignmentTreatment treatment = new AssignmentTreatment();
        treatment.setAssignments("clientvar1|clientvar2");
        Map<String, String> map = new HashMap<String,String>()
                {
                    {
                        put("color","pink");
                        put("size","29");
                    }
                };
        treatment.setTreatments(map);
        return Optional.of(treatment);
    }

}
