<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-
fit=no">

<meta name="description" content="">
<meta name="author" content="">
<title>Mata Kuliah</title>
<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
type="text/css">
<link
href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,6
00i,700,700i,800,800i,900,900i" rel="stylesheet">
<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">
<!-- The core Firebase JS SDK is always required and must be listed first -->
<script src="https://www.gstatic.com/firebasejs/7.15.0/firebase-app.js"></script>

<script src="https://www.gstatic.com/firebasejs/7.15.0/firebase-
database.js"></script>

<script src="https://www.gstatic.com/firebasejs/7.15.0/firebase-
firestore.js"></script>

<!-- TODO: Add SDKs for Firebase products that you want to use
https://firebase.google.com/docs/web/setup#available-libraries -->

<script>
  // Your web app's Firebase configuration
  var firebaseConfig = {
		  apiKey: "AIzaSyA1FTMo1CjlclESnYZleE2XCOCZD9csmLw",
		    authDomain: "rmn-realtime-fb-b033c.firebaseapp.com",
		    databaseURL: "https://rmn-realtime-fb-b033c.firebaseio.com",
		    projectId: "rmn-realtime-fb-b033c",
		    storageBucket: "rmn-realtime-fb-b033c.appspot.com",
		    messagingSenderId: "624417790440",
		    appId: "1:624417790440:web:b5ca39cc645f1a8d142c5d",
		    measurementId: "G-Y15J0XQ9KV"
  };
  // Initialize Firebase
  firebase.initializeApp(firebaseConfig);
  firebase.analytics();
</script>

</head>
<body id="page-top">
<!-- Page Wrapper -->
<div id="wrapper">
<!-- Sidebar -->
<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
id="accordionSidebar">
<!-- Sidebar - Brand -->
<a class="sidebar-brand d-flex align-items-center justify-content-center"
href="index.html">
<div class="sidebar-brand-icon rotate-n-15">
<i class="fas fa-laugh-wink"></i>
</div>
<div class="sidebar-brand-text mx-3">SI Akademik</div>
</a>
<!-- Divider -->
<hr class="sidebar-divider my-0">
<!-- Nav Item - Dashboard -->
<li class="nav-item">
<a class="nav-link" href="index.html">
<i class="fas fa-fw fa-tachometer-alt"></i>
<span>Dashboard</span></a>
</li>
<!-- Divider -->
<hr class="sidebar-divider">
<!-- Heading -->
<div class="sidebar-heading">


</div>
<!-- Nav Item - Charts -->
<li class="nav-item">
<a class="nav-link" href="matakuliah.jsp">
<i class="fas fa-fw fa-chart-area"></i>
<span>Mata Kuliah</span></a>
</li>
<!-- Nav Item - Tables -->
<li class="nav-item">
<a class="nav-link" href="dosen.jsp">
<i class="fas fa-fw fa-table"></i>
<span>Dosen</span></a>
</li>
<!-- Nav Item - Tables -->
<li class="nav-item">
<a class="nav-link" href="mengajar.jsp">
<i class="fas fa-fw fa-table"></i>
<span>Info</span></a>
</li>
</ul>
<!-- End of Sidebar -->
<!-- Content Wrapper -->
<div id="content-wrapper" class="d-flex flex-column">
<!-- Main Content -->
<div id="content">
<!-- Topbar -->
<nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top
shadow">
<!-- Sidebar Toggle (Topbar) -->
<button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle
mr-3">
<i class="fa fa-bars"></i>
</button>
<!-- Topbar Navbar -->
<ul class="navbar-nav ml-auto">
<div class="topbar-divider d-none d-sm-block"></div>
<!-- Nav Item - User Information -->
<li class="nav-item dropdown no-arrow">
<a class="nav-link dropdown-toggle" href="#" id="userDropdown"
role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">


<span class="mr-2 d-none d-lg-inline text-gray-600
small">Administrator</span>
<img class="img-profile rounded-circle"
src="https://source.unsplash.com/QAB-WJcbgJk/60x60">
</a>
<!-- Dropdown - User Information -->
<div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
aria-labelledby="userDropdown">
<a class="dropdown-item" href="#">
<i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
Ubah Password
</a>
<div class="dropdown-divider"></div>

<a class="dropdown-item" href="#" data-toggle="modal" data-
target="#logoutModal">

