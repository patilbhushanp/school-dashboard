	<jsp:include page="../header/header.jsp" />
	<jsp:include page="../navigator/navigator.jsp" />
		<div class="wrapper wrapper-content">
			<div class="row">
				<div class="col-lg-12 ibox-content" id="ibox-content">
					<div class="col-lg-12 pull-left"><h3 class="title">Enquiry</h3></div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12 ibox-content">
					<form class="form-horizontal">
						<div class="form-group"><label class="col-lg-2 control-label">Email</label>
							<div class="col-lg-9">
								<input type="email" placeholder="Email" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-2 control-label">Subject</label>
							<div class="col-lg-9">
								<input type="text" placeholder="Subject" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<div class="col-lg-offset-2 col-lg-10">
								<label class="radio-inline"><input type="radio" name="enquiryType" value="New Admission" checked >New Admission</label>
								<label class="radio-inline"><input type="radio" name="enquiryType" value="Fee Related Queries">Fee Related Queries</label>
								<label class="radio-inline"><input type="radio" name="enquiryType" value="Other">Other</label>
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-2 control-label">Enquiry Details:</label>
							<div class="col-lg-9">
								<textarea class="form-control" rows="15" id="enquiryDetails" name="enquiryDetails"></textarea>
							</div>
						</div>
						<div class="form-group">
							<div class="col-lg-offset-2 col-lg-10">
							<button class="btn btn-sm btn-white" type="submit">Submit</button>
							</div>
						</div>

					</form>
				</div>
			</div>
		</div>
<jsp:include page="../include_js/include_js.jsp" />

<script src="js/plugins/blueimp/jquery.blueimp-gallery.min.js"></script>

<script src="/js/gallery/galleryDisplay.js"></script>

<jsp:include page="../footer/footer.jsp" />