/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

/**
 *
 * @author mthoming
 */
public class ApplicationController {

    public String process(RequestContext requestContext) {
        String view = null;
        Command command = null;
        CommandHelper commandHelper = null;

        commandHelper = new CommandHelper();
        command = commandHelper.getCommand(requestContext.getRequestUri());
        view = command.execute(requestContext);

        return view;
    }

    public String mapViewToPage(String view) {
        String page = null;
        if (view != null) {
            page = "viewStudent.jsp";
        }

        return page;
    }
}