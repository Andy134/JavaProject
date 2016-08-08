<%-- 
    Document   : header
    Created on : Aug 8, 2016, 9:37:58 AM
    Author     : TuanAnh
--%>
<%@page import="java.util.List"%>
<%@page import="com.lottery.model.Category"%>
<%@page import="com.lottery.service.CategoryServiceImpl"%>
<%@page import="com.lottery.service.CategoryService"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    CategoryService catService = new CategoryServiceImpl(null);
    List<Category> listCat = catService.findAll();
    pageContext.setAttribute("listCat", listCat);
    catService.refreshConnectionPool();
%>

<header class="">
    <div class="wrap">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/vi">
                        <img style="width: 168px" src="Content/images/maxtoto-02.png" alt="">
                    </a>
                </div>
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav main-menu">

                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <li class="active">
                            <a href="index.jsp">
                                <i class="icon-home"></i>
                            </a>
                        </li>
                        <c:forEach items="${listCat}" var="category">
                            <li class="dropdown mn-play "><a href="#" class="dropdown-toggle">${category.catName}</a><a href="#" class="ico-switch"></a>
                                <div class="dropdown-menu">
                                    <div class="sub-mn-list col-xs-12 col-md-3"><h4><a href="/vi/choi/mega-6-45">Mega 6/45</a></h4>
                                        <ul>
                                            <li><a href="/vi/choi/mega-6-45/dieu-kien-du-thuong"><i class="icon-arrow-right"></i> Điều kiện dự thưởng</a>
                                            </li>
                                        </ul>
                                        <ul>
                                            <li><a href="/vi/choi/mega-6-45/cach-choi"><i class="icon-arrow-right"></i> Cách chơi</a></li>
                                        </ul>
                                        <ul>
                                            <li><a href="/vi/choi/mega-6-45/gia-tri-du-thuong"><i class="icon-arrow-right"></i> Giá trị giải thưởng</a></li>
                                        </ul>
                                        <ul>
                                            <li><a href="/vi/choi/mega-6-45/co-cau-giai-thuong"><i class="icon-arrow-right"></i> Cơ cấu giải thưởng</a></li>
                                        </ul>
                                        <ul>
                                            <li><a href="/vi/choi/mega-6-45/cau-hoi-thuong-gap"><i class="icon-arrow-right"></i> Câu hỏi thường gặp</a></li>
                                        </ul>
                                        <ul>
                                            <li><a href="/vi/choi/mega-6-45/the-le-tham-gia-du-thuong"><i class="icon-arrow-right"></i> Thể lệ  tham gia dự thưởng</a></li>
                                        </ul>
                                    </div>
                                    <div class="sub-mn-spotlight col-xs-12 col-md-9">
                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                                <div class="media">
                                                    <img src="Content/images/space.gif" class="media-object" style="background-image: url('Content/images/MMM.png'" alt="">
                                                    <div class="media-body">
                                                        <h4 class="media-heading">
                                                            <a href = "/vi/choi/mega-6-45/dieu-kien-du-thuong"> Điều kiện dự thưởng</a>
                                                        </h4>
                                                        <p>Quy định các đối tượng được phép tham gia dự thưởng.</p>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xs-12 col-md-6">
                                                <div class="media">
                                                    <div class="media-left">
                                                        <a href = "/vi/choi/mega-6-45/cach-choi">
                                                            <img src="Content/images/space.gif" class="media-object" style="background-image: url('http://static.vietlott.vn/uploads/public/7472616E74686973756F6E67Images/2016/Choi/bn-r-11.jpg'" alt="">
                                                        </a>
                                                    </div>
                                                    <div class="media-body">
                                                        <h4 class="media-heading">
                                                            <a href = "/vi/choi/mega-6-45/cach-choi"> Cách chơi</a>
                                                        </h4>
                                                        <p>Hướng dẫn cách thức tham gia dự thưởng một hoặc nhiều bộ số (chơi bao)</p>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xs-12 col-md-6">
                                                <div class="media">
                                                    <div class="media-left">
                                                        <a href = "/vi/choi/mega-6-45/gia-tri-du-thuong">
                                                            <img src="Content/images/space.gif" class="media-object" style="background-image: url('http://static.vietlott.vn/uploads/public/7472616E74686973756F6E67Images/xs_ma_tran_2.png'" alt="">
                                                        </a>
                                                    </div>
                                                    <div class="media-body">
                                                        <h4 class="media-heading">
                                                            <a href = "/vi/choi/mega-6-45/gia-tri-du-thuong"> Giá trị dự thưởng</a>
                                                        </h4>
                                                        <p>Giá trị tham gia dự thưởng tương ứng với số lượng số được chọn (1 hay nhiều...</p>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xs-12 col-md-6"><div class="media">
                                                    <div class="media-left">
                                                        <a href = "/vi/choi/mega-6-45/co-cau-giai-thuong">
                                                            <img src="Content/images/space.gif" class="media-object" style="background-image: url('http://static.vietlott.vn/uploads/public/7472616E74686973756F6E67Images/2016/Choi/gia%20tri%20giai%20thuong.jpg'" alt="">
                                                        </a>
                                                    </div>
                                                    <div class="media-body"><h4 class="media-heading">
                                                            <a href = "/vi/choi/mega-6-45/co-cau-giai-thuong"> Cơ cấu giải thưởng</a>
                                                        </h4>
                                                        <p>Giá trị các giải thưởng và tỷ lệ trả thưởng tương ứng.</p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </c:forEach>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="search">
                            <a href="#"></a>
                        </li>
                        <li class="dropdown">
                            <a href="/en/"><img src="Content/images/ico-en.png" alt=""></a>
                        </li>
                        <li>
                            <a href="#" data-toggle="modal" data-target="#register-modal">Đăng ký</a>
                        </li>
                        <li>
                            <a href="#" data-toggle="modal" data-target="#login-modal">Đăng nhập</a>
                        </li>
                    </ul>

                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container-fluid -->
        </nav>
    </div>
</header>
