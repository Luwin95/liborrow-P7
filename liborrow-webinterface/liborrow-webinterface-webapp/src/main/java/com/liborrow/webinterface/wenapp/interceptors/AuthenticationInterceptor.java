package com.liborrow.webinterface.wenapp.interceptors;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.liborrow.webinterface.generated.model.UserLight;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AuthenticationInterceptor implements Interceptor {
    public void destroy() {

    }

    public void init() {

    }

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
        HttpServletResponse response = ServletActionContext.getResponse();
        if(session != null && session.containsKey("sessionUser"))
        {
            UserLight user = (UserLight) session.get("sessionUser");
            if(user==null)
            {
            	return Action.LOGIN;
            }else{
                Action action = (Action) actionInvocation.getAction();
                return actionInvocation.invoke();
            }
        }else{
            return Action.LOGIN;
        }
    }
}
