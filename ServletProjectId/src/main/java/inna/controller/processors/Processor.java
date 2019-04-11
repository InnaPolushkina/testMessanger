package inna.controller.processors;

import inna.model.ProcessorResult;

import javax.servlet.http.HttpServletRequest;

public abstract class Processor {
    protected String actionToPerform;

    public boolean canProcces(String action) {
        return actionToPerform.equals(action);
    }

    public abstract ProcessorResult process(HttpServletRequest request);
}
