public class Notes {

    // Stages
    // loading -- instantiation -- initialization -- handling request -- End

    // Servlet life cycle

    // Recall
    // Servlet -- interface
    // Servlets -- Backend web application component

    // init -- service -- destroy

    // U1 --> Amazon.com --> product p1 --> provided

    // U1 -> Amazon.com -> method m11() -> load -> instantiate -> initialize
    // request response --> service()
    // destroy() --> All threads in service is completed (or  lets say its dead)

    // Servlet interface -- Generic Servlet -- HttpServlet -- MyServlet

    // Servlet interface
    // init(ServletConfig)
    // service(Service Req, Servlet Resp)
    // destroy()
    // getServletConfig()
    // getServletInfo()

    //    GenericServlet any protocol allowed
    // init(ServletConfig)
    // service(ServletReq, ServletResponse)
    // destroy()
    // init()
    // getServletConfig()
    // getServletInfo
    // getServletContext()
    // getInitParameter()
    // getInitParameterName()

    // HttpServlet only http allowed
    // doGet(HttpServletReq, HttpServletResponse)
    // doPost(HttpServletReq, HttpServletResponse)
    // myMethod()

    // http://localhost:8081/MyWebProject/FirstJSPage.jsp
    // Protocol://Machine_nummber (Port umber)/Folder_Name/File_name

    // http methods
    // to do operations on a resource
    // get  -- Retrieval of data or resource
    // post -- To sign up thing to store stuff is post (Creation of resource)
    // put -- Existing user change email id phone number (Updation of resource)
    // delete -- Delete account (Remove resource)

    // doGet() -- To retrieve from resource
    // doPost() -- To create a resource

    // Web server or  web container or servlet container

    // import javax.servlet --> servlet, generic  servlet inside this
    // import javax.servlet.http --> for http servlets
    // GenericServlet is class and Servlet is interface

    // only during init or service
    // ServletException --
    // UnavailableException
    // IOException

    // Initialization usage interfaces ServletConfig and ServletInfo


}