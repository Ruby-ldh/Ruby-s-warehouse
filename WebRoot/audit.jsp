<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

 <title>E&nbsp;R&nbsp;P&nbsp;配&nbsp;&nbsp;置</title>
<meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
 
  <!-- Font Awesome Icons -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">
  <!-- Navbar -->
    <nav class="main-header navbar navbar-expand bg-white navbar-light border-bottom">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
     <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#"><i class="fa fa-bars"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="findByOrdName.do" class="nav-link">Home</a>
      </li>
      
    </ul>
   
   <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
    
     <li class="nav-item dropdown">
       <c:choose>
				<c:when test="${sex.equals('0') }">
		<div class="user-panel dropdown-toggle" data-toggle="dropdown">			
      
      <div class="image">
          <img src="${pageContext.request.contextPath}/img/avatar5.png" class="img-circle elevation-2" alt="User Image"
          style="opacity:.8">
        </div>
      ${person.name }
    </div>
    
    <ul class="dropdown-menu dropdown-menu-right" role="menu">
		
		<li><a href="findByIdApply.do?sqId=${person.jobId }" class="nav-link">
			<i class="fa fa-circle"></i>
				<span>&nbsp;&nbsp;申请历史</span></a></li>
	</ul>
				</c:when>
				<c:otherwise>
				<div class="user-panel dropdown-toggle" data-toggle="dropdown">
					 
      <div class="image">
          <img src="${pageContext.request.contextPath}/img/avatar3.png" class="img-circle elevation-2" alt="User Image"
          style="opacity:.8">
        </div>
      ${person.name }
    
    </div>
    <ul class="dropdown-menu dropdown-menu-right" role="menu">
		
		<li><a href="findByIdApply.do?sqId=${person.jobId }" class="nav-link">
			<i class="fa fa-circle"></i>
				<span>&nbsp;&nbsp;申请历史</span></a></li>
	</ul>
				</c:otherwise>
	</c:choose>
     
      </li>
		</ul>			
  </nav>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
   <a href="#" class="brand-link">
      <img src="${pageContext.request.contextPath}/img/logo.png"  alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
           style="background-color: white;">
      <span class="brand-text font-weight-light">恒&nbsp;赛&nbsp;特</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user panel (optional) -->
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
    
        <div class="image">
          <img src="${pageContext.request.contextPath}/img/erp.png" class="img-circle elevation-2" alt="User Image"
          style="opacity:.8">
        </div>
        <div class="info">
          <a href="#" class="d-block">ERP-项目配置管理</a>
        </div>
      </div>

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <li class="nav-item has-treeview menu-open">
           
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="findByOrdName.do" class="nav-link ">
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p>到期列表</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="listApply.do" class="nav-link ">
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p>待审核</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="select.do" class="nav-link">
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p>项目表</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="tologin.do" class="nav-link">
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p>退出系统</p>
                </a>
              </li>
            </ul>
          </li>
      
         
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0 text-dark">试用码审核表单</h1>
          </div><!-- /.col -->
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="findByOrdName.do">Home</a></li>
              <li class="breadcrumb-item active">试用码审核表单</li>
            </ol>
          </div><!-- /.col -->
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content-header -->

 <div  style="width: 70%;margin-left: auto; margin-right: auto;">

                            <form  action="addTrialCode.do">
                            <div class="card-body">
                            <div class="form-group" style="display: none;">
                                    <label for="user-phone">id：</label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="state" name="state" value="1" style="display: none;">
                                         <input class="form-control" type="text" id="id" name="id" value="${applyBean.id }" readonly="true">
                                         <input class="form-control" type="text" id="applyId" name="applyId" value="${applyBean.applyId }" readonly="true">
                                    </div>
                                </div>
                            
                                 <div class="form-group">
                      <label for="user-phone">项目编号：</label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="ordId" name="ordId" value="${applyBean.ordId }" readonly="true">
                                    </div>
                                </div>
                                 <div class="form-group">
                                   <label for="user-phone">项目名称：</label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="ordName" name="ordName" value="${applyBean.ordName }" readonly="true">
                                    </div>
                                </div>
                                 <div class="form-group">
                                    <label for="user-phone">设备名称：</label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="equipment" name="equipment" value="${applyBean.orderName }" readonly="true">
                                    </div>
                                </div>
                                 <div class="form-group">
                                    <label for="user-phone">机器码： </label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="machineCode" name="machineCode" value="${applyBean.machineCode }" readonly="true">	
                                   		<span id="sqidSpan"></span>
                                    </div>
                                </div> 
                            
                                <div class="form-group">
                                    <label for="user-name">申请人id: </label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="sqid" name="sqid" value="${applyBean.sqId }" readonly="true">	
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="user-email">申请人姓名:</label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="sqname" name="sqname" value="${applyBean.sqName }" readonly="true">	
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="user-phone">申请原因:</label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="sqreason" name="sqreason" value="${applyBean.sqReason }" readonly="true">	
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="user-name">申请时间: </label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="sqtime" name="sqtime" value="${sqtime }" readonly="true">	
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="user-name">使用地点: </label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="local" name="local" value="${applyBean.local }" readonly="true">	
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="user-name">设备类型: </label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="type" name="type" value="${applyBean.type }" readonly="true">	
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="user-name">是否授权: </label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="authorization" name="authorization" value="${applyBean.authorization }" readonly="true">	
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="user-name">操作系统: </label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="system" name="system" value="${applyBean.system }" readonly="true">	
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="user-name">地址: </label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="address" name="address" value="${applyBean.address }" readonly="true">	
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="user-name">试用版本: </label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="version" name="version" value="${applyBean.version }" readonly="true">	
                                    </div>
                                </div>
<!-- ---------------------------------------------审核人信息--------------------------------------------------- -->
                                   
                                   
                                <div class="form-group">
                                    <label for="user-phone">审核人id：</label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="shid" name="shid" value="${person.jobId}" readonly="true" required>
                                    	
                                    </div>
                                </div>
                                 <div class="form-group">
                                    <label for="user-phone">审核人姓名：</label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="shname" name="shname"  value="${person.name}" readonly="true" required>
                                    </div>
                                </div>
                                 <div class="form-group">
                                    <label for="user-phone">试用时长： </label>
                                    <div class="am-u-sm-9">
                                    <select id="shichang" name="shichang" class="form-control">
				                      <option value="30" selected="selected">1个月</option>
										  	<option value="60">2个月</option>
										  	<option value="90">3个月</option>
										  	<option value="180">6个月</option>
				                    </select>
                                         	
                                    </div>
                                </div>
                            
                                <div class="form-group">
                                    <label for="user-name">审核时间: </label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" id="shtime" name="shtime"  type="text" value="<%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())%>" readonly="readonly"></input>
                                    </div>
                                </div>
                                
                                  <div class="form-group">
                                    <label for="user-phone">备注:</label>
                                    <div class="am-u-sm-9">
                                         <input class="form-control" type="text" id="remark" name="remark" >	
                                    </div>
                                </div>
                        </div>
                                        <div class="card-footer">
                  
                    <button id="submit" type="submit" class="btn btn-info">提交</button>
                    <button id="reset" type="reset" class="btn btn-default float-right">重置</button>
                </div>
                                
                            </form>
                            
                            </div>
                        </div>
					</div>
    <script src="./js/jquery.min.js"></script>
    <script src="./js/amazeui.min.js"></script>
    <script src="./js/app.js"></script>
 
</body>

</html>