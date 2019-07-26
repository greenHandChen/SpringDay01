<!DOCTYPE html>
<html>
<head></head>
<script src="../jquery-1.11.3.min.js"></script>
<body>
<h1>用户附加信息</h1>
<table>
    <tr>
        <td>ID</td>
        <td>名字</td>
        <td>年龄</td>
        <td>地址</td>
        <td>国籍</td>
    </tr>
    <#list extrList as list>
        <tr>
            <td>${list.id}</td>
            <td>${list.username}</td>
            <td>${list.age}</td>
            <td>${list.address}</td>
            <td>${list.countryName}</td>
        </tr>
    </#list>
</table>
</body>
</html>