package myservlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Hashtable;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@WebServlet({"/trial1"})
public class TrialServlet1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String tempS="";
        tempS = tempS + "<html><body><center><h1>trial1</h1></center>";
        //tempS = tempS + "<br>" + testRecipeServerName();
        tempS = tempS + "</body></html>";

	    try {
	        response.getOutputStream().write(tempS.getBytes(Charset.forName("UTF-8")));
	    } catch (Exception e) {
		    response.getOutputStream().print("Something went wrong! : " + e.getMessage());
		    return;
	    }		      
    }

    // org.openrewrite.java.liberty.ServerName
    private String testRecipeServerName() {
        String serverEnv = "";
        serverEnv += System.getProperty("wlp.server.name");
        serverEnv += " / ";
        serverEnv += System.getProperty("wlp.server.name");
        return serverEnv;
    }

    // org.openrewrite.java.liberty.WebSphereUnavailableSSOMethods
    private void testRecipeWebSphereUnavailableSSOMethods() {
        HttpServletRequest request=null;
        HttpServletResponse response=null;
        try {
            request.logout();
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }

    // org.openrewrite.java.liberty.RemoveWas2LibertyNonPortableJndiLookup
    private void testRecipeRemoveWas2LibertyNonPortableJndiLookup() {
        Hashtable ht = new Hashtable();
        ht.put("valid", "valid");
        try {
            InitialContext ctx = new InitialContext(ht);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }    
}

