<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Xóa món</title>
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
        button[type="submit"] {
            padding: 10px;
            background-color: #dc3545;
            color: white;
            border: none;
            cursor: pointer;
        }
        button[type="submit"]:hover {
            background-color: #c82333;
        }
    </style>
</head>
<body>
    <h1>Xóa món</h1>
    <form action="Servlet?form=deleteMon" method="post" accept-charset="UTF-8">
        <label for="id_mon">ID Món:</label>
        <input type="text" id="id_mon" name="id_mon" required>

        <label for="flag">Flag:</label>
        <input type="checkbox" id="deleteFlag" name="flag" value="0" checked>
        <label for="deleteFlag">Đánh dấu là đã xóa</label>

        <button type="submit">Xóa món</button>
    </form>
</body>
</html>
