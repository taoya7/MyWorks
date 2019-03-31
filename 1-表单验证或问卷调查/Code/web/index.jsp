<%@ page import="java.sql.SQLOutput" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
  <head>
    <title>Login</title>
    <style>
      * {
        margin: 0;
        padding: 0;

      }
      html {
        font-family: "思源黑体 CN Medium";

      }
      .login {
        width:600px;
        height:250px;
        margin:auto;
      }
      button {
        width:64px;
        height: 36px;
        background:gold;
        outline: none;
        border:none ;
        font-weight: bold;
      }
      .form {
        width:600px;
        margin:auto;
      }
    </style>
  </head>
  <body>
  <div class="login">
    <form action="/index" method="post">
      <table width="500" height="150">
        <tr >
          <td>用户名: </td>
          <td><input type="text" name="user"></td>
        </tr>
        <br/>
        <tr>
          <td>密码: </td>
          <td><input type="password" name="pwd"></td>
        </tr>
        <tr>
          <td><button type="submit">登陆</button></td>
        </tr>
      </table>
    </form>
  </div>

  <div class="form">
    <form action="index" method="post">
      你的性别：
      <input type="radio" name="sex" value="male">男
      <input type="radio" name="sex" value="famale">女 <br/><br/>

      你喜欢的水果
      <input type="checkbox" name="fruit" value="apple">苹果
      <input type="checkbox" name="fruit" value="banana">香蕉
      <input type="checkbox" name="fruit" value="pear">梨
      <input type="checkbox" name="fruit" value="peach">桃子 <br/><br/>

      你的家乡
      <select name="from">
        <option value="1">山西</option>
        <option value="2">北京</option>
        <option value="2">上海</option>
      </select> <br><br>

      
      您的评价 <br>
      <textarea name="evaluate" cols="35" rows="5"></textarea> <br><br>

      手机号：
      <input type="text" name="phone"> <br><br>

      <button type="submit">提交</button>
    </form>
  </div>

  </body>
</html>
