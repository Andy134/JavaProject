/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
jQuery(document).ready(function($) {
    $("#ProvinceId").change(function () {
        $("#loading").show();
        $.ajax({
            url: "/Ajax/WardFindByProvince",
            method: "post",
            data: { provinceId: $("#ProvinceId").val() },
            success: function (result) {
                $("#loading").hide();
                $("#wardsChange").html(result);
            },
            error: function (e) {
                $("#loading").hide();
                console.log(e.message);
            }
        });
    });
});

