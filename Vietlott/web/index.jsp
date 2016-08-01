<%-- 
    Document   : index
    Created on : Jul 25, 2016, 3:48:10 PM
    Author     : tuananh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="vi">
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,requiresActiveX=true"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
        <meta http-equiv="content-language" content="vi"/>
        <title>Vietlott</title>
        <meta name="keywords" content="Vietlott"/>
        <meta name="description" content="Vietlott"/>
        <meta name="robots" content="index, follow"/>
        <meta name="msvalidate.01" content=""/>
        <meta name="google-site-verification" content=""/>
        <!--<link rel="canonical" href="http://vietlott.vn/"/>-->
        <!--<link rel="apple-touch-icon-precomposed" href="/content/frontend/images/favicon.png"/>-->
        <link rel="shortcut icon" href="Content/images/ico-vietlott-red.png" type="image/png">
        <!--<meta property="og:url" content="http://vietlott.vn:8001/"/>-->
        <meta property="og:title" content="Lottery"/>
        <meta property="og:description" content="Lottery"/>
        <meta property="og:image" content="/Content/logo-vietlott.png" />
        <meta property="og:image:type" content="image/png">
        <meta property="og:image:width" content="500">
        <meta property="og:image:height" content="300">

        <meta name="author" content=""/>

        <link href="Content/css/bootstrap.min.css" rel="stylesheet"/>
        <link href="Content/css/styles.css" rel="stylesheet"/>
        <link href="Content/css/fonts.css" rel="stylesheet"/>
        <link href="Content/css/font-awesome.css" rel="stylesheet"/>
        <link href="Content/css/jquery.bxslider.css" rel="stylesheet"/>
        <link href="Content/css/jquery.fancybox-1.3.4.css" rel="stylesheet"/>
        <link href="Content/css/media-gallery.css" rel="stylesheet"/>
        <link href="Content/css/bootstrap-datetimepicker.css" rel="stylesheet"/>
        <link href="Content/css/Site.css" rel="stylesheet"/>
        <link href="Content/css/FrontEnd_Style.css" rel="stylesheet"/>

        <script>
            if (localStorage.getItem("no_responsive") === "1") {
                document.write('<link rel="stylesheet" href="Content/css/no-responsive.css" type="text/css" rel="stylesheet" title="no-responsive">');
            } else {
                document.write('<link href="Content/css/responsive.css" type="text/css" rel="stylesheet" title="responsive"/>');
            }
        </script>
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,300,300italic,400italic,500,500italic,700,700italic,900,900italic&amp;subset=latin,vietnamese" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script type="text/javascript" src="Content/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="Content/js/jwplayer.js"></script>
        <script type="text/javascript" src="Content/js/jwplayer.html5.js"></script>
        <script type="text/javascript"> jwplayer.key = "00Win0HZgpRm83NOGX2kFLYB/rEN6pi6U8bSteMKbb4=";</script>
        <script>
            (function (i, s, o, g, r, a, m) {
                i['GoogleAnalyticsObject'] = r;
                i[r] = i[r] || function () {
                    (i[r].q = i[r].q || []).push(arguments)
                }, i[r].l = 1 * new Date();
                a = s.createElement(o),
                        m = s.getElementsByTagName(o)[0];
                a.async = 1;
                a.src = g;
                m.parentNode.insertBefore(a, m)
            })(window, document, 'script', 'https://www.google-analytics.com/analytics.js', 'ga');

            ga('create', 'UA-42453093-1', 'auto');
            ga('send', 'pageview');

            ga('create', 'UA-80724070-1', 'auto', {'name': 'vtcxoso'});
            ga('vtcxoso.send', 'pageview');

            ga('create', 'UA-78686214-4', 'auto', {'name': 'vtcptcn'});
            ga('vtcptcn.send', 'pageview');
        </script>
        <!-- Facebook Pixel Code -->
        <script>
            !function (f, b, e, v, n, t, s) {
                if (f.fbq)
                    return;
                n = f.fbq = function () {
                    n.callMethod ?
                            n.callMethod.apply(n, arguments) : n.queue.push(arguments)
                };
                if (!f._fbq)
                    f._fbq = n;
                n.push = n;
                n.loaded = !0;
                n.version = '2.0';
                n.queue = [];
                t = b.createElement(e);
                t.async = !0;
                t.src = v;
                s = b.getElementsByTagName(e)[0];
                s.parentNode.insertBefore(t, s)
            }(window,
                    document, 'script', 'https://connect.facebook.net/en_US/fbevents.js');
            fbq('init', '1751620745111955');
            fbq('track', "PageView");
        </script>
        <noscript>
    <img height="1" width="1" style="display: none" src="https://www.facebook.com/tr?id=1751620745111955&ev=PageView&noscript=1"/>
    </noscript>
    <!-- End Facebook Pixel Code -->
