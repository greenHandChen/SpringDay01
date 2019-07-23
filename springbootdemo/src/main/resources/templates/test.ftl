<DOCTYPE html >
<html>
<head></head>
<body>
<h2>用户列表</h2>
<table>
<tr>
    <td>
用户ID
</td>
<td>
姓名
</td>
<td>
性别
</td>
</tr>
<#list testList as list>
<td>${list.userId}</td>
    <td>${list.userName}</td>
    <td>${list.userSex}</td>
</tr>
    </#list>
</table>
