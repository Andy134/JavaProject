/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
jQuery(document).ready(function ($) {

    if ($(".galleria").length) {
        Galleria.loadTheme("/Content/js/galleria/themes/classicmod/galleria.classicmod.min.js");
        Galleria.configure({
            transitionSpeed: 2000
        });
        Galleria.run(".galleria");
    }

});

