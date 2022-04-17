<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="itheima" uri="http://itheima.com/common/"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() 
	                   + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>车辆管理-BootCRM</title>
	<!-- 引入css样式文件 -->
	<!-- Bootstrap Core CSS -->
	<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet" />
	<!-- MetisMenu CSS -->
	<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet" />
	<!-- DataTables CSS -->
	<link href="<%=basePath%>css/dataTables.bootstrap.css" rel="stylesheet" />
	<!-- Custom CSS -->
	<link href="<%=basePath%>css/sb-admin-2.css" rel="stylesheet" />
	<!-- Custom Fonts -->
	<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<link href="<%=basePath%>css/boot-crm.css" rel="stylesheet" type="text/css" />

<!-- Font awesome -->
<script src="https://kit.fontawesome.com/05b639d7d4.js" crossorigin="anonymous">
</script>

</head>
<body>
<div id="wrapper">

<!-- 导航栏部分 -->
  <nav class="navbar navbar-default navbar-static-top" role="navigation"
		 style="margin-bottom: 0">
	<div class="navbar-header">
		<a class="navbar-brand" href="<%=basePath%>customer/list.action">BOOT车辆管理系统 v2.0</a>
	</div>
	<!-- 导航栏右侧图标部分 -->

  <%@ include file = "top.jsp" %>
  <%@ include file = "left.jsp" %>
	
	
  </nav>
    <!-- 客户列表查询部分  start-->
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">用车管理</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="panel panel-default">
			<div class="panel-body">
				<form class="form-inline" method="get" 
				      action="${pageContext.request.contextPath }/apply/applylist.action">
					<div class="form-group">
						<label for="state">受理状态</label> 
						          
						  <select	class="form-control" id="state" name="state">
							<option value="">--请选择--</option>

							<option value="待受理" <c:if test="${param.state=='待受理'}">selected</c:if>>待受理</option>
							<option value="已审批" <c:if test="${param.state=='已审批'}">selected</c:if>>已审批</option>
									
						  </select>
						                   
					</div>
					&nbsp;&nbsp;
					
					
					
					<button type="submit" class="btn btn-primary">查询</button>
				</form>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">用车信息列表</div>
					<!-- /.panel-heading -->
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>编号</th>
								<th>申请人</th>
								
								<th>车牌</th>
								
								<th>受理状态</th>
								<th>审批人</th>
								
								<th>操作</th>
							</tr>
						</thead>
						<tbody>