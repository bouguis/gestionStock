<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="fr">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<!-- Favicon icon -->
<link rel="icon" type="image/png" sizes="16x16"
	href="resources/assets/images/favicon.png">
<title>GestionStock</title>
<!-- Bootstrap Core CSS -->
<link href="resources/assets/css/lib/bootstrap/bootstrap.min.css"
	rel="stylesheet">
<!-- Custom CSS -->

<link href="resources/assets/css/lib/calendar2/semantic.ui.min.css"
	rel="stylesheet">
<link href="resources/assets/css/lib/calendar2/pignose.calendar.min.css"
	rel="stylesheet">
<link href="resources/assets/css/lib/owl.carousel.min.css"
	rel="stylesheet" />
<link href="resources/assets/css/lib/owl.theme.default.min.css"
	rel="stylesheet" />
<link href="resources/assets/css/helper.css" rel="stylesheet">
<link href="resources/assets/css/style.css" rel="stylesheet">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:** -->
<!--[if lt IE 9]>
    <script src="https:**oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https:**oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
</head>

<body class="fix-header fix-sidebar">
	<!-- Preloader - style you can find in spinners.css -->
	<div class="preloader">
		<svg class="circular" viewBox="25 25 50 50">
			<circle class="path" cx="50" cy="50" r="20" fill="none"
				stroke-width="2" stroke-miterlimit="10" /> </svg>
	</div>
	<!-- Main wrapper  -->
	<div id="main-wrapper">
		<!-- header header  -->
		<div class="header">
			<nav class="navbar top-navbar navbar-expand-md navbar-light">
				<!-- Logo -->
				<div class="navbar-header">
					<a class="navbar-brand" href="index.html"> <!-- Logo icon --> <b><img
							src="resources/assets/images/logo.png" alt="homepage"
							class="dark-logo" /></b> <!--End Logo icon --> <!-- Logo text --> <span><img
							src="resources/assets/images/logo-text.png" alt="homepage"
							class="dark-logo" /></span>
					</a>
				</div>
				<!-- End Logo -->
				<div class="navbar-collapse">
					<!-- toggle and nav items -->
					<ul class="navbar-nav mr-auto mt-md-0">
						<!-- This is  -->
						<li class="nav-item"><a
							class="nav-link nav-toggler hidden-md-up text-muted  "
							href="javascript:void(0)"><i class="mdi mdi-menu"></i></a></li>
						<li class="nav-item m-l-10"><a
							class="nav-link sidebartoggler hidden-sm-down text-muted  "
							href="javascript:void(0)"><i class="ti-menu"></i></a></li>
						<!-- Messages -->
						<li class="nav-item dropdown mega-dropdown"><a
							class="nav-link dropdown-toggle text-muted  " href="#"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i
								class="fa fa-th-large"></i></a>
							<div class="dropdown-menu animated zoomIn">
								<ul class="mega-dropdown-menu row">


									<li class="col-lg-3  m-b-30">
										<h4 class="m-b-20">CONTACT US</h4> <!-- Contact -->
										<form>
											<div class="form-group">
												<input type="text" class="form-control"
													id="exampleInputname1" placeholder="Enter Name">
											</div>
											<div class="form-group">
												<input type="email" class="form-control"
													placeholder="Enter email">
											</div>
											<div class="form-group">
												<textarea class="form-control" id="exampleTextarea" rows="3"
													placeholder="Message"></textarea>
											</div>
											<button type="submit" class="btn btn-info">Submit</button>
										</form>
									</li>



								</ul>
							</div></li>
						<!-- End Messages -->
					</ul>
					<!-- User profile and search -->
					<ul class="navbar-nav my-lg-0">

						<!-- Search -->
						<li class="nav-item hidden-sm-down search-box"><a
							class="nav-link hidden-sm-down text-muted  "
							href="javascript:void(0)"><i class="ti-search"></i></a>
							<form class="app-search">
								<input type="text" class="form-control"
									placeholder="Search here"> <a class="srh-btn"><i
									class="ti-close"></i></a>
							</form></li>
						<!-- Comment -->
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle text-muted text-muted  " href="#"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								<i class="fa fa-bell"></i>
								<div class="notify">
									<span class="heartbit"></span> <span class="point"></span>
								</div>
						</a>
							<div
								class="dropdown-menu dropdown-menu-right mailbox animated zoomIn">
								<ul>
									<li>
										<div class="drop-title">Notifications</div>
									</li>
									<li>
										<div class="message-center">
											<!-- Message -->

											<!-- Message -->

											<!-- Message -->

											<!-- Message -->

										</div>
									</li>
									<li><a class="nav-link text-center"
										href="javascript:void(0);"> <strong>Check all
												notifications</strong> <i class="fa fa-angle-right"></i>
									</a></li>
								</ul>
							</div></li>
						<!-- End Comment -->
						<!-- Messages -->
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle text-muted  " href="#" id="2"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								<i class="fa fa-envelope"></i>
								<div class="notify">
									<span class="heartbit"></span> <span class="point"></span>
								</div>
						</a>
							<div
								class="dropdown-menu dropdown-menu-right mailbox animated zoomIn"
								aria-labelledby="2">
								<ul>
									<li>
										<div class="drop-title">You have 4 new messages</div>
									</li>
									<li>
										<div class="message-center">
											<!-- Message -->

											<!-- Message -->

											<!-- Message -->

											<!-- Message -->

										</div>
									</li>
									<li><a class="nav-link text-center"
										href="javascript:void(0);"> <strong>See all
												e-Mails</strong> <i class="fa fa-angle-right"></i>
									</a></li>
								</ul>
							</div></li>
						<!-- End Messages -->
						<!-- Profile -->
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle text-muted  " href="#"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><img
								src="resources/assets/images/users/5.jpg" alt="user"
								class="profile-pic" /></a>
							<div class="dropdown-menu dropdown-menu-right animated zoomIn">
								<ul class="dropdown-user">
									<li><a href="#"><i class="ti-user"></i> Profile</a></li>
									<li><a href="#"><i class="ti-wallet"></i> Balance</a></li>
									<li><a href="#"><i class="ti-email"></i> Inbox</a></li>
									<li><a href="#"><i class="ti-settings"></i> Setting</a></li>
									<li><a href="deconnecter?d=decon"><i
											class="fa fa-power-off"></i> Logout</a></li>
								</ul>
							</div></li>
					</ul>
				</div>
			</nav>
		</div>
		<!-- End header header -->
		<!-- Left Sidebar  -->
		<div class="left-sidebar">
			<!-- Sidebar scroll-->
			<div class="scroll-sidebar">
				<!-- Sidebar navigation-->
				<nav class="sidebar-nav">
					<ul id="sidebarnav">
						<li class="nav-devider"></li>
						<li class="nav-label">Home</li>
						<li><a class="has-arrow  " href="admin" aria-expanded="false"><i
								class="fa fa-tachometer"></i><span class="hide-menu">Dashboard</span></a>

						</li>
						<li class="nav-label">Apps</li>
						<li><a class="has-arrow  " href="categorie"
							aria-expanded="false"><i class="fa fa-envelope"></i><span
								class="hide-menu">Catégories</span></a></li>
						<li><a class="has-arrow  " href="#" aria-expanded="false"><i
								class="fa fa-bar-chart"></i><span class="hide-menu">Produits</span></a>

						</li>
						<li class="nav-label">Features</li>
						<li><a class="has-arrow  " href="#" aria-expanded="false"><i
								class="fa fa-suitcase"></i><span class="hide-menu">Clients<span></span></span></a>

						</li>
						<li><a class="has-arrow  " href="#" aria-expanded="false"><i
								class="fa fa-suitcase"></i><span class="hide-menu">Stock<span
									class="label label-rouded label-danger pull-right">2</span></span></a>
							<ul aria-expanded="false" class="collapse">
								<li><a href="uc-calender.html">Entrées Stock</a></li>
								<li><a href="uc-datamap.html">Sorties Stock</a></li>

							</ul></li>
						<li><a class="has-arrow  " href="#" aria-expanded="false"><i
								class="fa fa-wpforms"></i><span class="hide-menu">Factures<span
									class="label label-rouded label-danger pull-right">2</span></span></a>
							<ul aria-expanded="false" class="collapse">
								<li><a href="form-basic.html">Facture d'achat</a></li>
								<li><a href="form-layout.html">Facture de vente</a></li>

							</ul></li>









					</ul>
				</nav>
				<!-- End Sidebar navigation -->
			</div>
			<!-- End Sidebar scroll-->
		</div>
		<!-- End Left Sidebar  -->
		<!-- Page wrapper  -->
		<div class="page-wrapper">
			<!-- Bread crumb -->
			<div class="row page-titles">
				<div class="col-md-5 align-self-center">
					<h3 class="text-primary">Création Catégorie</h3>
				</div>
				<div class="col-md-7 align-self-center">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="javascript:void(0)">Home</a></li>
						<li class="breadcrumb-item active">Dashboard</li>
					</ol>
				</div>
			</div>
			<!-- End Bread crumb -->
			<!-- Container fluid  -->
			<div class="container-fluid">
				<!-- Start Page Content -->

				<div class="row bg-white m-l-0 m-r-0 box-shadow ">

					<!-- column -->

					<!-- column -->

					<!-- column diagramme -->
					<div class="col-lg-4"></div>
					<!-- column -->
				</div>
				<div class="row">

					<div class="col-lg-8">
						<div class="card">
							<div class="card-title">
								<form action="categorie" method="post">
									<div class="row">
										<div class="col-md-12 ">
											<div class="form-group">
												<label>Catégorie*:</label> <input type="text"
													class="form-control" name="categorie">
											</div>
										</div>
									</div>
									<div class="form-actions">
										<button type="submit" class="btn btn-success">
											<i class="fa fa-check"></i> Save
										</button>
										<button type="button" class="btn btn-inverse">Cancel</button>
									</div>
								</form>
							</div>







						</div>
					</div>





				</div>


				<div class="row"></div>


				<!-- End PAge Content -->
			</div>

			<!-- End Container fluid  -->

			<div class="col-lg-8">
				<div class="card">
					<div class="card-title">
						<h4>Table Categorie</h4>

					</div>
					<div class="card-body">
						<div class="table-responsive">
							<form action="listeCategorie" method="get">
								<table class="table table-hover ">
									<thead>
										<tr>
											<th>ID</th>
											<th>CATEGORIE</th>
											<th>ACTION</th>


										</tr>
									</thead>
									<tbody>
										<c:forEach items="${categorie}" var="rep">

											<tr>
												<td>${rep.idCategorie}</td>
												<td>${rep.libelle}</td>
												<td></td>


											</tr>
										</c:forEach>

									</tbody>
								</table>
							</form>
						</div>
					</div>
				</div>
				<!-- /# card -->
			</div>


			<!-- footer -->
			<footer class="footer">
				© 2018 All rights reserved. Gestion Stock by <a
					href="https://colorlib.com">isWane and bouguis</a>
			</footer>
			<!-- End footer -->
		</div>
		<!-- End Page wrapper  -->
	</div>
	<!-- End Wrapper -->
	<!-- All Jquery -->
	<script src="resources/assets/js/lib/jquery/jquery.min.js"></script>
	<!-- Bootstrap tether Core JavaScript -->
	<script src="resources/assets/js/lib/bootstrap/js/popper.min.js"></script>
	<script src="resources/assets/js/lib/bootstrap/js/bootstrap.min.js"></script>
	<!-- slimscrollbar scrollbar JavaScript -->
	<script src="resources/assets/js/jquery.slimscroll.js"></script>
	<!--Menu sidebar -->
	<script src="resources/assets/js/sidebarmenu.js"></script>
	<!--stickey kit -->
	<script
		src="resources/assets/js/lib/sticky-kit-master/dist/sticky-kit.min.js"></script>
	<!--Custom JavaScript -->


	<!-- Amchart -->
	<script src="resources/assets/js/lib/morris-chart/raphael-min.js"></script>
	<script src="resources/assets/js/lib/morris-chart/morris.js"></script>
	<script src="resources/assets/js/lib/morris-chart/dashboard1-init.js"></script>


	<script src="resources/assets/js/lib/calendar-2/moment.latest.min.js"></script>
	<!-- scripit init-->
	<script src="resources/assets/js/lib/calendar-2/semantic.ui.min.js"></script>
	<!-- scripit init-->
	<script src="resources/assets/js/lib/calendar-2/prism.min.js"></script>
	<!-- scripit init-->
	<script
		src="resources/assets/js/lib/calendar-2/pignose.calendar.min.js"></script>
	<!-- scripit init-->
	<script src="resources/assets/js/lib/calendar-2/pignose.init.js"></script>

	<script src="resources/assets/js/lib/owl-carousel/owl.carousel.min.js"></script>
	<script src="resources/assets/js/lib/owl-carousel/owl.carousel-init.js"></script>
	<script src="resources/assets/js/scripts.js"></script>
	<!-- scripit init-->

	<script src="resources/assets/js/custom.min.js"></script>
</body>

</html>