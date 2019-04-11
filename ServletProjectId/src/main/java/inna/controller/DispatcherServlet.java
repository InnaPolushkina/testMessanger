package inna.controller;

import inna.controller.processors.Processor;
import inna.controller.processors.ProcessorMainPage;
import inna.model.ProcessorResult;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class DispatcherServlet extends HttpServlet {

    private List<Processor> listOfProcessors = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        super.init();
        listOfProcessors.add(new ProcessorMainPage());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request,response);
    }
    private void process(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        PrintWriter printWriter = response.getWriter();
        String action = request.getParameter("action");
       try {
            printWriter.println("<html>");
            printWriter.println("<body>");
            printWriter.println("<p>Hello world!!!</p>");
            printWriter.println("<p>action: " + action + "</p>");
        }
        finally {
            printWriter.println("</body>");
            printWriter.println("</html>");
        }
        /*
        for (Processor processor:listOfProcessors
             ) {
            if(processor.canProcces(action)) {
                ProcessorResult result = processor.process(request);
                if (result.getIncludedPage() != null) {
                    request.getSession().setAttribute("includedPage",result.getIncludedPage());
                }

                if (result.isForward()) {
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher(result.getUrl());
                    requestDispatcher.forward(request,response);
                }
                else {
                    response.sendRedirect(result.getUrl());
                }
            }
        }*/


    }
}
