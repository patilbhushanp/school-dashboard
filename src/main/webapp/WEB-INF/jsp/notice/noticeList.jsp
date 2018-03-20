	<jsp:include page="../header/header.jsp" />
	<jsp:include page="../navigator/navigator.jsp" />
		<div class="wrapper wrapper-content">
			<div class="row">
				<div class="col-lg-12 ibox-content" id="ibox-content">
					<table id="noticeListTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
						<thead>
							<tr>
								<th>Meeting Date</th>
								<th>Meeting For</th>
								<th>Subject</th>
								<th>Contact Person</th>
								<th>Attendance Count</th>
								<th>Details</th>
							</tr>
						</thead>
					</table>
				</div>
			</div>				
		</div>
<jsp:include page="../include_js/include_js.jsp" />
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap.min.js"></script>

<script src="/js/notice/noticeList.js"></script>
		
<jsp:include page="../footer/footer.jsp" />