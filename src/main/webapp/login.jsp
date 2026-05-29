<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng nhập | Hệ Thống</title>
    <style>
        :root {
            --primary-color: #4f46e5;
            --primary-hover: #4338ca;
            --bg-color: #f3f4f6;
            --card-bg: #ffffff;
            --text-color: #111827;
            --text-secondary: #6b7280;
            --border-color: #d1d5db;
        }

        body {
            font-family: 'Inter', system-ui, -apple-system, sans-serif;
            background-color: var(--bg-color);
            color: var(--text-color);
            margin: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
        }

        .login-card {
            background-color: var(--card-bg);
            padding: 2.5rem;
            border-radius: 1rem;
            box-shadow: 0 10px 25px -5px rgba(0, 0, 0, 0.1), 0 8px 10px -6px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        .login-card h2 {
            margin: 0 0 0.5rem 0;
            font-size: 1.875rem;
            font-weight: 700;
            text-align: center;
        }

        .login-card p {
            color: var(--text-secondary);
            text-align: center;
            margin-bottom: 2rem;
            font-size: 0.875rem;
        }

        .form-group {
            margin-bottom: 1.25rem;
        }

        .form-group label {
            display: block;
            font-size: 0.875rem;
            font-weight: 500;
            margin-bottom: 0.5rem;
            color: var(--text-color);
        }

        .form-group input {
            width: 100%;
            padding: 0.75rem;
            border: 1px solid var(--border-color);
            border-radius: 0.5rem;
            box-sizing: border-box;
            transition: border-color 0.2s, ring 0.2s;
            font-size: 1rem;
        }

        .form-group input:focus {
            outline: none;
            border-color: var(--primary-color);
            box-shadow: 0 0 0 3px rgba(79, 70, 229, 0.1);
        }

        button {
            width: 100%;
            background-color: var(--primary-color);
            color: white;
            padding: 0.75rem;
            border: none;
            border-radius: 0.5rem;
            font-size: 1rem;
            font-weight: 600;
            cursor: pointer;
            transition: background-color 0.2s;
            margin-top: 0.5rem;
        }

        button:hover {
            background-color: var(--primary-hover);
        }

        .back-home {
            display: block;
            text-align: center;
            margin-top: 1.5rem;
            text-decoration: none;
            color: var(--primary-color);
            font-size: 0.875rem;
            font-weight: 500;
        }

        .back-home:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="login-card">
        <h2>Đăng nhập</h2>
        <p>Vui lòng nhập thông tin để truy cập hệ thống</p>
        
        <%-- Hiển thị thông báo nếu có --%>
        <% 
            String msg = (String) request.getAttribute("message");
            if(msg != null) {
        %>
            <div style="padding: 10px; margin-bottom: 15px; border-radius: 5px; background-color: #fee2e2; color: #b91c1c; font-size: 0.875rem; text-align: center; border: 1px solid #fecaca;">
                <%= msg %>
            </div>
        <% } %>

        <form action="login" method="post">
            <div class="form-group">
                <label for="username">Email hoặc Tên đăng nhập</label>
                <input type="text" id="username" name="txt_username" 
                       value="<%= request.getParameter("txt_username") != null ? request.getParameter("txt_username") : "" %>" 
                       placeholder="Nhập email của bạn" required>
            </div>
            
            <div class="form-group">
                <label for="password">Mật khẩu</label>
                <input type="password" id="password" name="txt_password" placeholder="••••••••" required>
            </div>
            
            <button type="submit">Đăng nhập</button>
        </form>

        <a href="index.jsp" class="back-home">← Quay lại trang chủ</a>
    </div>
</body>
</html>
