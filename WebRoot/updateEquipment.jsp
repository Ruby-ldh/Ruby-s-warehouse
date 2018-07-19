<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Amaze UI Admin index Examples</title>
    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no">  

    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="icon" type="image/png" href="i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <link rel="stylesheet" href="css/amazeui.min.css" />
    <link rel="stylesheet" href="css/admin.css">
    <link rel="stylesheet" href="css/app.css">
    
    <style type="text/css">
    .msg{ font-size: 13px; }
 	.onError{ color: red; }
    </style>
    
    
</head>

<body data-type="generalComponents">


 
<!-- -------------------------------------------------头部结束---------------------------------------------------------------------------------------------- -->
       

        <div class="tpl-content-wrapper">
            
           <div class="am-breadcrumb">
                
                
            </div>
               
            
            <div class="tpl-portlet-components">
                <div class="portlet-title">
                    <div class="caption  bold">
                        
                    <a href="findByOrdName.do" class="am-icon-home">首页</a>
                    </div>
                    <div class="caption font-green bold">
                        <span class="am-icon-code"></span> 修改设备
                    </div>
                    
          </div>
                <div class="tpl-block ">

                    <div class="am-g tpl-amazeui-form">

                        <div class="am-u-sm-12 am-u-md-9">
                            <form class="am-form am-form-horizontal" action="addTrialCode.do">
                            
                                 <div class="am-form-group">
                                    <label for="user-phone" class="am-u-sm-3 am-form-label">项目编号：</label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="ordId" name="ordId" value="${findByOrderId.ordId }" readonly="true">
                                    </div>
                                </div>
                                 <div class="am-form-group">
                                    <label for="user-phone" class="am-u-sm-3 am-form-label">项目名称：</label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="ordName" name="ordName" value="${findByOrderId.xmName }" readonly="true">
                                    </div>
                                </div>
                                 <div class="am-form-group">
                                    <label for="user-phone" class="am-u-sm-3 am-form-label">设备名称：</label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="orderId" name="orderId" value="${findByOrderId.orderId }" readonly="true">
                                    </div>
                                </div>
                                 <div class="am-form-group">
                                    <label for="user-phone" class="am-u-sm-3 am-form-label">机器码： </label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="machineCode" name="machineCode" value="${findByOrderId.machineCode }" readonly="true">	
                                   		<span id="sqidSpan"></span>
                                    </div>
                                </div> 
                                 <div class="am-form-group">
                                    <label for="user-phone" class="am-u-sm-3 am-form-label">试用码： </label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="code" name="code" value="${findByOrderId.code }" >	
                                   		<span id="sqidSpan"></span>
                                    </div>
                                </div> 
                            
                                
                                <div class="am-form-group">
                                    <label for="user-name" class="am-u-sm-3 am-form-label">使用地点: </label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="local" name="local" value="${findByOrderId.local }" >	
                                    </div>
                                </div>
                                <div class="am-form-group">
                                    <label for="user-name" class="am-u-sm-3 am-form-label">设备类型: </label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="type" name="type" value="${findByOrderId.type }" >	
                                    </div>
                                </div>
                                <div class="am-form-group">
                                    <label for="user-name" class="am-u-sm-3 am-form-label">是否授权: </label>
                                    <div class="am-u-sm-9">
                                        
                                    <select id="authorization" name="authorization">
                                         	<option value="${findByOrderId.authorization}">false</option>
                                         	<option value="0" selected="selected">false</option>
										  	<option value="1" >true</option>
                                         </select>
                                    </div>
                                </div>
                                <div class="am-form-group">
                                    <label for="user-name" class="am-u-sm-3 am-form-label">操作系统: </label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="system" name="system" value="${findByOrderId.system }" >	
                                    </div>
                                </div>
                                <div class="am-form-group">
                                    <label for="user-name" class="am-u-sm-3 am-form-label">地址: </label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="address" name="address" value="${findByOrderId.address }">	
                                    </div>
                                </div>
                                <div class="am-form-group">
                                    <label for="user-name" class="am-u-sm-3 am-form-label">试用版本: </label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="version" name="version" value="${findByOrderId.version }">	
                                    </div>
                                </div>
                                <div class="am-form-group">
                                    <label for="user-name" class="am-u-sm-3 am-form-label">到期时间: </label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="expirationTime" name="expirationTime" value="${findByOrderId.expirationTime }">	
                                    </div>
                                </div>
                                <div class="am-form-group">
                                    <label for="user-name" class="am-u-sm-3 am-form-label">申请人id: </label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="applicantUserId" name="applicantUserId" value="${findByOrderId.applicantUserId }">	
                                    </div>
                                </div>

                                <div class="am-form-group">
                                    <label for="user-email" class="am-u-sm-3 am-form-label">申请人姓名:</label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="applicantUserName" name="applicantUserName" value="${findByOrderId.applicantUserName }">	
                                    </div>
                                </div>

                                <div class="am-form-group">
                                    <label for="user-phone" class="am-u-sm-3 am-form-label">申请原因:</label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="reason" name="reason" value="${findByOrderId.reason }">	
                                    </div>
                                </div>

                                <div class="am-form-group">
                                    <label for="user-name" class="am-u-sm-3 am-form-label">申请时间: </label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="applicantUserTime" name="applicantUserTime" value="${findByOrderId.applicantUserTime }">	
                                    </div>
                                </div>
