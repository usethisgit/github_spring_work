<%@page language="java" %>

<html>
    <head>
    <h1>welcome to the Alien world</h>
        <link rel="stylesheet" type="text/css" href="styles.css">
    </head>
    </body>

<!--     using plain Java -->
   <!--     <h2>Result is:<%= session.getAttribute("result") %></h2> -->


       <!--  using jstl tags -->
    <!--     <h2>Result is: ${result}  </h2>    -->
    <p> ${alien} </p>

    </body>
</html>