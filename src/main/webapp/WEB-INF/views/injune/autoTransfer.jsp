<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if IE 9 ]><html class="ie ie9" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
<%@ include file="/WEB-INF/views/common/setting.jsp" %>
<head>
  <!-- Basic Page Needs -->
  <meta charset="utf-8">
  <title>Page left sidebar - Invention | Creative Responsive Theme</title>
  <meta name="description" content="Invention Theme for corporate and creative sites, responsive and clean layout, more than color skins">
  <meta name="author" content="Jozoor team">

  <!-- Mobile Specific Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

  <!-- Main Style -->
	<script type="text/javascript">
  
  	$(function(){
  		$("#click").click(function() {
  			alert("INSERT INTO auto_transfer(auto_transfer_id, account ,auto_transfer_account, auto_transfer_type , auto_transfer_date,auto_transfer_auto_balance, auto_transfer_cycle , auto_transfer_register_date,auto_transfer_expiration_date, auto_transfer_cancel_date, auto_transfer_place, auto_transfer_status,auto_transfer_auto_last_datevalues(1,'110-304-22032', '110-220-01010', '적금' ,  '2022-10-06', 200000, '1달' , '2022-09-06', '2022-10-06','2025-09-06', '국민주택청약' ,'진행중', '2022-10-06' );");
		})
		
  	})
  </script>
  
  <!--[if lt IE 9]>
      <script src="js/html5.js"></script>
  <![endif]-->
  
  <!-- Favicons -->
  <link rel="shortcut icon" href="images/favicon.ico">
  
</head>
<body>

  <div id="wrap" class="boxed">
  
   <header>
         <%@ include file="/WEB-INF/views/common/header.jsp" %>
      </header>
   
   <div class="page-title">
     <div class="container clearfix">
       
       <div class="sixteen columns"> 
        <h1>자동이체</h1>
       </div>
       
     </div><!-- End Container -->
   </div><!-- End Page title -->
   
   <!-- Start main content -->
   <div class="container main-content clearfix">
   
    
   <!-- Start Sidebar Widgets -->
   <div class="five columns sidebar bottom-3">
   
     <!-- Search Widget -->
     <div class="widget search">
       <h3 class="title bottom-1">Search</h3><!-- Title Widget -->
       <form action="#">
         <input type="text" class="text-search" value="Search in blog" onBlur="if(this.value == '') { this.value = 'Search in blog'; }" 
         onfocus="if(this.value == 'Search in blog') { this.value = ''; }" />
         <input type="submit" value="" class="submit-search" />
       </form>
     </div>
     <!-- End -->
     
     <!-- Categories Widget -->
     <div class="widget categories">
       <h3 class="title bottom-1">자동이체</h3><!-- Title Widget -->
       <ul class="arrow-list">
         <li><a href="${path}/autoTransfer.do">자동이체</a></li>
         <li><a href="${path}/autoTransferRegistration.do">자동이체등록</a></li>
         <li><a href="${path}/autoTransferList.do">자동이체결과조회</a></li>
         
       </ul><!-- End arrow-list -->
     </div>
     <!-- End -->
     
     <!-- Text Widget -->
     <!-- End -->
     
     
     <!-- Latest Tweets Widget -->
     <div class="widget">
       <h3 class="title bottom-1">
       <i class="icon-headphones s-30"></i>
       고객센터</h3><!-- Title Widget -->
       <p>
          <br>1232-2132<br>
       </p>
     </div>
     <!-- End -->
     
     
     <!-- Video Widget -->
     <div class="widget">
       <h3 class="title bottom-1"></h3><!-- Title Widget -->
       <!-- Youtube Video -->
        <div class="video-wrap widescreen">
        </div><!-- End video wrap -->
        <!-- End Youtube -->
     </div>
     <!-- End -->
   
   </div><!-- End Sidebar Widgets -->
   
   
   <!-- Start Posts -->
     <div class="eleven columns bottom-3">
     
      <!-- ==================== Single Post ==================== -->
      <div class="post single style-1">
      
      <h3 class="title bottom-1" img src="${path}/resources/images/img/portfolio/이체1.png"></h3><!-- Title Post -->
       
      <!-- Start main content -->
   <div class="container main-content clearfix">
    
    <div class="portfolio bottom-3">
    
    <div class="sixteen columns">  
      <div class="title clearfix" id="options">
        <ul id="filters" class="option-set clearfix" data-option-key="filter">
        <img src="${path}/resources/images/img/portfolio/자동이체등록여부.PNG" , onclick="alert('INSERT INTO account_transfer(transfer_id, account,transfer_sender_account, balance, deposit_and_withdrawal, transfer_date,transfer_withdrawal_comment,transfer_deposit_comment, trnasfer_account_holder)VALUES(1 ,'111-33-22222' , '111-22-42322' ,5000000, '입금', '2022-10-05', '백인준' , '백인준', '백인준');');return false;"/>
         <input type="button" id="click" value="sql" style="margin:auto; align=center;">
        </ul>
      </div>
    </div> <!-- End options -->
    
    <div class="clearfix"></div>
    
    <div id="contain"> 
    
    <!-- =================================================== -->
     

    </div><!-- End contain-->
    
    </div><!-- End portfolio -->
    
   </div><!-- <<< End Container >>> -->

      
     </div> 
     <!-- ==================== End Single Post  ==================== -->
     
     
     
   </div><!-- End Posts -->  
   
   <div class="clearfix"></div>
    
   </div><!-- <<< End Container >>> -->
   
   <footer>
   <%@ include file="/WEB-INF/views/common/footer.jsp"%>
   </footer>
  
  </div><!-- End wrap -->
  

    
</body>
</html>