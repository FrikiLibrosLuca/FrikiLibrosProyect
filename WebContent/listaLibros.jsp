<%@ include file ="menu.jsp" %>
   
    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">FrikiLibros</h1>
            </div>
            <div>
                <c:forEach var="libro" items="${listadoLibros}">
                    <section class="col-lg-3 col-md-4 col-sm-6 elementoLibro">
                        <figure>
                        <a href="<c:url value='Servlet?opcion=buscarLibro&isbn=${libro.isbn}'/>">
                        		<img src='${libro.foto}' />
                        	</a>
                            <figcaption>
                                "${libro.titulo}"
                            </figcaption>
                        </figure>
                        <div class="col-lg-2">
                        	<c:if test="${privilegio}">
                        		<a href="<c:url value='Servlet?opcion=eliminarLibro&isbn=${libro.isbn}'/>">
									<p align="right">
										<button type="button" class="btn btn-danger" class="botonEliminar">Eliminar</button>
									</p>
								</a>	
					        	<!--<jsp:include page="botonEliminar.jsp"/>-->
					        	<!--<jsp:include page="botonModificar.jsp"/>-->
					        	<a href="<c:url value='Servlet?opcion=insertarLibro&isbn=${libro.isbn}'/>">
									<p align="right">
										<button type="button" class="btn btn-primary" class="botonModificar">Modificar</button>
									</p>
								</a>
					        </c:if>
                        </div>
                    </section>
                </c:forEach>
            </div>
        </div>
    </div>

<%@ include file ="footer.html" %>
