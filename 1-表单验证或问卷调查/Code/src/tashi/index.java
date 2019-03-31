package tashi;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/index")
public class index extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); //设置编码
        resp.setStatus(200); //设置状态码


        String user = req.getParameter("user");
        String pwd = req.getParameter("pwd");
        System.out.println(user+"\t"+pwd); //打印前台返回的账号与密码

        /*
        * 只会返回前台的参数名字
        * */
        System.out.println("--------------------------------------------------");
        Enumeration<String> parameterNames = req.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            System.out.println(name);
        }


        /*
        *
        *
        *  1. System.out.println(entry.getKey());  返回参数名字
        *  2. System.out.println(Arrays.toString(entry.getValue()));   返回参数值
         * */
        System.out.println("--------------------------------------------------");
        Map<String, String[]> parameterMap = req.getParameterMap();


        for(Map.Entry<String,String[]>entry: parameterMap.entrySet()){
            System.out.println(entry.getKey()+"---"+Arrays.toString(entry.getValue()));
        }



    }
}
