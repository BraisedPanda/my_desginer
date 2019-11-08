function goTop() {
    $('html,body').animate({
        scrollTop: 0
    }, 500)
}

window.addEventListener("scroll",function() {

    var scroHei = $(window).scrollTop();//滚动的高度

    if (scroHei > 500) {
        $('.side').fadeIn();
    } else {
        $('.side').fadeOut();
    }
});