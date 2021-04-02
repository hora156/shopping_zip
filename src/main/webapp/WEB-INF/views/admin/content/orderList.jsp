<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="panel-body">

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
    <section class="content container-fluid">
    	<table class="table table-striped table-bordered table-hover text-center">
    		<thead>
    			<tr class="something">
					<th style="width: 8.33%">유저ID</th>
    				<th>주문 번호</th>
    				<th>주문 상태</th>
    				<th>주문 일자</th>
    				<th>총 금액</th>
    				<th>총 수량</th>
    			</tr>
    		</thead>
    		<tbody>
    		<c:forEach items="${order.data}" var="order">
    			<tr data-toggle="collapse" data-target="#${order.id}" class="accordion-toggle">
    				<td>${order.user_id}</td>
    				<td>${order.id}</td>
    				<td>${order.status}</td>
    				<td>${order.order_at}</td>
    				<td>${order.total_price}</td>
    				<td>${order.total_quantity}</td>
    			</tr>
    		<tr>
            <td colspan="12" class="hiddenRow">
			<div class="accordian-body collapse" id="${order.id}"> 
            <table class="table table-striped">
            <thead>
			<tr class="info">
				<th style="width: 12%">구매 번호</th>
				<th>상품 이름</th>
				<th>갯수</th>		
				<th>금액</th>	
				<th>도착 예정 일자</th>	
				<th>수정</th>	
			</tr>
			</thead>	
			<tbody>
			<c:forEach items="${order.orderDetailList}" var="detail">					
	            <tr data-toggle="collapse"  class="accordion-toggle">
					<td>${detail.id}</td>
					<td>${detail.name}</td>
					<td>${detail.quantity} </td>
					<td>${detail.total_price}</td>
					<td>${detail.arrival_date}</td>
					<td> 
						<a href="#" class="btn btn-default btn-sm">
							<i class="glyphicon glyphicon-cog"></i>
						</a>
					</td>
				</tr>
			</c:forEach>
        </tbody>
        </table>
        </div>
        </td>
        </tr>
   			</c:forEach>
    		</tbody>
    	</table>
    
    </section>
    <!-- /.content -->

</div>