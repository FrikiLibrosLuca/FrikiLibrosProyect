<%@ include file="menu.jsp"%>

<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">FrikiLibros</h1>
		</div>
		<div class="col-lg-4">
			<c:if test="${resultado}">
				<div class="panel panel-red">
					<div class="panel-heading">Error:</div>
					<div class="panel-body">
						<p>${mensaje}</p>
					</div>
					<div class="panel-footer"> </div>
				</div>
			</c:if>

			<c:if test="${resultado} eq false">
				<div class="panel panel-green">
					<div class="panel-heading">¡Éxito!</div>
					<div class="panel-body">
						<p>${mensaje}</p>
					</div>
					<div class="panel-footer"> </div>
				</div>				
			</c:if>			
		</div>
	</div>
</div>

<%@ include file="footer.html"%>
