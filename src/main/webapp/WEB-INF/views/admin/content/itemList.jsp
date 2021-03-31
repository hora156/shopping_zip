<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="content-main">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>상품 관리 
        <small>Optional description</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
        <li class="active">Here</li>
      </ol>
    </section>
    <!-- Main content -->
    <section class="content container-fluid">
    
    	<table class="table table-striped table-bordered table-hover text-center">
    		<thead>
    			<tr>
    				<th style="width: 12%">제품 번호</th>
    				<th>이름</th>
    				<th>타이틀</th>
    				<th>가격</th>
    				<th>업데이트 일자</th>
					<th>수정</th>
    			</tr>
    		</thead>
    		<tbody>
    		<c:forEach items="${item.data}" var="item">
    			<tr>
					<td>${item.id}</td>
					<td>${item.name}</td>
					<td>${item.title}</td>
					<td>${item.price} </td>
					<td>${item.updated_at}</td>
					<td> 
						<a href="#" class="btn btn-default btn-sm">
							<i class="glyphicon glyphicon-cog"></i>
						</a>
					</td>
    			</tr>
   			</c:forEach>
    		</tbody>
    	</table>
    <div class="col-12 text-right">
      	<button onclick="itemDetail();">제품 추가</button>
	</div>
    </section>
    <!-- /.content -->
</div>