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
    				<th style="width: 12%; vertical-align : middle;">제품 번호</th>
    				<th style="vertical-align : middle;">이름</th>
    				<th style="vertical-align : middle;">타이틀</th>
    				<th style="vertical-align : middle;">가격</th>
    				<th style="vertical-align : middle;">업데이트 일자</th>
					<th style="vertical-align : middle;">이미지</th>
					<th style="vertical-align : middle;">수정</th>
    			</tr>
    		</thead>
    		<tbody>
    		<c:forEach items="${item.data}" var="item">
    			<tr>
					<td style="vertical-align : middle;">${item.id}</td>
					<td style="vertical-align : middle;">${item.name}</td>
					<td style="vertical-align : middle;">${item.title}</td>
					<td style="vertical-align : middle;">${item.price} </td>
					<td style="vertical-align : middle;">${item.updated_at}</td>
					<td><img alt="image" src="..\resources\upload${item.title_img_upload}"></td>
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