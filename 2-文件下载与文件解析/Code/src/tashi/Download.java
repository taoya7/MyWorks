package tashi;

import org.apache.coyote.Request;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import sun.misc.*;

@WebServlet("/Download")
public class Download extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        *   接受来自浏览器的文件信息
        * */
        //接受文件参数
        String filename = req.getParameter("filename");

        /*
        * 解决中文乱码问题
        * */
//        byte[] name = filename.getBytes("ISO8859-1");
//        filename = new String(name, "UTF-8");
//        System.out.println(filename);

        //设置mimeType
        String mimeType = this.getServletContext().getMimeType(filename);
        resp.setContentType(mimeType);

        /*
        *   以附件形式加载|下载
        * */
        String agent = req.getHeader("User-Agent"); //获取客户端信息
        String filenameEncoder = "";


        if(agent.contains("MSIE")){
            /*IE*/
            filenameEncoder = URLEncoder.encode(filename, "UTF-8");
            filenameEncoder = filename.replace("+", " ");
        } else {
            filenameEncoder = URLEncoder.encode(filename, "UTF-8");
        }
        resp.setHeader("Content-Disposition", "attachment;filename="+filenameEncoder);

        /*
        *   加载文件响应给浏览器
        * */

        //根据文件名拼接路径
        String path = this.getServletContext().getRealPath("Download/" + filename);
        System.out.println(path);

        //加载文件
        FileInputStream in = new FileInputStream(path);

        // 获取响应输出
        ServletOutputStream out = resp.getOutputStream();

        byte[] buffer = new byte[1024];
        int len = 0;
        while( (len = in.read(buffer))!= -1){
            //响应
            out.write(buffer, 0, len);
        }

        //关闭文件
        in.close();

    }
}
