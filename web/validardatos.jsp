<%-- 
    Document   : validardatos
    Created on : 15/11/2019, 04:03:37 PM
    Author     : jbermudezb
--%>

<%@page import="webLogin1.pkgmenu.admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        admin p = new admin();

        p.setUsuario(request.getParameter("usuario"));
        p.setcontrasena(request.getParameter("contrasena"));

        if ( p.getUsuario().equals("admin") && p.getcontrasena().equals("qwe") ) {
            out.print("entraste clic aqui para entrar");
    %>
    <a href="menu.jsp">entrar ya</a>
    <%
        } else {
            out.print("fallo la autentificacion ");
        }
    %>
</html>
