$(document).ready(function () {
  $("#menu").load("/menu.html");
});

$('.nav li').click(function () {
  $('.nav li').removeClass('active');
  $(this).addClass('active');
})


function confirmDialog(text) {
  var retVal = confirm(text);
  if (retVal == true) {
    return true;
  } else {
    return false;
  }
};