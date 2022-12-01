<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="styles/style.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>

	<title>Dashboard Page</title>
</head>
<body>



<div class="wrapper">
        <nav id="sidebar">
            <div class="sidebar-header">
                <h3>Ecommerce Dashboard</h3>
            </div>
            <ul class="list-unstyled components">
                <li class="active">
                    <a href="index.html"><i class="material-icons fit">dashboard</i>DASHBOARD</a>
                </li>
                <li>
                    <a href="order_list.html"><i class="material-icons fit">event_note</i>ORDER LIST</a>
                </li>
                <li>
                    <a href="product.html"><i class="material-icons fit">store</i>PRODUCT</a>
                </li>
                <li>
                    <a href="category.html"><i class="material-icons fit">dns</i>CATEGORY</a>
                </li>
                <li>
                    <a href="news.html"><i class="material-icons fit">subject</i>NEWS INFO</a>
                </li>
                <li>
                    <a href="application.html"><i class="material-icons fit">adb</i>APP</a>
                </li>
                <li>
                    <a href="notification.html"><i class="material-icons fit">notifications</i>NOTIFICATION</a>
                </li>
                <li>
                    <a href="#"><i class="material-icons fit">settings</i>SETTING</a>
                </li>
                <li>
                    <a href="#"><i class="material-icons fit">error</i>ABOUT </a>
                </li>
            </ul>

            <ul class="list-unstyled CTAs">
                <li>
                    <a href="https://bootstrapious.com/tutorial/files/sidebar.zip" class="download">Download</a>
                </li>
                <li>
                    <a href="https://bootstrapious.com/p/bootstrap-sidebar" class="article">Link to Website</a>
                </li>
            </ul>
        </nav>

	   <div id="content">
            <nav class="navbar navbar-expand-lg navbar-light">
                <div class="container-fluid">

                    <button type="button" id="sidebarCollapse" class="btn btn-info">
                        <i class="fas fa-align-left"></i>
                    </button>
                    <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <i class="fas fa-align-justify"></i>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="nav navbar-nav ml-auto">
                           <li class="nav-item">
                                <button class="nav-button"><i class="material-icons down">more_vert</i></button>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>

            <!-- cards view for dashboard to explain main info  -->
        <div id="card_content">
            <div class="card">
            	<div class="card-body">
            		<h4>Product Order</h4>
            		<div class="line-title"></div>
            		  <div class="container">
                        <div class="row">
                            <div class="col">
                                <h6>Waiting  : 0 </h6>
                                <h6>Processed  : 0 </h6>
                                <h6>Total Order : 0 </h6>
                            </div>
                            <div class="col"></div>
                            <div class="w-100"></div>
                            <br>
                            <div class="col">
                                <h4>Product Information</h4>
                           <div class="line-title"></div>
                                 <h6>Published  : 0 </h6>
                                 <h6>Draft  : 0 </h6>

                                  <div class="line-title"></div>
                                 <h6>Ready Stock  : 0 </h6>
                                 <h6>Out of Stock  : 0 </h6>
                                 <h6>Suspend  : 0 </h6>
                        </div>
                            <div class="col">
                            <h4>Category Information</h4>
                           <div class="line-title"></div>
                                 <h6>Published  : 0 </h6>
                                 <h6>Draft  : 0 </h6>
                        </div>
                        </div>
                        </div>
            	</div>
            </div>

            <div class="line"></div>

            <div class="card">
                <div class="card-body">
                      <div class="container">
                        <div class="row">
                            <div class="col">
                                 <h4>News Info</h4>
                    <div class="line-title"></div>
                                <h6>Featured  : 0 </h6>
                                <h6>Published  : 0 </h6>
                                <h6>Draft : 0 </h6>
                            </div>

                            <div class="col">
                                  <div class="col">
                                 <h4>App Version</h4>
                    <div class="line-title"></div>
                                <h6>Active  : 0 </h6>
                                <h6>Inactive  : 0 </h6>
                            </div>
                            </div>

                            <div class="w-100"></div>
                            <br>
                            <div class="col">
                                <h4>Application Setting</h4>
                           <div class="line-title"></div>
                                 <h6>Currency  : USD </h6>
                                 <h6>Tax  : 11 % </h6>
                        </div>
                            <div class="col">
                            <h4>Notification</h4>
                           <div class="line-title"></div>
                                 <h6>Users  : 0 </h6>
                        </div>
                        </div>
                        </div>
                </div>
            </div>
        </div>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
<script type="text/javascript" >
	$(document).ready(function (){
		$('#sidebarCollapse').on('click', function(){
			$('#sidebar').toggleClass('active');
			$(this).toggleClass('active');
		});
	});
</script>
</html>