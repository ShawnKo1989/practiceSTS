/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-08-21 07:53:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ssBoard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ssBoardPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>게시글 페이지</title>\r\n");
      out.write("<script src=\"/Miniproject/js/jquery-3.7.0.min.js\"></script>\r\n");
      out.write("<link href=\"/Miniproject/css/ssBoardPage.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"outline\">\r\n");
      out.write("	<div class=\"headTitle\">\r\n");
      out.write("		<h1>게시글</h1>\r\n");
      out.write("		<h5>유저가 입력한 게시글을 확인할수 있는 페이지입니다.</h5>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"topBtnArea\">\r\n");
      out.write("		<div id=\"topLeftBtn\" class=\"topBtn\"> ← 이전글 확인</div>\r\n");
      out.write("		<div id=\"topRightBtn\" class=\"topBtn\">다음글 확인 →</div>\r\n");
      out.write("	</div>\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>글번호</th>\r\n");
      out.write("				<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ssbno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("				<th>글제목</th>\r\n");
      out.write("				<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sstitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("			</tr>		\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>작성자</th>\r\n");
      out.write("				<td colspan=\"3\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sswriter}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("			</tr>		\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th colspan=\"4\">내용</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"4\">\r\n");
      out.write("					<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sscontents}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><br/><br/>\r\n");
      out.write("					<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sscontent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>		\r\n");
      out.write("		</table>\r\n");
      out.write("		<div class=\"mdArea\">\r\n");
      out.write("			<div id=\"modifyBtn\" class=\"mdBtns\">글수정</div>\r\n");
      out.write("			<div id=\"deleteBtn\" class=\"mdBtns\">글삭제</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"bottomText\">\r\n");
      out.write("			<div class=\"bottom_left\">\r\n");
      out.write("				<span><img src=\"https://i.pinimg.com/originals/49/85/1c/49851c166722c7cb9f9cf905f617e266.png\" class=\"clickIcon\">\r\n");
      out.write("				");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sslike}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("명이 이 게시글을 좋아합니다!</span>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"bottom_right\">\r\n");
      out.write("				<span><img src=\"https://cdn-icons-png.flaticon.com/512/2394/2394105.png\" class=\"clickIcon\">\r\n");
      out.write("				");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ssview}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("명이 이 게시글을 확인하였습니다!</span>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("			<div class=\"btnArea\">\r\n");
      out.write("				<div class=\"btnButton\">				\r\n");
      out.write("					<div class=\"bottomBtnText\">\r\n");
      out.write("					<img src=\"https://i.pinimg.com/originals/49/85/1c/49851c166722c7cb9f9cf905f617e266.png\" class=\"clickIcon\">\r\n");
      out.write("					좋아요!</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"btnButton\">	\r\n");
      out.write("					<div id=\"moveToList\" class=\"bottomBtnText\">목록으로</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("		//알림메시지 기능\r\n");
      out.write("		var message = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("		if(message!='null'&& message!=''){\r\n");
      out.write("			alert(message);\r\n");
      out.write("		}\r\n");
      out.write("		//각 버튼 클릭 기능\r\n");
      out.write("		$(function(){\r\n");
      out.write("			$(\"#moveToList\").click(function(){\r\n");
      out.write("				location.href=\"/Miniproject/Controller?command=SsBoardListMoveAction\";\r\n");
      out.write("			});\r\n");
      out.write("			$(\"#topLeftBtn\").click(function(){\r\n");
      out.write("				location.href=\"/Miniproject/Controller?command=SsBoardPrevMoveAction&ssbno=\"+");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ssbno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("			});\r\n");
      out.write("			$(\"#topRightBtn\").click(function(){\r\n");
      out.write("				location.href=\"/Miniproject/Controller?command=SsBoardNextMoveAction&ssbno=\"+");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ssbno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("			});\r\n");
      out.write("			$(\"#deleteBtn\").click(function(){\r\n");
      out.write("				location.href=\"/Miniproject/Controller?command=SsBoardDeleteAction&ssbno=\"+");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ssbno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}