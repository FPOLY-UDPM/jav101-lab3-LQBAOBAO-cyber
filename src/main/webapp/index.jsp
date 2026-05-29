<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trang Chủ</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f5f5f5;
            margin: 0;

            display: flex;
            justify-content: center;
            align-items: center;

            height: 100vh;
        }

        .menu {
            display: flex;
            gap: 15px;
            flex-wrap: wrap;
        }

        .menu a {
            text-decoration: none;
            background: #4f46e5;
            color: white;

            padding: 12px 24px;
            border-radius: 8px;

            font-weight: bold;

            transition: 0.2s;
        }

        .menu a:hover {
            background: #4338ca;
        }
    </style>
</head>

<body>

<div class="menu">
    <a href="login.jsp">Đăng nhập</a>

    <a href="url-info">Thông tin URL</a>

    <a href="share">Bai1</a>

    <a href="user">Bai2</a>

    <a href="./form">Bai3</a>

    <a href="form4/update">Bai4</a>

    <a href="students">Student</a>
</div>

</body>
</html>