<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Insert title here</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background-image: url(../View/kitty.jpg);
            background-size: cover;
            background-position: center;
            color: #ffffff;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            background-color: rgba(0, 0, 0, 0.7);
            padding: 20px;
            border-radius: 10px;
            text-align: center;
        }

        a {
            display: block;
            margin-bottom: 10px;
            font-size: 1.2em;
            color: #ff6699;
            text-decoration: none;
            transition: color 0.3s;
        }

        a:hover {
            color: #ff3366;
        }
    </style>
</head>
<body>
    <form>
        <a href="<%=request.getContextPath()%>/addAccount">Tạo mới tài khoản</a>
        <a href="<%=request.getContextPath()%>/viewAccounts">Xem tài khoản</a>
        <a href="<%=request.getContextPath()%>/createOrder">Tạo đơn hàng</a>
        <a href="<%=request.getContextPath()%>/orderHistory">Lịch sử đơn hàng</a>
         <a href="<%=request.getContextPath()%>/viewMenu">Thêm món</a>
        <a href="<%=request.getContextPath()%>/viewMenu">Xem thực đơn</a>
    </form>
</body>
</html>
