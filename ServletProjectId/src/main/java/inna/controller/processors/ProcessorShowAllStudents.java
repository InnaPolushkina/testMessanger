package inna.controller.processors;

import inna.model.ProcessorResult;
import inna.model.Student;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class ProcessorShowAllStudents extends Processor {

    public ProcessorShowAllStudents() {
        actionToPerform = "showAllStudents";
    }

    @Override
    public ProcessorResult process(HttpServletRequest request) {
        List<Student> listOfAllStudents = new ArrayList<>();
        listOfAllStudents.add(new Student(123,"inna","in62"));
        listOfAllStudents.add(new Student(555,"masha","in91"));
        request.getSession().setAttribute("listOfAllStudents",listOfAllStudents);
        return new ProcessorResult("pages/template","showAllStudents.jsp",true);
    }
}
