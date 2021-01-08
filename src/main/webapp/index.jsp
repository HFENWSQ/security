<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <h2>Hello World!</h2>
    <a href="/user/selectUserByName?uname=王五">根据名字查询用户</a><br>
    <a href="/login/into?uname=李四&&upassword=12345">登陆</a><br>
    <a href="/login/changePassword?uname=李四&&old_upassword=123&&new_upassword=12345">修改密码</a><br>
    <form action="/login/register" method="post">
        用户名：<input type="text" name="uname">
        密码：<input type="password" name="upassword">
        手机：<input type="text" name="utelephone">
        <input type="submit" value="注册">
    </form><br>
    <a href="/personManage/selectAll?Page_number=1">分页查询所有人员</a><br>
    <a href="/personManage/selectLike?Page_number=1&search_info=三">分页通过用户名模糊查询</a><br>
    <form action="/personManage/addPers" method="post">
        用户名：<input type="text" name="uname">
        密码：<input type="password" name="upassword">
        权限：<input type="text" name="uright">
        <input type="submit" value="添加人员">
    </form><br>
    <form action="/personManage/updatePers" method="post">
        id:<input type="text" name="uid">
        用户名：<input type="text" name="uname">
        密码：<input type="password" name="upassword">
        权限：<input type="text" name="uright">
        <input type="submit" value="修改人员">
    </form><br>
    <a href="/personManage/deletePers?uid=上海市退货">删除人员</a><br>

    <a href="/devMana/selectAllDev?Page_number=1">查询所有设备</a><br>
    <a href="/devMana/selectLileDev?Page_number=1&search_info=2">分页通过设备名模糊查询</a><br>
    <form action="/devMana/addDev" method="post">
        设备名：<input type="text" name="dname">
        设备状态：<input type="text" name="dstate">
        设备类型：<input type="text" name="dtid">
        <input type="submit" value="添加设备">
    </form><br>

    <form action="/devMana/updateDev" method="post">
        id:<input type="text" name="did">
        设备名：<input type="text" name="dname">
        设备状态：<input type="text" name="dstate">
        设备类型：<input type="text" name="dtid">
        <input type="submit" value="修改设备">
    </form><br>

    <a href="/devMana/deleteDev?did=1">删除设备</a><br>
</body>
</html>
