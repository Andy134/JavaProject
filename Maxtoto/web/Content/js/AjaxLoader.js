/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

jQuery(document).ready(function ($) {
//    $(".get_video").click(function () {
//        $("#loading").show();
//        $.ajax({
//            beforeSend: function (jqXHR, settings) {
//                var self = this;
//                var xhr = settings.xhr;
//                settings.xhr = function () {
//                    var output = xhr();
//                    output.onreadystatechange = function () {
//                        if (typeof (self.readyStateChanged) == "function") {
//                            self.readyStateChanged(this);
//                        }
//                    };
//                    return output;
//                };
//            },
//            url: "/Ajax/VideoFindById",
//            method: "post",
//            data: { videoId: $(this).data("videoid") },
//            success: function (result) {
//                $("#loading").hide();
//                $(".load_video").html(result);
//            },
//            error: function (e) {
//                $("#loading").hide();
//                console.log(e.message);
//            },
//            readyStateChanged: function (xhr) {
//                if (xhr.readyState === 1) {
//                    getScriptVideoJs();
//                }
//            }
//        });
    //    });

    $(".get_video").click(function () {
        $("#loading").show();
        $.ajax({
            url: "/Ajax/VideoFindById",
            method: "post",
            data: { videoId: $(this).data("videoid") },
            success: function (result) {
                $("#loading").hide();
                $("#loading-content").html(result);
            },
            error: function (e) {
                $("#loading").hide();
                console.log(e.message);
            }
        });
    });

    $(".get_video_hot").click(function () {
        $("#loading").show();
        $.ajax({
            url: "/Ajax/VideoHotFindById",
            method: "post",
            data: { videoId: $(this).data("videoid") },
            success: function (result) {
                console.log(result);
                $("#loading").hide();
                $(".loading-video-hot").html(result);
            },
            error: function (e) {
                $("#loading").hide();
                console.log(e.message);
            }
        });
    });

    $(".get_images").click(function () {
        $("#loading").show();
        $.ajax({
            url: "/Ajax/GalleryFindById",
            method: "post",
            data: { galleryCode: $(this).data("gallerycode") },
            success: function (result) {
                $("#loading").hide();
                $("#loading-content").html(result);
            },
            error: function (e) {
                $("#loading").hide();
                console.log(e.message);
            },
            cache: false,
            async: true
        });
    });

    $('#AttachFile').fileupload({
        dataType: "json",
        url: '/Ajax/UploadFiles',
        autoUpload: true,
        done: function (e, data) {
            console.log(data.result.status);
            if (data.result.status === "1") {
                var arrayFile = data.result.data.split("/");
                $("#AttachFileInput").val(data.result.data);
                $("#helpBlock").html(arrayFile[arrayFile.length-1]);
            } else {
                console.log(data);
                txt = "File type : " + data.files[0].type + "\n\n";
                txt += "Size: " + (data.files[0].size / 10485760).toFixed(2) + " MB \n\n";
                txt += "Please make sure your file is in pdf or doc format and less than 5 MB.\n\n";
                alert(txt);
            }
        }
    }).on('fileuploadprogressall', function (e, data) {
        var progress = parseInt(data.loaded / data.total * 100, 10);
        $('.progress .progress-bar').css('width', progress + '%');
    });

    $(".prev-result").click(function () {
        $("#loading").show();
        $.ajax({
            url: "/Ajax/PrevNextResultGameMega645",
            method: "post",
            data: { gameId: $(this).data("gameid"), drawId: $(this).data("drawid"), dayPrize: $(this).data("dayprize"), type: 0 },
            success: function (result) {
                $("#loading").hide();
                if (result !== "") {
                    $("#result-games").html(result);
                }
            },
            error: function (e) {
                $("#loading").hide();
                console.log(e.message);
            }
        });
    });

    $(".next-result").click(function () {
        $("#loading").show();
        $.ajax({
            url: "/Ajax/PrevNextResultGameMega645",
            method: "post",
            data: { gameId: $(this).data("gameid"), drawId: $(this).data("drawid"), dayPrize: $(this).data("dayprize"), type: 1 },
            success: function (result) {
                $("#loading").hide();
                if (result !== "") {
                    $("#result-games").html(result);
                }
            },
            error: function (e) {
                $("#loading").hide();
                console.log(e.message);
            }
        });
    });
});

function prevNextResultGameMega645(object, type) {
    $.ajax({
        url: "/Ajax/PrevNextResultGameMega645",
        method: "post",
        data: { gameId: $(object).data("gameid"), drawId: $(object).data("drawid"), dayPrize: $(object).data("dayprize"), type: type },
        success: function (result) {
            $("#loading").hide();
            if (result !== "") {
                $("#result-games").html(result);
            }
        },
        error: function (e) {
            $("#loading").hide();
            console.log(e.message);
        }
    });
}

function getScriptVideoJs(){ 
    //include the code from 
    $.getScript("/Content/js/jwplayer.js");
    $.getScript("/Content/js/jwplayer.html5.js");
}

function getScriptMediaGallery() {
    $.getScript("/Content/js/jquery.galleria-1.4.2.js");
}
