package org.itstack.naive.chat.ui.view.login;

/**
 * 登陆视图，封装登陆事件与登录初始化类
 */
public class LoginView {
    private LoginInit loginInit;
    private ILoginEvent loginEvent;

    public LoginView(LoginInit loginInit, ILoginEvent loginEvent) {
        this.loginInit = loginInit;
        this.loginEvent = loginEvent;
    }

}
