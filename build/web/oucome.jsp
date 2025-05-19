<%-- 
    Document   : oucome
    Created on : Mar 2, 2025, 9:01:30 AM
    Author     : Zanele
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Outcome</h1>
        
        <%
        
                    String playerName = pageContext.getServletContext().getInitParameter("player_name");
                    String computerName = pageContext.getServletContext().getInitParameter("computer_name");
                  
                    Character playerChoice = (Character) request.getAttribute("playerChoice");
                    Character computerChoice = (Character) request.getAttribute("computerChoice");
                    
                   
                    String outcome = request.getAttribute("outcome").toString();

            
        %>
        
        <p>
            Below is the game outcome:
        </p>
        
        <table>
           
           
                <tr>
                    <td><b><%=playerName%></b></td>
                    <td><%=playerChoice%></td>
                </tr>
                <tr>
                    <td><b><%=computerName%></b></td>
                    <td><%=computerChoice%></td>
                </tr>
                
                 <tr>
                    <td><b>OUTCOME:</b></td>
                    <td><%=outcome%></td>
                </tr>
         
        </table>

                
                <p>
                    Please click <a href="index.html">here</a> to go back to the main page or
                    <a href="start.jsp">here</a> to continue playing.
                </p> 
    </body>
</html>
