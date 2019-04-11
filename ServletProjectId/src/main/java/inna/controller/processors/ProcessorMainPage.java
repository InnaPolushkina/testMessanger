package inna.controller.processors;

import inna.model.ProcessorResult;

import javax.servlet.http.HttpServletRequest;
import java.util.Properties;

public class ProcessorMainPage extends Processor {

    public ProcessorMainPage() {
        actionToPerform = "mainPage";
    }

    @Override
    public ProcessorResult process(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        request.getSession().setAttribute("userName",userName);

        return new ProcessorResult("pages/template",null,true);
    }
}
