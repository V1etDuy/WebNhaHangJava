<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Sửa thông tin món</title>
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
        input[type="number"] {
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
    <h1>Sửa thông tin món</h1>
    <form action="Servlet?form=editMon" method="post" accept-charset="UTF-8">
        <label for="id_mon">ID Món:</label>
        <input type="text" id="id_mon" name="id_mon" value="<%= request.getParameter("ID_Mon") %>" readonly>

        <label for="name">Tên:</label>
        <input type="text" id="name" name="name" value="<%= request.getParameter("Ten") %>" required>

        <label for="price">Giá:</label>
        <input type="number" id="price" name="price" value="<%= request.getParameter("DonGia") %>" required>

        <label for="flag">Tình trạng:</label>
        <input type="checkbox" id="available" name="flag" value="1" <%= request.getParameter("Flag").equals("1") ? "checked" : "" %>>
        <label for="available">Có</label>

        <input type="checkbox" id="none" name="flag" value="0" <%= request.getParameter("Flag").equals("0") ? "checked" : "" %>>
        <label for="none">Không</label>

        <button type="submit">Lưu thông tin</button>
    </form>
</body>
</html>
