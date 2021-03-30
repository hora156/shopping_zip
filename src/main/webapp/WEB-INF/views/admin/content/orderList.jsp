<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="panel-body">
    	<table class="table table-striped table-bordered table-hover">
    		<thead>
    			<tr>
					<th>유저ID</th>
    				<th>주문번호</th>
    				<th>주문상태</th>
    				<th>총 금액</th>
    				<th>수량</th>
    			</tr>
    		</thead>
    		<tbody>
    		<c:forEach items="${order.data}" var="order">
    			<tr data-toggle="collapse" data-target="#${order.id}" class="accordion-toggle">
    				<td>${order.user_id}</td>
    				<td>${order.id}</td>
    				<td>${order.status}</td>
    				<td>${order.total_price}</td>
    				<td>${order.total_quantity}</td>
    			</tr>
    		<tr>
            <td colspan="12" class="hiddenRow">
			<div class="accordian-body collapse" id="${order.id}"> 
            <table class="table table-striped">
            <thead>
			<tr class="info">
				<th>Job</th>
				<th>Company</th>
				<th>Salary</th>		
				<th>Date On</th>	
				<th>Date off</th>	
				<th>Action</th>	
			</tr>
			</thead>	
			<tbody>						
            <tr data-toggle="collapse"  class="accordion-toggle" data-target="#demo10">
				<td> <a href="#">Enginner Software</a></td>
				<td>Google</td>
				<td>U$8.00000 </td>
				<td> 2016/09/27</td>
				<td> 2017/09/27</td>
				<td> 
					<a href="#" class="btn btn-default btn-sm">
						<i class="glyphicon glyphicon-cog"></i>
					</a>
				</td>
			</tr>
			
			<tr>
            <td colspan="12" class="hiddenRow">
			<div class="accordian-body collapse" id="demo10"> 
            <table class="table table-striped">
			<thead>
			<tr>
				<td><a href="#"> XPTO 1</a></td>
				<td>XPTO 2</td>
				<td>Obs</td>
			</tr>
			<tr>
				<th>item 1</th>
				<th>item 2</th>
				<th>item 3 </th>
				<th>item 4</th>
				<th>item 5</th>
				<th>Actions</th>
			</tr>
			</thead>
			<tbody>
			<tr>
				<td>item 1</td>
				<td>item 2</td>
				<td>item 3</td>
				<td>item 4</td>
				<td>item 5</td>
				<td>
					<a href="#" class="btn btn-default btn-sm">
						<i class="glyphicon glyphicon-cog"></i>
					</a>
				</td>
			</tr>
			</tbody>
		   	</table>
            </div> 
          </td>
        </tr>
        </tbody>
        </table>
        </div>
        </td>
        </tr>
   			</c:forEach>
    		</tbody>
    	</table>
</div>