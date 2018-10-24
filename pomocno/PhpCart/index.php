<?php
/* [CONFIGURATION] */
require("config.php");

/* [CONNECT TO DB] */
$pdo = new PDO(
	"mysql:host=$host;dbname=$dbname;charset=$charset", 
	$user, $password, [
    PDO::ATTR_ERRMODE            => PDO::ERRMODE_EXCEPTION,
    PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC,
    PDO::ATTR_EMULATE_PREPARES   => false,
	]
);
?>
<!DOCTYPE html>
<html>
<head>
	<title>Simple PHP MYSQL Cart</title>
	
	<meta name="description" content="Cart demo">
  
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
	<!-- [BOOTSTRAP + JQUERY] -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"/>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<!-- [JS] -->
	<script src="cart.js"></script>

	<!-- [STYLE] -->
	<style>
	header.container{ background:#5dbafc; }
	footer.container{ background:#eaeaea; }
	header.container, footer.container{ padding:20px; }
	#products img{ max-width:100%; }
	#alert, #cart{ display:none; }
	</style>
</head>
<body>
	<!-- [ALERT] -->
	<div class="alert alert-success" id="alert"></div>

	<!-- [HEADER SECTION] -->
	<header class="container"><div class="row"><div class="col">
		Košarica <span onclick="toggleCart();"><i class="fas fa-shopping-cart"></i></span>
	</div></div></header>

	<!-- [PRODUCTS] -->	
	<div id="products" class="container"><div class="row"><?php
	/* [GRAB ALL THE PRODUCTS] */
	// 3 PROIZVODA U REDU
	$perrow = 3; $now = 0;
	$stmt = $pdo->query('SELECT * FROM `proizvod`');
	while ($row = $stmt->fetch()){ ?>
		<div class="col-4">
			<img src="images/<?=$row['product_image']?>"/>
			<h3><?=$row['proizvodNaziv']?></h3>
			<div>$<?=$row['product_price']?></div>
			<div><?=$row['proizvodOpis']?></div>
			<div class="btn btn-primary btn-sm" onclick="addToCart(<?=$row['product_id']?>);"><span class="glyphicon glyphicon-shopping-cart"></span> Dodaj u košaricu </div> 
		
      
     
		</div>
		<?php
		// PREKID REDA
		$now++;
		if ($now==3) {
			echo '</div><div class="row">';
			$now = 0;
		}
	} ?></div></div>

	<!-- [CART] -->
	<div class="container"><div class="row"><div class="col" id="cart"></div></div>

	<!-- [FOOTER] -->
	<footer class="container"><div class="row"><div class="col">
		&copy; DG APP
	</div></div></footer>
</body>
</html>