<%--
  Created by IntelliJ IDEA.
  User: wangyu
  Date: 2019/3/21
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/pages/common/head.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <script src="${basepath}/js/jquery.min.js"></script>
    <script>
        $(function(){
            let a ;
            $.ajax({
                "url":"${basepath}/good/ajax",
                "type":"get",
                "data":{"id":100},
                "async":false,
                "dataType":"text",
                "success":function(result){
                    a=result;
                }
            });
            alert(a);
        })
    </script>
</body>
</html>

