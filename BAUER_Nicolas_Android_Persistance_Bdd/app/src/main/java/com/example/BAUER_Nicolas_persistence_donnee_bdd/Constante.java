package com.example.BAUER_Nicolas_persistence_donnee_bdd;

public class Constante {
    private static final String ROOT_URL = "http://localhost/webservice_users/php_files/";
    public static final String URL_REGISTER = ROOT_URL + "userRegister.php";
    public static final String URL_LOGIN = ROOT_URL + "userLogin.php";
    public static final String URL_USERLIST = ROOT_URL + "userList.php";
    public static final String URL_SEARCH = ROOT_URL + "userRequests.php";
    public static final String URL_UPDATE = ROOT_URL + "userUpdate.php";
    public static final String URL_DELETE = ROOT_URL + "userDelete.php";

    public static final String INTENT_USERNAME = "Username";
    public static final String INTENT_EMAIL = "Email";
    public static final String EXTRA_USER = "user";
}
