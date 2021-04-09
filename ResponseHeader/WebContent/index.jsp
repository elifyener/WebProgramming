<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
 	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<meta charset="UTF-8">
	<title>Öğrenci Listesi</title>
</head>
<body>

<form action="response-header" method="post">
	<div class="container">
	  <h2>Öğrenci Listesi</h2>
	  <p>Görüntülemek istediğiniz formatı seçiniz.</p>                                   
	  
	  <div class="form-group">
	    <label for="FormControlSelect">Lütfen seçim yapınız.</label>
	    <select class="form-control" name="FormControlSelect">
	      <option value = "Word">Word</option>
	      <option value = "Pdf">Pdf</option>
	      <option value = "Excel">Excel</option>
	    </select>
	  </div>
	  
	  <button type="submit" class="btn btn-primary">Görüntüle</button>
	  
	</div>
</form>

</body>
</html>