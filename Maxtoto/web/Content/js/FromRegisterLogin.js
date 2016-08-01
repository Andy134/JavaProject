/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    /* This is basic - uses default settings */
    $('a.fancybox').fancybox({
        beforeShow: function () {
            this.skin.css({
                // border: "8px solid #0B8FD3",
                background: "none repeat scroll 0 0 #EDEDED"
            });
        },
        afterShow: function () {
            this.skin.css({
                // border: "8px solid #0B8FD3",
                background: "none repeat scroll 0 0 #EDEDED"
            });
        },
        'onClosed': function () { window.location.reload(); },
        type: 'iframe',
        padding: 0,
        width: 372,
        height: 476
    });
    $('a.settings').fancybox({
        beforeShow: function () {
            this.skin.css({
                // border: "8px solid #0B8FD3",
                background: "none repeat scroll 0 0 #EDEDED"
            });
        },
        afterShow: function () {
            this.skin.css({
                // border: "8px solid #0B8FD3",
                background: "none repeat scroll 0 0 #EDEDED"
            });
        },
        'onClosed': function () { $('#div_2').show(); window.location.reload(); },
        type: 'iframe',
        padding: 0,
        width: 1024,
        height: 768
    });
});

