package org.itstack.naive.chat.ui.view.login;

/**
 * 窗体事件接口类
 * 事件方法里提供了登陆所需的参数，用户ID、用户密码，如果是实际业务开发还会需要传递；IP地址、设备信息、请求时间等信息，用于判断是否正常登陆
 */
public interface ILoginEvent {
    /**
     * 登陆验证
     * @param userId        用户ID
     * @param userPassword  用户密码
     */
    void doLoginCheck(String userId, String userPassword);
}
