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
  <div id="content" class="content-wrapper">

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

function getItem() {
	$.ajax({
		url:"/admin/itemList",
		success:function(result){
			var html = jQuery('<div>').html(result);
			var contents = html.find("#content-main").html();
			$('#content').html(contents);
		}
	});
}

function itemDetail() {
	$.ajax({
		url:"/admin/itemDetail",
		success:function(result){
			var html = jQuery('<div>').html(result);
			var contents = html.find("#content-main").html();
			$('#content').html(contents);
		}
	});
}

function uploadItem() {
    var form = jQuery("#fileForm")[0];
    var formData = new FormData(form);
	$.ajax({
		url:"/admin/uploadItem",
		type : "POST",
		processData : false,
		contentType : false,
	    data : formData,
		success:function(result){
			getItem();
		}
	});
}
			
$(document).ready(function() {
	getOrderInfo();
});

</script>


</body>
</html>

















