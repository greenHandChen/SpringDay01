<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Country查看</title>
</head>
<body>
<h1>Country列表</h1>
<table>
    <tr>
        <td>编号</td>
        <td>名字</td>
        <td>
            <button>增加</button>
        </td>
    </tr>
    <#list countryList as list>
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>
                <button>修改</button>
            </td>
            <td>
                <button>删除</button>
            </td>
        </tr>
    </#list>

</table>
</body>
</html>