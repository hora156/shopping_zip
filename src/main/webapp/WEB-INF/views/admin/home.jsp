<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>

<%@ include file="include/head.jsp" %>

<!--
BODY TAG OPTIONS:
=================
Apply one or more of the following classes to get the
desired effect
|---------------------------------------------------------|
| SKINS         | skin-blue                               |
|               | skin-black                              |
|               | skin-purple                             |
|               | skin-yellow                             |
|               | skin-red                                |
|               | skin-green                              |
|---------------------------------------------------------|
|LAYOUT OPTIONS | fixed                                   |
|               | layout-boxed                            |
|               | layout-top-nav                          |
|               | sidebar-collapse                        |
|               | sidebar-mini                            |
|---------------------------------------------------------|
-->
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">


<%@ include file="include/main_header.jsp" %>

<%@ include file="include/left_column.jsp" %>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>주문 관리 
        <small>Optional description</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
        <li class="active">Here</li>
      </ol>
    </section>
    <!-- Main content -->
    <section id="content" class="content container-fluid">
    
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  
<%@ include file="include/main_footer.jsp" %>
<%@ include file="include/right_column.jsp" %>

</div>
<!-- ./wrapper -->

<!-- REQUIRED JS SCRIPTS -->
<%@ include file="include/plugin_js.jsp" %> 

<script type="text/javascript">

function getUser() {
	$.ajax({
		url:"/admin/userList",
		success:function(result){
			var html = jQuery('<div>').html(result);
			var contents = html.find("#content-main").html();
			$('#content').html(contents);
		}
	});
}

function getOrderInfo() {
	$.ajax({
		url:"/admin/orderList",
		success:function(result){
			var html = jQuery('<div>').html(result);
			var contents = html.find("#panel-body").html();
			$('#content').html(contents);
		}
	});
}
			
$(document).ready(function() {
	getOrderInfo();
});

</script>


</body>
</html>

















