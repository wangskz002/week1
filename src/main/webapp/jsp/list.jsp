<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wangskz002
  Date: 2019/12/2
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css">
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>

<html>
<head>
</head>
<body>
<form method="post" action="<%=path%>/update.do" enctype="multipart/form-data">
    <input type="file" name="photo" >

    <input type="submit" value="添加">
</form>

    <form method="post" id="z" action="<%=path%>/list.do" >

        <input type="hidden" name="pageNum">

    </form>

    <table>
        <tr>
            <th colspan="10">列表展示</th>

        </tr>
        <tr>
            <td>序号</td>
            <td>名字</td>
            <td>导演</td>
            <td>价格</td>
            <td>上映时间</td>
            <td>类型</td>
            <td>状态</td>
            <td>图片</td>
            <td>操作</td>

        </tr>
        <c:forEach items="${page.list}" var="e">

            <tr>
                <td>${e.id}</td>
                <td>${e.name}</td>
                <td>${e.author}</td>
                <td>${e.price}</td>
                <td>${e.startDate}</td>
                <td>${e.type}</td>
                <td>${e.status ? '正在热映':'已经下线'}</td>
                <td><img  height="50px" width="50px"  src="<%=path%>/looking.do?path=${e.picture}"></td>
                <td><a>详情</a><a href="<%=path%>/updateStatus.do?id=${e.id}">${e.status ? '下架':'上架'}</a><a>编辑</a></td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="10">
                <input type="button" value="首页" onclick="page(1)">
                <input type="button" value="上一页" onclick="page(${page.pageNum - 1 < 1  ?  1 : page.pageNum - 1})">
                <input type="button" value="下一页" onclick="page(${page.pageNum + 1 > page.pages  ?  page.pages : page.pageNum + 1})">
                <input type="button" value="尾页" onclick="page(${page.pages})">
            </td>
        </tr>
    </table>
</body>
<script type="text/javascript">
    function page(pageNum) {
        $("[name='pageNum']").val(pageNum)
        $("#z").submit()
    }

</script>
</html>
