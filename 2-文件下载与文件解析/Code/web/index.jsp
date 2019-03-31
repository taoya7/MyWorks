<%@ page import="java.sql.SQLOutput" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
  <head>
    <title>File DownLoad</title>
    <style>
      * {
        margin: 0;
        padding: 0;

      }
      html {
        font-family: "思源黑体 CN Medium";

      }
      .app {
        width:80%;
        margin:auto;
        margin-top:20px;
      }
      .app h1 {
        display: block;
        width:150px;
        height: 50px;
        text-align: center;
        padding:20px;
        color:white;
        background:black;
        -webkit-border-radius: 5px;
        -moz-border-radius: 5px;
        border-radius: 5px;
        margin-top:30px;
      }
    </style>
  </head>
  <body>

    <div class="app">
      <h1>文件解析 a</h1>
      <a href="Download/QQ.png">QQ.png</a><br>
      <a href="Download/星空.psd">星空.psd</a>


      <h1>文件下载</h1>
      <%--通过接受参数--%>
      <a href="Download?filename=QQ.png">QQ.png</a><br>
      <a href="Download?filename=星空.psd">星空.psd</a>
    </div>


  </body>
</html>
