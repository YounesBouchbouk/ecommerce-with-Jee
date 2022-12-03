<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="styles/style.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet">
      
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>    
	<title>Category Page</title>
</head>
<body>



<div class="wrapper">
        <nav id="sidebar">
            <div class="sidebar-header">
                <h3>Ecommerce Dashboard</h3>
            </div>
           <ul class="list-unstyled components">
                <li>
                    <a href="index.html"><i class="material-icons fit">dashboard</i>DASHBOARD</a>
                </li>
                <li>
                    <a href="order_list.html"><i class="material-icons fit">event_note</i>ORDER LIST</a>
                </li>
                <li>
                    <a href="product.html"><i class="material-icons fit">store</i>PRODUCT</a>
                </li>
                <li class="active">
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
                    <a href="#"><i class="material-icons fit">error</i>ABOUT</a>
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
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
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
                               <form class="form-inline">
                                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                                        <button class="btn btn-outline-success my-2 my-sm-0 mr-sm-2" type="submit">Search</button>
                              </form>
                            </li>
                            <li class="nav-item">
                               <button class="btn btn-outline-success">ADD CATEGORY</button>
                            </li>
                            <li class="nav-item">
                                <button class="nav-button"><i class="material-icons down">more_vert</i></button>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>  
            
            <!-- cards view for products  -->
            <div id="card_content">
            <div class="card">
                <div class="card-body">
                   <table class="table table-hover">
                        <thead>
                            <th scope="col">NO</th>
                            <th scope="col">Name</th>
                            <th scope="col">Color</th>
                            <th scope="col">Type</th>
                            <th scope="col">Update</th>
                            <th scope="col">Action</th>
                        </thead>
                        <tbody>
                            <tr>
                                <th scope="row">1</th>
                                <td>Sports and Hobby </td>
                                <td>#8ddd6f</td>
                                <td>PUBLISHED</td>
                                <td>08 Feb 17</td>
                                <td><button class="no-border"><i class="material-icons down">wallpaper</i></button> <button class="no-border"><i class="material-icons down">delete</i></button> <button class="no-border"><i class="material-icons down">edit</i></button> </td>
                            </tr>
                            <tr>
                                <th scope="row">2</th>
                                <td>Service and Food</td>
                                <td>#ff6f52</td>
                                <td>PUBLISHED</td>
                                <td>08 Feb 17</td>
                                <td><button class="no-border"><i class="material-icons down">wallpaper</i></button> <button class="no-border"><i class="material-icons down">delete</i></button> <button class="no-border"><i class="material-icons down">edit</i></button> </td>
                            </tr>
                        </tbody>
                    </table>
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