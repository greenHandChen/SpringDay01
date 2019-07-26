<!DOCTYPE html>
<html>
<head>
</head>
<body>
    <table>
        <tr>
        <td>
            用户Id
        </td>
        <td>
            姓名
        </td>
        <td>
            性别
        </td>
        </tr>
        <#list testList as list>
        <tr>
            <td>${list.userId}</td>
            <td>${list.userName}</td>
            <td>${list.userSex}</td>
        </tr>
         </#list>

    </table>

</body>
</html>