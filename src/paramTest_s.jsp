<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
   <head>
      <title>Accessing Request Parameters</title>	
 </head>
<body>
      <%@ taglib uri="http://java.sun.com/____/____/core" prefix="c"%>

      <%-- Access the lastName, firstName and subject by name --%>
      <c:out value='${param.____}'/>, 
      <c:out value='${____.____}'/> is learning
      <c:out value='${____.____}'/> by
      <%-- paramValues.methods is a String [] of values --%>
      <c:forEach var='method' items='${paramValues.____}'>
          <c:out value='${____}'/>   
      </c:forEach>
   </body>
</html>
