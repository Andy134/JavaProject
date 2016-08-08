<%-- 
    Document   : body
    Created on : Aug 8, 2016, 9:20:32 AM
    Author     : TuanAnh
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<body>
    <!------------------- NAVIGATOR ------------------->
    <%@include file="header.jsp" %>
    <!------------------- MAIN BANNER ------------------->
    <!------------------- Login ------------------->
    <%@include file="login.jsp" %>
    <!------------------- MAIN BANNER ------------------->
    <%@include file="slider.jsp" %>
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
    <%@include file="news.jsp" %>
    <!------------------- PARTNER ------------------->
    <%@include file="partner.jsp" %>
    <!-- /.PARTER --><!------------------- FOOTER ------------------->
    <%@include file="footer.jsp" %>
    <!-- /.FOOTER -->
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