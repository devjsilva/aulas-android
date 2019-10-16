package br.senac.sp.l13.appheroephpmysql;

public class Api {

    //URL para acesso ao bando de dados WEB Service
    private static final String ROOT_URL = /*http://bb6bf03c.ngrok.io*/"http://10.0.0.106/HeroApi/v1/Api.php?apicall=";

    //Variáveis estáticas e globais para acesso os métodos no WEB Service

    public static final String URL_CREATE_HERO = ROOT_URL + "createhero";
    public static final String URL_READ_HEROES = ROOT_URL + "getheroes";
    public static final String URL_UPDATE_HERO = ROOT_URL + "updatehero";
    public static final String URL_DELETE_HERO = ROOT_URL + "deletehero&id=";
}
