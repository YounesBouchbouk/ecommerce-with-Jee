<html>

<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="styles/style.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>
	<title>Order List Page</title>
</head>
<body>



<div class="wrapper">
        <nav id="sidebar">
            <div class="sidebar-header">
                <h3>Ecommerce Dashboard</h3>
            </div>
            <ul class="list-unstyled components">
                <li class="active">
                    <a href="index.jsp"><i class="material-icons fit">dashboard</i>DASHBOARD</a>
                </li>
                <li>
                    <a href="order_list.jsp"><i class="material-icons fit">event_note</i>ORDER LIST</a>
                </li>
                <li>
                    <a href="product.jsp"><i class="material-icons fit">store</i>PRODUCT</a>
                </li>
                <li>
                    <a href="category.jsp"><i class="material-icons fit">dns</i>CATEGORY</a>
                </li>
                <li>
                    <a href="userList.jsp"><i class="material-icons fit">dns</i>Users</a>
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
                                <button class="nav-button"><i class="material-icons down">more_vert</i></button>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
    <div id="card_content">     
        <div class="card">
            <div class="card-body">
                    <div class="container">
                      <form>
                        <div class="row">
                          <div class="col-6 form-group">
                            <input type="text" class="form-control" name="buyer_name" placeholder="Buyer Name *">
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-3 form-group">
                            <input type="text" class="form-control" name="phone" placeholder="Phone *">
                          </div>
                          <div class="col-3 form-group">
                            <input type="text" class="form-control" name="email" placeholder="Email *">
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-6">
                            <input type="text" class="form-control" name="address" placeholder="Address *">
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-3">
                            <label></label>
                              <select class="custom-select">
                                <option selected>Shipping...</option>
                                <option value="1">One</option>
                                <option value="2">Two</option>
                                <option value="3">Three</option>
                              </select>
                          </div>
                          <div class="col-3">
                            <label></label>
                              <input class="form-control" type="date" name="date"/>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-3 form-group">
                            <label></label>
                              <select class="custom-select">
                                <option selected>Order Status...</option>
                                <option value="1">One</option>
                                <option value="2">Two</option>
                                <option value="3">Three</option>
                              </select>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col-6">
                            <input type="text" name="comment" class="form-control" placeholder="Comment">
                          </div>
                        </div>
                      </form>

                      <div class="row">
                        <div class="col-12">
                        <h5>List Product Order :</h5>
                        <table class="table table-hover">
                        <thead>
                            <th scope="col">NO</th>
                            <th scope="col">Product</th>
                            <th scope="col">Price Item</th>
                            <th scope="col">Amount</th>
                            <th scope="col">Price Total</th>
                            <th scope="col">Action</th>
                        </thead>
                        <tbody>
                            <tr>
                                <th scope="row"></th>
                                <td>Ahmed Kamal Madani</td>
                                <td>SG93166MF</td>
                                <td>28 Jan 19</td>
                                <td>28 Jan 19</td>
                               <td><button class="no-border"><i class="material-icons down">more_vert</i></button></td>
                            </tr>
                        </tbody>
                    </table>
                      </div>
                  </div>
            </div>
        </div>
      </div>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
<script type="text/javascript" >
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