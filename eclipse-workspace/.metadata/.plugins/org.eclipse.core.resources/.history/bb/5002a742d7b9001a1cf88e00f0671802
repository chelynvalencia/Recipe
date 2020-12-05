<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta name="google-signin-scope" content="profile email">
<meta name="google-signin-client_id" content="MASUKKAN_CLIENT_ID_OAUTH">
<script src="https://apis.google.com/js/platform.js" async defer></script>
</head>
<body>
<p id="profileimg"></p>
<p id="profilename"></p>
<p id="profilemail"></p>
<div class="g-signin2" data-onsuccess="onSignIn" data-theme="dark"></div>
<script>
function onSignIn(googleUser) {
// Useful data for your client-side scripts:
var profile = googleUser.getBasicProfile();
document.getElementById("profilename").innerHTML = 'Nama : ' +
profile.getName();
document.getElementById("profilemail").innerHTML = 'Email :' +
profile.getEmail();
document.getElementById("profileimg").innerHTML = '<img src="' +
profile.getImageUrl() + '" />';
}
</script>
</body>
</html>