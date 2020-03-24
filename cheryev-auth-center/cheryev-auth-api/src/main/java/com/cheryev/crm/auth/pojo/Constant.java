package com.cheryev.crm.auth.pojo;

/**
 * ��������
 * Created by fp295 on 2018/4/16.
 */
public class Constant {

    public static String USER_INFO = "user_info";
    public static String OAUTH_TYPE_CLIENT = "client_type";
    public static String OAUTHORITIES = "authorities";
    public static String OAUTH_CLIENT_ID = "client_id";

    public enum CLIENT_TYPE{

        OAUTH_TYPE_CLIENT("client"),
        OAUTH_TYPE_USER("user");

        private CLIENT_TYPE(String value) {
            this.value = value;
        }

        private final String value;

        public String getValue() {
            return value;
        }

    }

    //��Դģ�����ͷ���
    public static String MODULE_REPSPIRCES_TYPE_MENU = "1";
    public static String MODULE_REPSPIRCES_TYPE_OPERATION = "2";
    public static String MODULE_REPSPIRCES_TYPE_API = "3";


}
