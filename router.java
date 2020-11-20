<?php

/*
/-------------------------------------------------------------------------
/web routes
/-------------------------------------------------------------------------
/
/here is where you can register web routers for you application.these
/routers are loaded by the RouterSeerveProvided within a group which
/contains the "web" middlawer group.now create something great!
/
*/

route::get('/',function (){
    return view('welcome');
});
route::get('hallo',function(){
    return "hallo,selamat datang di tutorial laravel www.belajarbersama.com";
});
route::get('blog',function(){
    return view('blog');
});