package controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.ThucDon;
import model.bo.BO;
@WebServlet("/")
public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        String destination = null;
        RequestDispatcher rd;
        BO BO = new BO();
        switch (action) {
//            case "/addAccount":
//            	destination = "/addAccount.jsp";
//            	rd = getServletContext().getRequestDispatcher(destination);
//            	rd.forward(request, response);
//                break;
//            case "/KiểmTraID":
//                // Xử lý yêu cầu kiểm tra ID tài khoản
//                String idToCheck = request.getParameter("id");
//                boolean isExisted = BO.checkIDExisted(idToCheck);
//                // Gửi kết quả trở lại
//                response.setContentType("text/plain");
//                PrintWriter out = response.getWriter();
//                if (isExisted) {
//                    out.print("EXISTED");
//                } else {
//                    out.print("NOT_EXISTED");
//                }
//                out.close();
//                break;
//            case "/viewAccounts":
//            	ArrayList<taikhoan> TKArray = new ArrayList<taikhoan>();
//            	ArrayList<thongtintaikhoan> ThongTinTKArray = new ArrayList<thongtintaikhoan>();
//            	TKArray = BO.xemAllAccount();
//            	ThongTinTKArray = BO.xemAllThongTinAccount();
//            	request.setAttribute("TKArray", TKArray);
//            	request.setAttribute("ThongTinTKArray", ThongTinTKArray);
//            	destination = "/xemAccount.jsp";
//            	rd = getServletContext().getRequestDispatcher(destination);
//            	rd.forward(request, response);
//                break;
//            case "/xoaTaiKhoan":
//            	String idToDel = request.getParameter("id");
//            	BO.delAccount(idToDel);
//            	destination = "/index_loggin_admin.jsp";
//            	rd = getServletContext().getRequestDispatcher(destination);
//            	rd.forward(request, response);
//            	break;
//            case "/suaTaiKhoan":
//            	String idToEdit = request.getParameter("id");
//            	
//            	taikhoan taikhoan = new taikhoan();
//            	thongtintaikhoan thongtintaikhoan = new thongtintaikhoan();
//            	
//            	taikhoan = BO.getTaiKhoan(idToEdit);
//            	thongtintaikhoan = BO.getThongTinTaiKhoan(idToEdit);
//            	
//            	request.setAttribute("taikhoan", taikhoan);
//            	request.setAttribute("thongtintaikhoan", thongtintaikhoan);
//            	destination = "/editAccount.jsp";
//            	rd = getServletContext().getRequestDispatcher(destination);
//            	rd.forward(request, response);
//            	break;
            case "/createOrder":
                break;
            case "/orderHistory":
                break;
            case "/viewMenu":
            	ArrayList<ThucDon> TDArray = new ArrayList<ThucDon>();
            	ArrayList<ThucDon> ThongTinTD = new ArrayList<ThucDon>();
            	TDArray = BO.getAllMon();
            	ThongTinTD = BO.getAllMon();
            	request.setAttribute("TKArray", TDArray);
            	request.setAttribute("ThongTinMon", ThongTinTD);
            	destination = "/xemMenu.jsp";
            	rd = getServletContext().getRequestDispatcher(destination);
            	rd.forward(request, response);
                break;
            case "/xoaMon":
            	String flagToDel = request.getParameter("Ten");
            	BO.deleteMon(flagToDel);
            	destination = "/xemMenu.jsp";
            	rd = getServletContext().getRequestDispatcher(destination);
            	rd.forward(request, response);
            	break;
            case "/suaMon":
            	String idToUpdate = request.getParameter("ID_Mon");
            	BO.deleteMon(idToUpdate);
            	destination = "/xemMenu.jsp";
            	rd = getServletContext().getRequestDispatcher(destination);
            	rd.forward(request, response);
            	break;
                
            default:
                response.sendError(HttpServletResponse.SC_NOT_FOUND);
                break;
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	String action = request.getParameter("action");
    	String formType = request.getParameter("form");
    	String destination = null;
    	RequestDispatcher rd;
        BO bo = new BO();
    	switch (formType) {
//        case "login":
//        	String username = request.getParameter("username");
//            String password = request.getParameter("password");
//            if (!bo.isValidLogin(username, password)) {
//                // Login failed
//            	destination = "/loggin.jsp";
//                request.setAttribute("errorMessage", "Tên đăng nhập hoặc mật khẩu không đúng");
//                rd = getServletContext().getRequestDispatcher(destination);
//            	rd.forward(request, response);
//                return;
//            }else {    
//            	if(bo.isAdminOrStaff(username)) {
//            		destination = "/index_loggin_admin.jsp";
//            		rd = getServletContext().getRequestDispatcher(destination);
//                	rd.forward(request, response);
//            	}else {
//            		destination = "/index_loggin_staff.jsp";
//            		rd = getServletContext().getRequestDispatcher(destination);
//                	rd.forward(request, response);
//            	}
//            }
//        	break;
//        case "addAccount":
//        	String idtk = request.getParameter("idtk");
//        	String newUsername = request.getParameter("username");
//            String newPasswordAdd = request.getParameter("password");
//            String ten = request.getParameter("ten");
//            String sdt = request.getParameter("sdt");
//            String diachi = request.getParameter("diachi");
//            String luong = request.getParameter("luong");
//            String vaitro = request.getParameter("vaitro");
//            bo.addTaiKhoan(idtk, newUsername, newPasswordAdd, vaitro);
//            bo.addThongTinTaiKhoan(idtk, ten, sdt, diachi, luong);
//            destination = "/index_loggin_admin.jsp";
//    		rd = getServletContext().getRequestDispatcher(destination);
//        	rd.forward(request, response);
//        	break;
//        case "editAccount":
//        	String idtk_ed = request.getParameter("idtk");
//        	String newUsername_ed = request.getParameter("username");
//            String newPasswordAdd_ed = request.getParameter("password");
//            String ten_ed = request.getParameter("ten");
//            String sdt_ed = request.getParameter("sdt");
//            String diachi_ed = request.getParameter("diachi");
//            String luong_ed = request.getParameter("luong");
//            String vaitro_ed = request.getParameter("role");
//            bo.updateTaiKhoan(idtk_ed, newUsername_ed, newPasswordAdd_ed, vaitro_ed);
//            bo.updateThongTinTaiKhoan(idtk_ed, ten_ed, sdt_ed, diachi_ed, luong_ed);
//            destination = "/index_loggin_admin.jsp";
//    		rd = getServletContext().getRequestDispatcher(destination);
//        	rd.forward(request, response);
//        	break;
    	
    		case "addMon":
    			String ID_Mon = request.getParameter("ID_Mon");
    			String Ten = request.getParameter("Ten");
    			String DonGia = request.getParameter("DonGia");
    			String Flag = request.getParameter("Flag");
    			bo.addMon(ID_Mon, Ten, DonGia, Flag);
    			destination = "/xemMenu.jsp";
  		    	rd = getServletContext().getRequestDispatcher(destination);
  		    	rd.forward(request, response);
        default:
        	            
        	break;
        
    }
   }
        

}
