<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
            <h1 class="m-0 text-dark">设备添加表单</h1>
          </div><!-- /.col -->
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="findByOrdName.do">Home</a></li>
              <li class="breadcrumb-item active">设备添加表单</li>
            </ol>
          </div><!-- /.col -->
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content-header -->

<!-- -------------------------------------------------头部结束---------------------------------------------------------------------------------------------- -->
  <div  style="width: 70%;margin-left: auto; margin-right: auto;">

              
                            <form  action="addEquipment.do" method="get">
                             <div class="card-body">
                             <div class="form-group">
                                    <label for="user-phone">项目名称：</label>
                                    <div class="am-u-sm-9">
                                      
							 <input class="form-control" type="text" id="xmName" name="xmName" value="${xmName }" readonly="true" required>
                                    </div>
                                </div>
                                 <div class="form-group">
                                    <label for="user-phone">项目编号：</label>
                                    <div class="am-u-sm-9 " >
                                       
							 <input class="form-control" type="text" id="ordId" name="ordId" placeholder="项目编号" value="${ordId }" readonly="true" required>
                                    </div>
                                </div>
                                 <div class="form-group">
                                    <label for="user-phone">设备名称：</label>
                                    <div class="am-u-sm-9 " >
                                       
							 <input class="form-control" type="text" id="orderName" name="orderName" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')" placeholder="设备名称" required>
                                    </div>
                                </div>
                                 
                                 <div class="form-group">
                                    <label for="user-phone">机器码：</label>
                                    <div class="am-u-sm-9 " >
                                       
							 <input class="form-control" type="text" id="machineCode" name="machineCode" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')" placeholder="机器码" required>
                                    </div>
                                </div>
                                
                                 <div class="form-group">
                                    <label for="user-phone">使用地点：</label>
                                    <div class="am-u-sm-9 " >
                                       
							 <input class="form-control" type="text" id="local" name="local" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')" placeholder="使用地点" >
                                    </div>
                                </div>
                                
                                 <div class="form-group">
                                    <label for="user-phone">设备类型：</label>
                                    <div class="am-u-sm-9 " >
                                       <input class="form-control" type="text" list="type"  id="type1" name="type1"  onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
											<datalist  id="type" name="type">
											  <option value="工控机">
											  <option value="电脑">
											  <option value="大屏幕">
											  <option value="摄像机">
											 
											</datalist>
                                    </div>
                                </div>
                               
                                 <div class="form-group">
                                    <label for="user-phone">是否需要授权(安装我们程序，并且需要使用加密狗的设备，选是)：</label>
                                    <div class="am-u-sm-9 " >
                                     
				                    <select id="authorization" name="authorization" class="form-control">
				                      <option value="0" selected="selected">否</option>
										<option value="1" >是</option>
				                    </select>
                                    </div>
                                </div>
                                
                                 <div class="form-group">
                                    <label for="user-phone">操作系统：</label>
                                    <div class="am-u-sm-9 " >
                                       
							 <input class="form-control" type="text" id="system" name="system" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')" placeholder="操作系统" >
                                    </div>
                                </div>
                                 <div class="form-group">
                                    <label for="user-phone">ip地址：</label>
                                    <div class="am-u-sm-9 " >
                                       
							 <input class="form-control" type="text" id="address" name="address" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')" placeholder="地址" >
                                    </div>
                                </div>
                                
                                 <div class="form-group">
                                    <label for="user-phone">试用版本：</label>
                                    <div class="am-u-sm-9 " >
                                       
							 <input class="form-control"  type="text" id="version" name="version" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')" placeholder="试用版本" >
                                    </div>
                                </div>
                                
                                 <div class="form-group" style="display: none;">
                                    <label for="user-phone">正式版本状态：</label>
                                    <div class="am-u-sm-9 " >
                                       <select  id="state" name="state">
										  	<option value="0" selected="selected">否</option>
										  	<option value="1" >是</option>
										  
										</select>
                                    </div>
                                </div> 
                                
                                <div class="form-group">
                                    <label for="user-phone">设备添加人姓名：</label>
                                    <div class="am-u-sm-9 " >
                                       
							 <input class="form-control"  type="text" id="addPersonName" name="addPersonName" value="${person.name }" readonly="readonly">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="user-phone">设备添加人id：</label>
                                    <div class="am-u-sm-9 " >
                                       
							 <input class="form-control"  type="text" id="addPersonId" name="addPersonId" value="${person.jobId }" readonly="readonly">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="user-phone">设备添加时间：</label>
                                    <div class="am-u-sm-9 " >
                                       
							 <input class="form-control"  type="text" id="addTime" name="addTime" value="<%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())%>" readonly="readonly">
                                    </div>
                                </div>
                                <div class="form-group" style="display: none;">
                                    <label for="user-phone">邮件状态：</label>
                                    <div class="am-u-sm-9 " >
                                       
							 <input class="form-control"  type="text" id="mailState" name="mailState" value="0" readonly="readonly">
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
    
    <script type="text/javascript">
  
    $("#submit").click(function(){
    		
    		
    	 if($("#machineCode").val().length!=8){
        	alert("请输入机器码,机器码长度为八位数，，请重置。。。。。");
            $("#machineCode").val("");
            return false;
        }else{

        }
    	
    })
    

    </script>
</body>

</html>