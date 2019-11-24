$(document).ready(function () {
  $("#menu").load("/menu.html");
});

function confirmDialog(text) {
  var retVal = confirm(text);
  if (retVal == true) {
    return true;
  } else {
    return false;
  }
};