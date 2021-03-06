<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="content-main">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>회원 관리 
        <small>Optional description</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
        <li class="active">Here</li>
      </ol>
    </section>
    <!-- Main content -->
    <section class="content container-fluid">
    
    	<table class="table table-striped table-bordered table-hover">
    		<thead>
    			<tr>
    				<th>유저ID</th>
    				<th>Account</th>
    				<th>Email</th>
    				<th>PhoneNumber</th>
					<th>Registered</th>
    			</tr>
    		</thead>
    		<tbody>
    		<c:forEach items="${user.data}" var="user">
    			<tr>
    				<td>${user.id}</td>
    				<td>${user.account}</td>
    				<td>${user.email}</td>
    				<td>${user.phoneNumber}</td>
    				<td>${user.status}</td>
    			</tr>
   			</c:forEach>
    		</tbody>
    	</table>
    </section>
    <!-- /.content -->
</div>