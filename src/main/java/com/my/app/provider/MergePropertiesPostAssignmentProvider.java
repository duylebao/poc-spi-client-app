package com.my.app.provider;

import java.util.Properties;
import java.util.stream.Collectors;
import com.my.app.util.ConfigurationLoader;
import com.walmart.platform.exp.client.ae.context.Context;
import com.walmart.platform.exp.client.ae.context.IPostAssignment;
import com.walmart.platform.exp.client.ae.context.model.AssignmentTreatment;

public class MergePropertiesPostAssignmentProvider implements IPostAssignment{

    @Override
    public void execute(AssignmentTreatment treatment, Context ctx) {
        Properties defaultProps = ConfigurationLoader.load();
        treatment.getTreatments().putAll(
                defaultProps.entrySet().stream()
                .filter( e -> !treatment.getTreatments().containsKey(e.getKey()))
                .collect(Collectors.toMap(e -> e.getKey().toString(), e -> e.getValue().toString())));
        
    }

}
