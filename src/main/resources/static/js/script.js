$(document).ready(function () {
  $("#menu").load("/menu.html");
});

$('.nav li').click(function(){
    $('.nav li').removeClass('active');
    $(this).addClass('active');
})