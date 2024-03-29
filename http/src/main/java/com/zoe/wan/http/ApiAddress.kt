package com.zoe.wan.http

object ApiAddress {

    //首页文章
    const val Article_List = "article/list/"

    //首页置顶文章
    const val Top_Article_List = "article/top/json"

    //首页banner数据
    const val Home_Banner = "banner/json"

    //常用网站
    const val Common_Use_Website = "friend/json"

    //搜索热词
    const val Search_Hot_Key = "hotkey/json"

    //知识体系数据
    const val Knowledge_List = "tree/json"

    //登录
    const val Login = "user/login"

    //注册
    const val Register = "user/register"

    //登出
    const val Logout = "user/logout/json"


    /**
     * 首页文章列表
     */
    fun getArticleList(pageCount: Int): String {
        return "article/list/$pageCount/json"
    }
}
