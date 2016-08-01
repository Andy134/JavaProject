/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {
//	var clock;
//	
//	clock = $('.clock').FlipClock({
//		clockFace: 'DailyCounter',
//		defaultLanguage:'vietnamese',
//		autoStart: false,
//		callbacks: {
//			stop: function() {
//				$('.message').html('The clock has stopped!')
//			}
//		}
//	});
//			
//	clock.setTime(220880);
//	clock.setCountdown(true);
//	clock.start();

//    $('#AttachFile').bind('change', function () {
//        var sFileExtension = this.files[0].name.split(".")[this.files[0].name.split('.').length - 1].toLowerCase();
//        var iFileSize = this.files[0].size;
//        var iConvert = (iFileSize / 10485760).toFixed(2);
//        if (!(sFileExtension === "pdf" || sFileExtension === "doc" || sFileExtension === "docx") || iFileSize > 5000000) {
//            txt = "File type : " + sFileExtension + "\n\n";
//            txt += "Size: " + iConvert + " MB \n\n";
//            txt += "Please make sure your file is in pdf or doc format and less than 10 MB.\n\n";
//            alert(txt);
//        } else {
//            $('#AttachFile').fileupload({
//                dataType: 'json',
//                url: '/Ajax/UploadFiles',
//                autoUpload: true,
//                done: function (e, data) {
//                    console.log(data);
//                }
//            }).on('fileuploadprogressall', function (e, data) {
//                var progress = parseInt(data.loaded / data.total * 100, 10);
//                $('.progress .progress-bar').css('width', progress + '%');
//            });
//        }
//    });
    
    if ($(window).width() < 760) {
        $(".using_html_content").remove();
        $("#main-banner ol li").each(function (i) {
            $(this).attr("data-slide-to", i);
            if (i === 0) {
                $(this).addClass("active");
            }
        });
        $("#main-banner div.carousel-inner div").each(function (i) {
            if (i === 0) {
                $(this).addClass("active");
            }
        });
        if (localStorage.getItem("no_responsive") === "1") {
            $("#change_vesion").html("<i class=\"icon-desktop\"></i> Phiên bản di động");
            $(".btn-switch-view").css("display", "block");
        }
    }

    $("#change_vesion").click(function () {
        if (localStorage.getItem("no_responsive") === "1") {
            localStorage.setItem("no_responsive", "0");
            $("#change_vesion").html("<i class=\"icon-desktop\"></i> Phiên bản đầy đủ");
        } else {
            localStorage.setItem("no_responsive", "1");
            $("#change_vesion").html("<i class=\"icon-tablet\"></i> Phiên bản di động");
        }
        window.location.reload();
//        $("link[title=responsive]")[0].disabled = true;
//        $("head link[rel='stylesheet']").last().after("<link rel='stylesheet' href='~/Content/css/no-responsive.css' type='text/css' rel='stylesheet' title='no-responsive'>");
    });
});

function countDownTimer(className, startDate, endDate, regexpReplaceWith) {
    $("#" + className).countdowntimer({
        startDate: startDate,
        dateAndTime: endDate,
        size: "lg",
        regexpMatchFormat: "([0-9]{1,2}):([0-9]{1,2}):([0-9]{1,2}):([0-9]{1,2})",
        regexpReplaceWith: regexpReplaceWith
    });
}

function InitializeMap(latitude, longitude, address) {
    var myStyle = [
       {
           featureType: "water",
           elementType: "labels",
           stylers: [
             { visibility: "off" }
           ]
       }
    ];

    var latlng = new google.maps.LatLng(latitude, longitude);
    var myOptions =
    {
        mapTypeControlOptions: {
            mapTypeIds: ["mystyle", google.maps.MapTypeId.ROADMAP, google.maps.MapTypeId.TERRAIN]
        },
        zoom: 18,
        center: latlng,
        mapTypeId: "mystyle"
    };
    map = new google.maps.Map(document.getElementById("map"), myOptions);
    map.mapTypes.set("mystyle", new google.maps.StyledMapType(myStyle, { name: "My Style" }));
    var infowindow = new google.maps.InfoWindow({
        content: address
    });
    marker = new google.maps.Marker({
        map: map, 
        position: new google.maps.LatLng(latitude, longitude),
    });
    google.maps.event.addListener(marker, "click", function () { infowindow.open(map, marker); });
    infowindow.open(map, marker);
}

