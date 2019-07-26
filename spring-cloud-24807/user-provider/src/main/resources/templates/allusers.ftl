<!DOCTYPE html>
<html>
<head></head>
<script src="../jquery-1.11.3.min.js"></script>
<body>
<h1>用户列表</h1>
<table>
    <tr>
        <td>ID</td>
        <td>名字</td>
        <td>年龄</td>
        <td>地址</td>
        <td>
            <a href="/users/addUser">新增</a>
        </td>
    </tr>
    <#list userList as list>
        <tr>
            <td>${list.id}</td>
            <td>${list.username}</td>
            <td>${list.age}</td>
            <td>${list.address}</td>
            <td>
                <a href=javascript:del(${list.id})>删除</a>
                <a href="/users/updateUser/">修改</a>
            </td>
        </tr>
    </#list>
</table>
<#--<form method="post" id="formId">-->
<#--    <input type="hidden" name="_method" value="DELETE">-->
<#--</form>-->
<#--<script>-->
<#--    function del(id){-->
<#--        $("#formId").prop("action","/deleteUser?id="id);-->
<#--        $("#formId").submit();-->
<#--    }-->
<#--</script>-->
</body>
</html>