<!-- ---------------------------------------------审核人信息--------------------------------------------------- -->
                                   
                                   
                                <div class="am-form-group">
                                    <label for="user-phone" class="am-u-sm-3 am-form-label">审核人id：</label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="auditorUserId" name="auditorUserId" value="${findByOrderId.auditorUserId}">
                                    	
                                    </div>
                                </div>
                                 <div class="am-form-group">
                                    <label for="user-phone" class="am-u-sm-3 am-form-label">审核人姓名：</label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="auditorUserName" name="auditorUserName"  value="${findByOrderId.auditorUserName}">
                                    </div>
                                </div>
                                 <div class="am-form-group">
                                    <label for="user-phone" class="am-u-sm-3 am-form-label">试用时长： </label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="probationLength" name="probationLength" value="${findByOrderId.probationLength}"> 
                                    </div>
                                </div>
                            
                                <div class="am-form-group">
                                    <label for="user-name" class="am-u-sm-3 am-form-label">审核时间: </label>
                                    <div class="am-u-sm-9">
                                         <input id="auditorTime" name="auditorTime"  type="text" value="${findByOrderId.auditorTime }">
                                    </div>
                                </div>
                                
                                  <div class="am-form-group">
                                    <label for="user-phone" class="am-u-sm-3 am-form-label">备注:</label>
                                    <div class="am-u-sm-9">
                                         <input type="text" id="remark" name="remark" value="${findByOrderId.remark}">	
                                    </div>
                                </div>
                                <div class="am-form-group">
                                    <label for="user-phone" class="am-u-sm-3 am-form-label">正式版本状态:</label>
                                    <div class="am-u-sm-9">
                                         <%-- <input type="text" id="state" name="state" value="${findByOrderId.state}"> --%>	
                                         <select id="state" name="state">
                                         	<option value="${findByOrderId.state}">false</option>
                                         	<option value="0" selected="selected">false</option>
										  	<option value="1" >true</option>
                                         </select>
                                    </div>
                                </div>
                                
                                <div class="am-form-group">
                                    <div class="am-u-sm-9 am-u-sm-push-3">
                                        <button type="submit" class="am-btn am-btn-primary">修改完成</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    <script src="./js/jquery.min.js"></script>
    <script src="./js/amazeui.min.js"></script>
    <script src="./js/app.js"></script>
    <script type="text/javascript">
/*     function bianhao(obj){
		
		var reg=/\d{1,8}$/;
		if(!reg.test(obj)){
			$("#sqidSpan").html("编号输入有误！！");
			$("#submit").attr("disabled",true);
		}
		else{
			$("#sqidSpan").html("");
			$("#submit").removeAttr("disabled");
		}
	}
 */
   
    $(function(){
    	/* alert("sssssss"); */
    	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	/* var a=sdf.format(new Date()); */
    	alert(new Date()); 
    }) 
  
    </script>
</body>

</html>