</head>
<body>
    <!------------------- NAVIGATOR ------------------->
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
                            <img src="Content/images/logo.png" alt="">
                        </a>
                    </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav main-menu">
                            <li class="active">
                                <a href="/vi">
                                    <i class="icon-home"></i>
                                </a>
                            </li>
                            <li class="dropdown mn-play "><a href="/vi/choi" class="dropdown-toggle">Chơi</a><a href="#" class="ico-switch"></a>
                                <div class="dropdown-menu"><div class="sub-mn-list col-xs-12 col-md-3"><h4><a href="/vi/choi/mega-6-45">Mega 6/45</a></h4>
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
                            <li class="dropdown mn-win ">
                                <a href="/vi/trung-thuong" class="dropdown-toggle">Trúng Thưởng</a>
                                <a href="#" class="ico-switch"></a><div class="dropdown-menu">
                                    <div class="sub-mn-list col-xs-12 col-md-3">
                                        <h4>
                                            <a href="/vi/trung-thuong/ket-qua-trung-thuong">Kết quả trúng thưởng</a>
                                        </h4>
                                        <ul>
                                            <li>
                                                <a href="/vi/trung-thuong/ket-qua-trung-thuong/mega-6-45">
                                                    <i class="icon-arrow-right"></i> Mega 6/45</a>
                                            </li>
                                        </ul>
                                        <h4>
                                            <a href="/vi/trung-thuong/quay-so-mo-thuong">Quay số mở thưởng</a>
                                        </h4>
                                        <ul>
                                            <li>
                                                <a href="/vi/trung-thuong/quay-so-mo-thuong/tong-quan">
                                                    <i class="icon-arrow-right"></i> Tổng quan</a>
                                            </li>
                                        </ul>
                                        <ul>
                                            <li>
                                                <a href="/vi/trung-thuong/quay-so-mo-thuong/xem-truc-tuyen">
                                                    <i class="icon-arrow-right"></i> Xem trực tuyến</a>
                                            </li>
                                        </ul>
                                        <ul>
                                            <li>
                                                <a href="/vi/trung-thuong/quay-so-mo-thuong/quy-trinh-qsmt">
                                                    <i class="icon-arrow-right"></i> Quy trình quay số mở thưởng</a>
                                            </li>
                                        </ul>
                                        <ul>
                                            <li>
                                                <a href="/vi/trung-thuong/quay-so-mo-thuong/dang-ky-tham-gia-qsmt">
                                                    <i class="icon-arrow-right"></i> Đăng ký tham gia QSMT
                                                </a>
                                            </li>
                                        </ul>
                                        <ul>
                                            <li>
                                                <a href="/vi/trung-thuong/quay-so-mo-thuong/the-le-quay-so-mo-thuong">
                                                    <i class="icon-arrow-right"></i> Thể lệ quay số mở thưởng
                                                </a>
                                            </li>
                                        </ul>
                                        <h4><a href="/vi/trung-thuong/linh-thuong">Lĩnh Thưởng</a></h4>
                                        <ul>
                                            <li>
                                                <a href="/vi/trung-thuong/linh-thuong/quy-dinh-linh-thuong">
                                                    <i class="icon-arrow-right"></i> Quy định lĩnh thưởng</a>
                                            </li>
                                        </ul>
                                        <ul>
                                            <li>
                                                <a href="/vi/trung-thuong/linh-thuong/ve-rach-ve-hu-hong">
                                                    <i class="icon-arrow-right"></i> Điều kiện vé trúng thưởng
                                                </a>
                                            </li>
                                        </ul>
                                        <h4>
                                            <a href="/vi/trung-thuong/thu-vien-trung-thuong">Thư viện quay số mở thưởng</a>
                                        </h4>
                                    </div>
                                    <div class="sub-mn-spotlight col-xs-12 col-md-9">
                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                                <div class="media">
                                                    <div class="media-left">
                                                        <a href = "/vi/trung-thuong/ket-qua-trung-thuong">
                                                            <img src="Content/images/space.gif" class="media-object" style="background-image: url('http://static.vietlott.vn/uploads/public/7472616E74686973756F6E67Images/2016/Trung%20thuong/lottery.jpg'" alt=""></a></div><div class="media-body"><h4 class="media-heading">
                                                            <a href = "/vi/trung-thuong/ket-qua-trung-thuong"> Kết quả trúng thưởng</a>
                                                        </h4>
                                                        <p>Kết quả quay số mở thưởng của trò chơi Mega 6/45</p>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xs-12 col-md-6">
                                                <div class="media">
                                                    <div class="media-left">
                                                        <a href = "/vi/trung-thuong/quay-so-mo-thuong">
                                                            <img src="Content/images/space.gif" class="media-object" style="background-image: url('http://static.vietlott.vn/uploads/public/7472616E74686973756F6E67Images/large.png'" alt="">
                                                        </a>
                                                    </div>
                                                    <div class="media-body">
                                                        <h4 class="media-heading">
                                                            <a href = "/vi/trung-thuong/quay-so-mo-thuong"> Quay số mở thưởng</a>
                                                        </h4>
                                                        <p>Quy trình quay số mở thưởng, cách thức tham dự và các video quay số mở thưởng</p>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xs-12 col-md-6"><div class="media">
                                                    <div class="media-left">
                                                        <a href = "/vi/trung-thuong/linh-thuong">
                                                            <img src="Content/images/space.gif" class="media-object" style="background-image: url('http://static.vietlott.vn/uploads/public/7472616E74686973756F6E67Images/2016/Trung%20thuong/Dollarblue-300x228.png'" alt="">
                                                        </a>
                                                    </div>
                                                    <div class="media-body">
                                                        <h4 class="media-heading">
                                                            <a href = "/vi/trung-thuong/linh-thuong"> Lĩnh thưởng</a>
                                                        </h4>
                                                        <p>Các quy định liên quan đến lĩnh thưởng</p>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xs-12 col-md-6"><div class="media">
                                                    <div class="media-left"><a href = "/vi/trung-thuong/thu-vien-trung-thuong">
                                                            <img src="Content/images/space.gif" class="media-object" style="background-image: url('http://static.vietlott.vn/uploads/public/6E677579656E7468616F7472616E67Images/2.jpg'" alt="">
                                                        </a>
                                                    </div>
                                                    <div class="media-body">
                                                        <h4 class="media-heading">
                                                            <a href = "/vi/trung-thuong/thu-vien-trung-thuong"> Quay số mở thưởng</a>
                                                        </h4>
                                                        <p>Quy trình quay số mở thưởng, cách thức tham dự và các video quay số mở thưởng</p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>

                            <li class="dropdown mn-search">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><i class="icon-search"></i></a>
                                <div class="dropdown-menu">
                                    <form class="form-inline" method="GET" action="/vi/tim-kiem/?a=0">
                                        <div class="form-group">
                                            <label class="sr-only" for="search"></label>
                                            <div class="input-group">
                                                <input type="search" class="form-control" id="newsTite" name="q" placeholder="Tìm kiếm">
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </li>
                        </ul>
                        <form>
                            <ul class="nav navbar-nav navbar-right">
                                <li class="search">
                                    <a href="#"></a>
                                </li>
                                <li class="dropdown">
                                    <a href="/en/"><img src="Content/images/ico-en.png" alt=""></a>
                                </li>
                                <li>
                                    <a href="/FrontendRegisterLogin/Register" class="signup fancybox fancybox.iframe">Đăng ký</a>
                                </li>
                                <li>
                                    <a href="/FrontendRegisterLogin/Login" class="signin fancybox fancybox.iframe btn-red">Đăng nhập</a>
                                </li>
                            </ul>
                        </form>
                    </div>
                    <!-- /.navbar-collapse -->
                </div>
                <!-- /.container-fluid -->
            </nav>
        </div>
    </header><!------------------- MAIN BANNER ------------------->
    <div class="main-banner">
        <div id="main-banner" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#main-banner" data-slide-to="0" class="active "></li>
                <li data-target="#main-banner" data-slide-to="1" class=""></li>
                <li data-target="#main-banner" data-slide-to="2" class=""></li>
            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active" style="background: #2471cd">
                    <div class="item-wrap">
                        <img src="http://static.vietlott.vn/uploads/public/7472616E74686973756F6E67Images/2016/Banner/banner.png" alt="">
                        <div class="carousel-caption">
                            <h2></h2>
                            <p class="descript"></p>
                        </div>
                    </div>
                </div>
                <div class="item" style="background: #f4b61e">
                    <div class="item-wrap">
                        <img src="http://static.vietlott.vn/uploads/public/7472616E74686973756F6E67Images/2016/Banner/banner-2.png" alt="">
                        <div class="carousel-caption">
                            <h2></h2>
                            <p class="descript"></p>
                        </div>
                    </div>
                </div>
                <div class="item" style="background: #f79233">
                    <div class="item-wrap">
                        <img src="http://static.vietlott.vn/uploads/public/7472616E74686973756F6E67Images/2016/Banner/banner-1.png" alt="">
                        <div class="carousel-caption">
                            <h2></h2>
                            <p class="descript"></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!---- END : BANNER ----->
    <div class="main">
        <div class="game-box">
            <div class="game-box-bg">
                <div class="wrap clearfix"><!------------------- GAME RESULT ------------------->
                    <div class="game-result"><span><div class="tab-games">
                                <!-- Nav tabs -->
                                <ul class="nav nav-tabs" role="tablist">
                                    <li role="presentation" class="active">
                                        <a href="#mega-6-45" aria-controls="mega-6-45" role="tab" data-toggle="tab">Mega 6/45</a>
                                    </li>
                                </ul>

                                <!-- Tab panes -->
                                <div class="tab-content">
                                    <div role="tabpanel" class="tab-pane clearfix active" id="mega-6-45">
                                        <div class="jackpot-win">
                                            <span>Jackpot Mega 6/45 ước tính, ngày quay thưởng 27/07/2016</span>
                                            <h2>
                                                13.271.044.500<sup class="value-money">Đ</sup>
                                            </h2>
                                        </div><!-- /.Jackpot winner-->

                                        <div class="countdown-box">

                                            <div class="title">
                                                <span>Đếm ngược :</span>
                                            </div>
                                            <div class="countdown">
                                                <ul id="mega-6-45-countdowntimer">
                                                    <li>
                                                        <span class="box-number">02</span>
                                                        <span>Ngày</span>
                                                    </li>
                                                    <li>
                                                        <span class="box-number">05</span>
                                                        <span></span>
                                                    </li>
                                                    <li>
                                                        <span class="box-number">40</span>
                                                        <span>Phút</span>
                                                    </li>
                                                    <li>
                                                        <span class="box-number">18</span>
                                                        <span>Giây</span>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div><!-- /.Countdown -->
                                    </div>
                                    <script>
                                        $(function () {
                                            var hour = "14";
                                            var dayOfWeek = "Monday";
                                            if (dayOfWeek === "Wednesday" || dayOfWeek === "Friday" || dayOfWeek === "Sunday") {
                                                if (hour < 18 || hour > 18) {
                                                    countDownTimer("mega-6-45-countdowntimer", "7/25/2016 2:56:45 PM", "7/27/2016 5:45:00 PM", regexpReplaceWith);
                                                } else {
                                                    countDownTimer("mega-6-45-countdowntimer", "7/25/2016 2:56:45 PM", "7/25/2016 2:56:45 PM", regexpReplaceWith);
                                                }
                                            } else {
                                                countDownTimer("mega-6-45-countdowntimer", "7/25/2016 2:56:45 PM", "7/27/2016 5:45:00 PM", regexpReplaceWith);
                                            }

                                        });
                                    </script>
                                </div>
                            </div>
                            <script src="Content/js/mobile-detect.min.js"></script>
                            <div class="lotto-result">
                                <h4>Kết quả trúng thưởng Mega 6/45</h4>

                                <div id="result-games">
                                    <div class="box-result-detail">
                                        <p class="time-result">Kỳ quay thưởng #00003 | Ngày quay thưởng 24/07/2016</p>
                                        <ul class="result-number">
                                            <li class="arrow-result">
                                                <a href="javascript:void(0)" onclick=" prevNextResultGameMega645(this, 0)" data-gameid="3" data-drawid="3" data-dayprize="7/24/2016 12:00:00 AM">
                                                    <i class="icon-arrow-left"></i>
                                                </a>
                                            </li>
                                            <li>01</li>
                                            <li>10</li>
                                            <li>16</li>
                                            <li>18</li>
                                            <li>23</li>
                                            <li>38</li>
                                            <li class="arrow-result">
                                                <a href="javascript:void(0)" onclick=" prevNextResultGameMega645(this, 1)" data-gameid="3" data-drawid="3" data-dayprize="7/24/2016 12:00:00 AM">
                                                    <i class="icon-arrow-right"></i>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>

                                    <div class="result clearfix table-responsive">
                                        <table class="table table-striped">
                                            <thead>
                                                <tr>
                                                    <th style="text-align: center">Giá trị Jackpot</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td class="red" style="font-weight: bold; text-align: center">13.271.044.500 Đồng</td>
                                                </tr>
                                            </tbody>
                                        </table>

                                        <table class="table table-striped">
                                            <thead>
                                                <tr>
                                                    <th>Giải thưởng</th>
                                                    <th>Trùng khớp</th>
                                                    <th>Số lượng giải</th>
                                                    <th>Giá trị giải (Đồng)</th>

                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td>Jackpot</td>
                                                    <td class="circle-num"><i></i><i></i><i></i><i></i><i></i><i></i></td>
                                                    <td>0</td>
                                                    <td><b>13.271.044.500</b></td>

                                                </tr>
                                                <tr>
                                                    <td>Giải nhất</td>
                                                    <td class="circle-num"><i></i><i></i><i></i><i></i><i></i></td>
                                                    <td>5</td>
                                                    <td><b>10.000.000</b></td>

                                                </tr>
                                                <tr>
                                                    <td>Giải nhì</td>
                                                    <td class="circle-num"><i></i><i></i><i></i><i></i></td>
                                                    <td>323</td>
                                                    <td><b>300.000</b></td>

                                                </tr>
                                                <tr>
                                                    <td>Giải ba</td>
                                                    <td class="circle-num"><i></i><i></i><i></i></td>
                                                    <td>5182</td>
                                                    <td><b>30.000</b></td>

                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                                <div class="more">
                                    <a class="btn btn-link" href="/vi/trung-thuong/ket-qua-trung-thuong/mega-6-45/winning-numbers/">
                                        Các lần quay trước
                                        <i class="icon-arrow-right"></i>
                                    </a>
                                </div>
                                <p class="role-result">
                                    <span>
                                        Thời hạn lĩnh thưởng của vé trúng thưởng: là 60 (sáu mươi) ngày, kể từ ngày xác định kết quả trúng thưởng hoặc kể từ ngày hết hạn lưu hành của vé xổ số tự chọn số điện toán (nếu có). Quá thời hạn trên, các vé trúng thưởng không còn giá trị lĩnh thưởng.  

                                    </span>
                                </p>
                            </div>
                        </span></div>
                    <!-- /.col left --> <!------------------- END GAME RESULT -------------------> <!------------------- GAME JackPort ------------------->
                    <div class="game-jackpot"><div class="row-ct-1 clearfix">
                            <i class="ribbon">Đại lý</i>
                            <div class="pull-left">
                                Điều kiện để trở thành đại lý Vietlott?
                            </div>
                            <div class="pull-right">
                                <a class="btn-red" href="/vi/dai-ly/dai-ly/dieu-kien-tro-thanh-dai-ly/">Tìm hiểu</a>
                            </div>
                        </div><!-- /.AGENCY --><div class="row-ct-4">
                            <a href="/vi/choi/mega-6-45/cach-choi/">
                                <img src="Content/preview/bn-r-3.jpg"/>
                            </a>
                        </div>
                        <div class="row-ct-4">
                            <a href="/vi/trach-nhiem-xa-hoi/trach-nhiem-voi-cong-dong/">
                                <img src="Content/preview/bn-r-2.jpg"/>
                            </a>
                        </div></div>
                    <!-- /.col right --> <!------------------- END GAME JackPort -------------------></div>
            </div>
        </div>
    </div>
    <!------------------- NEWS ------------------->
    <div class="wrap">
        <div class="news-recently">
            <h3>Tin tức</h3>
            <div class="row">
                <div class="col-xs-12 col-md-2">
                    <div class="news-detail">
                        <span class="time">25/07/2016</span>
                        <span class="topic">
                            <a href="/vi/tin-tuc/news-winners/">
                                Tin Trúng Thưởng
                            </a>
                        </span>
                        <div class="thumb">
                            <a href="/vi/tin-tuc/news-winners/536-ky-quay-thuong-thu-3-voi-hon-5-500-nguoi-trung-giai/">
                                <img src="Content/images/space-2.gif" alt="" style="background-image: url('http://static.vietlott.vn/uploads/Images/2507TINTRUNGTHUONG/Untitled%201.jpg')" />
                            </a>
                        </div>
                        <h4>
                            <a href="/vi/tin-tuc/news-winners/536-ky-quay-thuong-thu-3-voi-hon-5-500-nguoi-trung-giai/">
                                NGƯỜI ĐÀN ÔNG CÓ DUYÊN VỚI XỔ SỐ TỰ CHỌN                                       </a>
                        </h4>
                        <p>
                            Kỳ quay số mở thưởng số 3 đã có 5.510 vé trúng thưởng, trong đó 05 vé trúng giải nhất với 05 co...</p>
                    </div>
                </div>
                <div class="col-xs-12 col-md-2">
                    <div class="news-detail">
                        <span class="time">20/07/2016</span>
                        <span class="topic">
                            <a href="/vi/tin-tuc/main-events/">
                                Sự Kiện Nổi Bật
                            </a>
                        </span>
                        <div class="thumb">
                            <a href="/vi/tin-tuc/main-events/529-khai-truong-trung-tam-quay-so-mo-thuong-xo-so-tu-chon-viet-nam/">
                                <img src="Content/images/space-2.gif" alt="" style="background-image: url('http://static.vietlott.vn/uploads/Images/IMG_8374.JPG')" />
                            </a>
                        </div>
                        <h4>
                            <a href="/vi/tin-tuc/main-events/529-khai-truong-trung-tam-quay-so-mo-thuong-xo-so-tu-chon-viet-nam/">
                                Khai trương Trung tâm quay số mở thưởng Xổ số tự chọn V...                                        </a>
                        </h4>
                        <p>
                            Ngày 20/07/2016 tại Hà Nội, Công ty TNHH MTV Xổ số điện toán Việt Nam (Vietlott) tổ chức “LỄ KH...</p>
                    </div>
                </div>
                <div class="col-xs-12 col-md-2">
                    <div class="news-detail">
                        <span class="time">27/07/2015</span>
                        <span class="topic">
                            <a href="/vi/trach-nhiem-xa-hoi/trach-nhiem-voi-cong-dong/">
                                Trách nhiệm với cộng đồng
                            </a>
                        </span>
                        <div class="thumb">
                            <a href="/vi/trach-nhiem-xa-hoi/trach-nhiem-voi-cong-dong/449-vietlott-tham-gia-chuong-trinh-hien-mau-tinh-nguyen-nam-2015/">
                                <img src="Content/images/space-2.gif" alt="" style="background-image: url('http://static.vietlott.vn/uploads/public/7472616E74686973756F6E67Images/2016/Trach%20nhiem%20xa%20hoi/HDXH/122.png')"/>

                            </a>
                        </div>
                        <h4>
                            <a href="/vi/trach-nhiem-xa-hoi/trach-nhiem-voi-cong-dong/449-vietlott-tham-gia-chuong-trinh-hien-mau-tinh-nguyen-nam-2015/">
                                Vietlott tham gia chương trình hiến máu tình nguyện năm...                                    </a>
                        </h4>
                        <p>
                            Hưởng ứng lời kêu gọi của Đoàn thanh niên Bộ Tài chính, thiết thực lập thành tích chào mừng kỷ ...                               </p>
                    </div>
                </div>
                <div class="col-xs-12 col-md-2">
                    <div class="news-detail">
                        <span class="time">11/08/2015</span>
                        <span class="topic">
                            <a href="/vi/trach-nhiem-xa-hoi/dong-gop-cho-dia-phuong/">
                                Đóng góp cho địa phương
                            </a>
                        </span>
                        <div class="thumb">
                            <a href="/vi/trach-nhiem-xa-hoi/dong-gop-cho-dia-phuong/477-vietlott-tham-du-hoi-nghi-so-ket-6-thang-dau-nam-cua-hoi-dong-xo-so-kien-thiet-mien-trung/">
                                <img src="Content/images/space-2.gif" alt="" style="background-image: url('http://static.vietlott.vn/uploads/public/7472616E74686973756F6E67Images/2016/Trach%20nhiem%20xa%20hoi/DGCDP/xo%20so%20mien%20trung.png')"/>

                            </a>
                        </div>
                        <h4>
                            <a href="/vi/trach-nhiem-xa-hoi/dong-gop-cho-dia-phuong/477-vietlott-tham-du-hoi-nghi-so-ket-6-thang-dau-nam-cua-hoi-dong-xo-so-kien-thiet-mien-trung/">
                                Vietlott tham dự hội nghị sơ kết 6 tháng đầu năm của Hộ...                                       </a>
                        </h4>
                        <p>
                            Từ ngày 22 -24/7, Hội đồng Xổ số Kiến thiết miền Trung đã tổ chức hội nghị sơ kết công tác kinh...</p>
                    </div>
                </div>
                <div class="col-xs-12 col-md-2">
                    <div class="news-detail">
                        <span class="time">30/05/2016</span>
                        <span class="topic">
                            <a href="/vi/trach-nhiem-xa-hoichoi-co-trach-nhiem/loi-khuyen/">
                                Lời khuyên cho người chơi
                            </a>
                        </span>
                        <div class="thumb">
                            <a href="/vi/trach-nhiem-xa-hoichoi-co-trach-nhiem/loi-khuyen/482-loi-khuyen-cho-nguoi-choi/">
                                <img src="Content/images/space-2.gif" alt="" style="background-image: url('http://static.vietlott.vn/uploads/public/7472616E74686973756F6E67Images/mmm(1).png')"/>

                            </a>
                        </div>
                        <h4>
                            <a href="/vi/trach-nhiem-xa-hoichoi-co-trach-nhiem/loi-khuyen/482-loi-khuyen-cho-nguoi-choi/">
                                Lời khuyên cho người chơi                                       </a>
                        </h4>
                        <p>
                            Một số mẹo nhỏ giúp người chơi tự kiểm soát việc tham gia các trò chơi có thưởng.</p>
                    </div>
                </div>
            </div>
        </div>
    </div><!-- /.NEWS -->
    <!------------------- PARTNER ------------------->
    <div class="wrap">
        <div class="partner-vietlott">
            <div class="row">
                <ul class="bxslider">
                    <li>
                        <img src="http://static.vietlott.vn/uploads/public/41646D696E6973747261746F72Images/Partner/dsz1372207834.jpg" />
                    </li>
                    <li>
                        <img src="http://static.vietlott.vn/uploads/public/41646D696E6973747261746F72Images/Partner/fcy1373076651.jpg" />
                    </li>
                    <li>
                        <img src="http://static.vietlott.vn/uploads/public/41646D696E6973747261746F72Images/Partner/jqf1382334075.png" />
                    </li>
                    <li>
                        <img src="http://static.vietlott.vn/uploads/public/41646D696E6973747261746F72Images/Partner/tpm1374906190.jpg" />
                    </li>
                    <li>
                        <img src="http://static.vietlott.vn/uploads/public/41646D696E6973747261746F72Images/Partner/cix1372383959.jpg" />
                    </li>
                    <li>
                        <img src="http://static.vietlott.vn/uploads/public/41646D696E6973747261746F72Images/Partner/pgd1375347232.jpg" />
                    </li>
                    <li>
                        <img src="http://static.vietlott.vn/uploads/public/41646D696E6973747261746F72Images/Partner/uzw1373454853.jpg" />
                    </li>
                    <li>
                        <img src="http://static.vietlott.vn/uploads/public/6E677579656E7468616F7472616E67Images/VIETTINBANK.png" />
                    </li>
                    <li>
                        <img src="http://static.vietlott.vn/uploads/public/6E677579656E7468616F7472616E67Images/viettel123.jpg" />
                    </li>
                    <li>
                        <img src="http://static.vietlott.vn/uploads/public/6E677579656E7468616F7472616E67Images/Logo-VNPT.jpg" />
                    </li>
                    <li>
                        <img src="http://static.vietlott.vn/uploads/public/6E677579656E7468616F7472616E67Images/xskttphcm.jpg" />
                    </li>
                    <li>
                        <img src="http://static.vietlott.vn/uploads/public/6E677579656E7468616F7472616E67Images/WLA.jpg" />
                    </li>
                </ul>
            </div>
        </div>
    </div><!-- /.PARTER --><!------------------- FOOTER ------------------->
    <footer>
        <div class="wrap">
            <ul class="ft-social">
                <li>
                    <img src="Content/images/ft-pattern.png" alt="">
                </li>
                <li>
                    <a href="https://www.facebook.com/C%C3%B4ng-ty-X%E1%BB%95-s%E1%BB%91-%C4%91i%E1%BB%87n-to%C3%A1n-Vi%E1%BB%87t-Nam-Vietlott-351876888274703/">
                        <i class="icon-facebook"></i>
                    </a>
                </li>
                <li>
                    <a href="https://plus.google.com/115042463936591410646/posts">
                        <i class="icon-google-plus"></i>
                    </a>
                </li>
                <li>
                    <a href="https://www.youtube.com/user/Vietlott">
                        <i class="icon-youtube"></i>
                    </a>
                </li>
                <li>
                    <img src="Content/images/ft-pattern.png" alt="">
                </li>
            </ul>
            <div class="ft-link-box">
                <div class="ft-link"><h5><a href="/vi/home">Trang chủ</a></h5></div>
                <div class="ft-link"><h5><a href="/vi/choi">Chơi</a></h5></div>
                <div class="ft-link"><h5><a href="/vi/dai-ly">Đại lý</a></h5></div>
                <div class="ft-link"><h5><a href="/vi/vietlott">Vietlott</a></h5></div>
                <div class="ft-link"><h5><a href="/vi/lien-he">Liên hệ</a></h5></div>
                <div class="ft-link"><h5><a href="/vi/sitemap">Sitemap</a></h5></div>
            </div>
            <div class="porn-label">
                <span><img src="Content/images/porn-label.png" alt="Game dÃ nh cho ngÆ°á»i trÃªn 18 tuá»•i"></span>
                <span><img src="Content/images/alpha.png" alt=""></span>
            </div>
            <div class="ft-copyright">
                © 2016, Công ty Xổ Số Điện Toán Việt Nam. <br/>
                Tầng 15, Tòa nhà CornerStone, 16 Phan Chu Trinh, Quận Hoàn Kiếm, Hà Nội
            </div>
        </div>
    </footer><!-- /.FOOTER -->
    <div class="btn-switch-view">
        <a href="#" id="change_vesion">
            <i class="icon-desktop"></i>  Phiên bản đầy đủ

        </a>
    </div>

    <div class="btn-fixed">
        <a href="/vi/dai-ly/dia-diem-ban-hang/danh-sach-dia-diem-ban-hang/"><i class="icon-location"></i></a>
    </div>


    <!------------------- MODAL, POPUP ------------------->
    <div class="modal fade popup-ct" id="tvc-01" tabindex="-1" role="dialog" aria-labelledby="tvc-01">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-body">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <div id="loading-content" style="width: 700px; height: 400px">
                        <div id="loading" class="loading" style="display: none"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="modal fade popup-ct" id="tvc-02" tabindex="-1" role="dialog" aria-labelledby="tvc-02">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-body">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <div id="map" style="width: 700px; height: 400px">
                    </div>
                </div>
            </div>
        </div>
    </div>


    <script type="text/javascript">
        var LanguageCode = "vi";
        var DateFormat = "dd/MM/yyyy";
        var TimeFormat = "HH:mm";
        var ToConfirmSubmitPressOK = "Äá»ƒ xÃ¡c nháº­n submit, hÃ£y nháº¥n OK";
        var regexpReplaceWith = "<li><span class=\"box-number\">$1</span><span>Ng&#224;y</span></li>" +
                "<li><span class=\"box-number\">$2</span><span>Giá»</span></li>" +
                "<li><span class=\"box-number\">$3</span><span>Ph&#250;t</span></li>" +
                "<li><span class=\"box-number\">$4</span><span>Gi&#226;y</span></li>";
    </script>
    <script src="Content/js/jquery.ui.widget.js"></script>
    <script src="Content/js/jquery.bxslider.min.js"></script>
    <script src="Content/js/jquery.fancybox-1.3.4.js"></script>
    <script src="Content/js/FromRegisterLogin.js"></script>
    <script src="Content/js/Agency.js"></script>
    <script src="Content/js/AjaxLoader.js"></script>
    <script src="Content/js/jquery.galleria-1.4.2.js"></script>
    <script src="Content/js/media-gallery.js"></script>
    <script src="Content/js/script.js"></script>
    <script src="Content/js/jquery.fileupload.js"></script>
    <script src="Content/js/moment-with-locales.js"></script>
    <script src="Content/js/bootstrap-datetimepicker.js"></script>
    <script src="Content/js/jquery.countdownTimer.js"></script>


    <noscript>
    <img height="1" width="1" style="display:none" src="https://www.facebook.com/tr?id=1751620745111955&ev=PageView&noscript=1" />
    </noscript>
    <script>
        $('.bxslider').bxSlider({
            minSlides: 3,
            maxSlides: 7,
            slideWidth: 130,
            slideMargin: 10
        });

        if ($(window).width() <= 1100) {
            $('.main-menu li a.ico-switch').attr("data-toggle", "dropdown");
        }
        ;
    </script>
</body>
</html>