<i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
Logout
</a>
</div>
</li>
</ul>
</nav>
<!-- End of Topbar -->
<!-- Begin Page Content -->
<div class="container-fluid">
<!-- Page Heading -->
<h1 class="h3 mb-4 text-gray-800">Dosen <a href="add_dosen.jsp" class="btn
btn-success btn-user">Tambah Baru</a></h1>
<hr/>
<form class="user">
<div class="form-group">
<input type="text" class="form-control" id="uid" placeholder="ID"
readonly>
</div>
<div class="form-group">
<input type="text" class="form-control" id="kode" placeholder="Kode
Dosen">
</div>
<div class="form-group">
<input type="text" class="form-control" id="nama" placeholder="Nama
Dosen">
</div>
<input type="button" value="Update" onclick="update_user();"
class="btn btn-warning btn-user" />
<input type="button" value="Delete" onclick="delete_user();"
class="btn btn-danger btn-user" />
<hr>
</form>

<div class="card shadow mb-4">
<div class="card-header py-3">
<h6 class="m-0 font-weight-bold text-primary">Information</h6>


</div>
<div class="card-body">
<div class="table-responsive">
<table id="tb_dosen" class="table table-bordered" width="100%"
cellspacing="0">

<tr>
<td>#ID</td>
<td>Kode</td>
<td>Nama</td>
</tr>
</table>

</div>
</div>
</div>
</div>
<!-- /.container-fluid -->
</div>
<!-- End of Main Content -->
<!-- Footer -->
<footer class="sticky-footer bg-white">
<div class="container my-auto">
<div class="copyright text-center my-auto">
<span>Copyright &copy; Your Website 2019</span>
</div>
</div>
</footer>
<!-- End of Footer -->
</div>
<!-- End of Content Wrapper -->
</div>
<!-- End of Page Wrapper -->
<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top">
<i class="fas fa-angle-up"></i>
</a>
<!-- Logout Modal-->

<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-
labelledby="exampleModalLabel" aria-hidden="true">

<div class="modal-dialog" role="document">
<div class="modal-content">
<div class="modal-header">
<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>

<button class="close" type="button" data-dismiss="modal" aria-
label="Close">

<span aria-hidden="true">×</span>
</button>
</div>
<div class="modal-body">Select "Logout" below if you are ready to end your
current session.</div>


<div class="modal-footer">

<button class="btn btn-secondary" type="button" data-
dismiss="modal">Cancel</button>

<a class="btn btn-primary" href="login.html">Logout</a>
</div>
</div>
</div>
</div>
<!-- Bootstrap core JavaScript-->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Core plugin JavaScript-->
<script src="vendor/jquery-easing/jquery.easing.min.js"></script>
<script>
var tbDosen = document.getElementById('tb_dosen');
var databaseRef = firebase.database().ref('dosen/');
var rowIndex = 1;
databaseRef.once('value', function(snapshot) {
snapshot.forEach(function(childSnapshot) {
var childKey = childSnapshot.key;
var childData = childSnapshot.val();
var row = tbDosen.insertRow(rowIndex);
var cellId = row.insertCell(0);
var cellKode = row.insertCell(1);
var cellNama = row.insertCell(2);
cellId.appendChild(document.createTextNode(childKey));
cellKode.appendChild(document.createTextNode(childData.kode));
cellNama.appendChild(document.createTextNode(childData.nama));
rowIndex = rowIndex + 1;
});
var table = document.getElementById("tb_dosen");
var rows = table.getElementsByTagName("tr");
for (i = 0; i < rows.length; i++) {
var currentRow = table.rows[i];
var createClickHandler = function(row) {
return function() {
var cell1 = row.getElementsByTagName("td")[0];
var cell2 = row.getElementsByTagName("td")[1];
var cell3 = row.getElementsByTagName("td")[2];
var id = cell1.innerHTML;
var kode = cell2.innerHTML;
var nama = cell3.innerHTML;
document.getElementById('uid').value = id;
document.getElementById('kode').value = kode;
document.getElementById('nama').value = nama;
};
};
currentRow.onclick = createClickHandler(currentRow);
}
});

function update_user(){
var kode = document.getElementById('kode').value;
var nama = document.getElementById('nama').value;
var uid = document.getElementById('uid').value;
var data = {
kode: kode,
nama: nama
}
var updates = {};
updates['/dosen/' + uid] = data;
firebase.database().ref().update(updates);
alert('dosen updated successfully!');
reload_page();
}
function delete_user(){
var uid = document.getElementById('uid').value;
firebase.database().ref().child('/dosen/' + uid).remove();
alert('dosen deleted successfully!');
reload_page();
}
function reload_page(){
window.location.reload();
}
</script>
</body>
</html>