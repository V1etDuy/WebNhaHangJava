<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Thêm món</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        h1 {
            text-align: center;
        }
        form {
            width: 50%;
            margin: 0 auto;
        }
        label {
            display: block;
            margin-bottom: 5px;
        }
        input[type="text"],
        input[type="password"],
        input[type="tel"],
        input[type="number"],
        select {
            width: calc(100% - 10px);
            padding: 5px;
            margin-bottom: 10px;
        }
        button[type="submit"] {
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            cursor: pointer;
        }
        button[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
    
</head>
<body>
    <h1>Thêm món</h1>
    <form action="Servlet?form=addMon" method="post"  accept-charset="UTF-8">
        <label for="id_dish">ID Món:</label>
        <input type="text" id="id_mon" name="id_mon" required>
        
        <label for="name">Tên:</label>
        <input type="text" id="name" name="name" required>
        
        <label for="price">Giá:</label>
        <input type="number" id="price" name="price" required>
        
        <label for="flag">Flag:</label>
    		<input type="checkbox" id="available" name="flag" value="1">
   	 		<label for="available">Có</label>

    		<input type="checkbox" id="none" name="flag" value="0">
    		<label for="none">Không	</label>
        
        <button type="submit">Thêm món</button>
    </form>

</body>
</html>
