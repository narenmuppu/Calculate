<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleTestCalculateProxyid" scope="session" class="DefaultNamespace.TestCalculateProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleTestCalculateProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleTestCalculateProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleTestCalculateProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        DefaultNamespace.TestCalculate getTestCalculate10mtemp = sampleTestCalculateProxyid.getTestCalculate();
if(getTestCalculate10mtemp == null){
%>
<%=getTestCalculate10mtemp %>
<%
}else{
        if(getTestCalculate10mtemp!= null){
        String tempreturnp11 = getTestCalculate10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String a_1id=  request.getParameter("a16");
        int a_1idTemp  = Integer.parseInt(a_1id);
        String b_2id=  request.getParameter("b18");
        int b_2idTemp  = Integer.parseInt(b_2id);
        int add13mtemp = sampleTestCalculateProxyid.add(a_1idTemp,b_2idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(add13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 20:
        gotMethod = true;
        String a_3id=  request.getParameter("a23");
        int a_3idTemp  = Integer.parseInt(a_3id);
        String b_4id=  request.getParameter("b25");
        int b_4idTemp  = Integer.parseInt(b_4id);
        int subtract20mtemp = sampleTestCalculateProxyid.subtract(a_3idTemp,b_4idTemp);
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(subtract20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
break;
case 27:
        gotMethod = true;
        String a_5id=  request.getParameter("a30");
        int a_5idTemp  = Integer.parseInt(a_5id);
        String b_6id=  request.getParameter("b32");
        int b_6idTemp  = Integer.parseInt(b_6id);
        int multiply27mtemp = sampleTestCalculateProxyid.multiply(a_5idTemp,b_6idTemp);
        String tempResultreturnp28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(multiply27mtemp));
        %>
        <%= tempResultreturnp28 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>