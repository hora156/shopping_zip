<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="content-main">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>제품 추가
        <small>Optional description</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
        <li class="active">Here</li>
      </ol>
    </section>
    <!-- Main content -->
    <section class="content container-fluid">
    <form id="fileForm" method="post" enctype="multipart/form-data">
    	<table class="table table-striped table-bordered table-hover text-center">
    		<tr>
    			<th>제품 이름</th>
    			<td colspan="3"><input style="width: 100%" type="text" name="name" placeholder="제품 이름"></td>
    		</tr>
    		<tr>
    			<th>타이틀</th>
    			<td colspan="3"><input style="width: 100%" type="text" name="title" placeholder="타이틀"></td>
    		</tr>
    		<tr>
    			<th>제품 설명</th>
    			<td colspan="3"><textarea style="width: 100%" type="text" name="content" placeholder="제품 설명"></textarea></td>
    		</tr>
    		<tr>
    			<th>가격</th>
    			<td colspan="3"><input style="width: 100%" type="text" name="price" placeholder="가격"></td>
    		</tr>
    		<tr>
    			<th>브렌드</th>
    			<td colspan="3"><input style="width: 100%" type="text" name="brand_name" placeholder="브렌드"></td>
    		</tr>
    		<tr>
    			<th>타이틀 이미지</th>
    			<td><input type="file" name="title_img"></td>
    			<th>이미지 파일</th>
    			<td><input type="file" name="multi_img"  multiple="true"></td>
    		</tr>
    	</table>
    <div class="col-12 text-right">
      	<input type="button" onclick="uploadItem();" value="추가">
	</div>
	</form>
    </section>
    <!-- /.content -->
</div>