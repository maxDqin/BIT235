<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
   <head>
      <title>Accessing Request Parameters</title>	
 </head>
<body>
      <%@ taglib uri="http://java.sun.com/____/____/core" prefix="c"%>

      <font size='5'>
         Learning hours for:
      </font>

      <%-- Access the lastName and firstName request parameters
           parameters by name --%>
      <c:out value='${param.____}'/>, 
      <c:out value='${____.____}'/> on
      <c:out value='${____.____}'/>

      <%-- Show all request parameters and their values --%>
      <p><font size='5'>All Request Parameters: </font><p>
      
      <%-- For every String[] item of paramValues... --%>
      <c:forEach var='parameter' items='${____}'> 
         <ul>
            <%-- Show the key, which is the request parameter name --%>
            <li><b><c:out value='${____.key}'/></b>:</li>

            <%-- Iterate over the values -- a String[] -- 
                 associated with this request parameter --%>
            <c:forEach var='value' items='${parameter.value}'>
               <%-- Show the String value --%>
               <c:out value='${____}'/>   
            </c:forEach>
         </ul>
      </c:forEach>
   </body>
</html>