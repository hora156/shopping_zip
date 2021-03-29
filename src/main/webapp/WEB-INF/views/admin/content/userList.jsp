<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="content-main">
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
</div>